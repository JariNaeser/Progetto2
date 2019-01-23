import lejos.nxt.*;

public class MyMotor{

	private static char port = 'A';

	public char getPort(){
		return this.port;
	}

	public void setPort(char port){
		String s = port + "";
		port = s.toUpperCase().charAt(0);
		if(port == 'A' || port == 'B' || port == 'C'){
			this.port = port;
		}
	}

	public MyMotor(char port){
		setPort(port);
	}

	public static void main(String[] args){

	}
	
}