import lejos.nxt.*;
import static java.lang.Character.*;

public class MyMotor{

	private static char port = 'A';

	public char getPort(){
		return this.port;
	}

	public void setPort(char port){
		port = Character.toUpperCase(port);
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