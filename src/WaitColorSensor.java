import lejos.nxt.*;
import lejos.robotics.*;

public class WaitColorSensor{
	
	/**
	* Sensore che l'utente passa per leggere i valori.
	*/
	private ColorSensor cs;
	
	public WaitColorSensor(ColorSensor cs){
		this.cs = cs;
	}
	
	/**
	* Questo metodo aspetta finché isFinished ritorna true.
	* @param int Valore della quantità di rossso.
	* @param int Valore della quantità di verde.
	* @param int Valore della quantità di blu.
	*/
	public void myWait(int red, int green, int blue){
		while(isFinished(red, green, blue)){
			
		}
	}
	
	/**
	* Questo metodo aspetta finché il valore del sensore non entra nel range definito dai parametri.
	* @param int Valore della quantità di rossso.
	* @param int Valore della quantità di verde.
	* @param int Valore della quantità di blu.
	*/
	public boolean isFinished(int red, int blue, int green){
		Color c = cs.getColor();
		if(c.getRed() > red-10 && c.getRed() < red+10){
			if(c.getGreen() > green-10 && c.getGreen() < green+10){
				if(c.getBlue() > blue-10 && c.getBlue() < blue+10){
					return true;
				}
			}	
		}
		return false;
	}
}