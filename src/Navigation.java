import lejos.nxt.*;

public class Navigation{

	private Motor leftMotor;
	private Motor rightMotor;
	private int power = 0;
	private int steering = 0;

	public Nagivation(char leftMotor, char rightMotor){
		leftMotor = new Motor(leftMotor);
		rightMotor = new Motor(rightMotor);
	}

	public int getPower(){
		return this.power;
	}

	public void setPower(byte power){
		if(power >= 0 && power <= 100){
			this.power = power;
		}
	}

	public int getSteering(){
		return this.steering;
	}

	public void setSteering(byte steering){
		if(steering > -128 && steering <= 128){
			this.steering = steering;
		}
	}

	public void start(){

	}

	public void left(byte howMuch){

	}

	public void right(byte howMuch){

	}

	public void stop(){
		
	}

	public static void main(String[] args){

	}
}