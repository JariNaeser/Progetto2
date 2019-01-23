import lejos.nxt.*;

public class Navigation{

	private char leftMotor = 'A';
	private char rightMotor = 'B';
	private int power = 0;
	private int steering = 0;
	private char direction = 'F';

	public Navigation(char leftMotor, char rightMotor){
		setMotorLeftPort(leftMotor);
		setMotorRightPort(rightMotor);
	}

	public char getLeftMotorPort(){
		return this.leftMotor;
	}

	public char getRightMotorPort(){
		return this.rightMotor;
	}

	public void setMotorLeftPort(char port){
		String mp = port + "";
		port = mp.toUpperCase().charAt(0);
		if(port == 'A' || port == 'B' || port == 'C'){
			leftMotor = port;
		}
	}

	public void setMotorRightPort(char port){
		String mp = port + "";
		port = mp.toUpperCase().charAt(0);
		if(port == 'A' || port == 'B' || port == 'C'){
			leftMotor = port;
		}
	}

	public int getPower(){
		return this.power;
	}

	public void setPower(int power){
		if(power >= 0 && power <= 100){
			this.power = power;
			Motor.getLeftMotorPort().setPower(this.getPower());
			Motor.getRightMotorPort().setPower(this.getPower());
		}
	}

	public int getSteering(){
		return this.steering;
	}

	public void setSteering(int steering){
		if(steering >= 0 && steering <= 128){
			this.steering = steering;
		}
	}

	public char getDirection(){
		return this.direction;
	}

	public void setDirection(char direction){
		String s = direction + "";
		direction = s.toUpperCase().charAt(0);
		if(direction == 'F' || direction == 'B'){
			this.direction = direction;
		}
	}

	public void move(){
		if(getDirection() == 'F'){
			Motor.getLeftMotorPort().forward();
			Motor.getRightMotorPort().forward();
		}else{
			Motor.getLeftMotorPort().backward();
			Motor.getRightMotorPort().backward();
		}
	}

	public void left(int howMuch){
		Motor.getLeftMotorPort().setPower(this.getPower() - this.getSteering()/2);
		Motor.getRightMotorPort().setPower(this.getPower() + this.getSteering()/2);
	}

	public void right(int howMuch){
		Motor.getLeftMotorPort().setPower(this.getPower() + this.getSteering()/2);
		Motor.getRightMotorPort().setPower(this.getPower() - this.getSteering()/2);
	}

	public void stop(){
		Motor.getLeftMotorPort().stop();
		Motor.getRightMotorPort().stop();
	}

	public static void main(String[] args){

	}
}