#
#	@author JariNaeser 
#	@version 5.12.2018
#	Questo script ha lo scopo di velocizzare il passaggio di file .java
#	su robot di tipo Lego NXT usando lejOS.
#	Uso: Creare l'alias nel file $profile nel seguente modo:
#	New-Alias -Name "compile" -Value "<Path dello script>"
#

if($args.Length -eq 1){
	$file = $args[0]
	if($file[0] -eq "." -and $file[1] -eq "\"){
		$file = $file.Substring(2, $file.Length - 2)	
	}
	if($file.Substring($file.Length - 5, 5) -eq ".java"){
    		$fileName = $file.Substring(0, $file.Length - 5);
	}else{
    		Write-Host "ERROR: Wrong file name, can't find .java extention."
    		exit
	}

	Write-Host "----------------------------------------"
	nxjc $file
	Write-Host $file "compiled.`t[1/3]"
	nxjlink -o $fileName".nxj" $fileName
	Write-Host $fileName".nxj created link.`t[2/3]" 
	nxjupload -r $fileName".nxj"
	Write-Host $fileName".nxj uploaded.`t[3/3]" 
	Write-Host "----------------------------------------"
}else{
	Write-Host "`nDevi immettere un file .java come parametro.`n"
}