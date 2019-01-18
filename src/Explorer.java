import lejos.nxt.*;

public class Explorer{
	private final char MOTOR_LEFT_PORT = 'A';
	private final char MOTOR_RIGHT_PORT = 'B';
	private Navigation navigator;

	public Explorer(){
		navigator = new Navigation(MOTOR_LEFT_PORT, MOTOR_RIGHT_PORT);
		
	}

	public static void main(String[] args){

	}
}