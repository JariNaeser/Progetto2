import lejos.nxt.*;

public class Navigation{

	private Motor leftMotor;
	private Motor rightMotor;
	private int power = 0;
	private int steering = 0;
	private char direction = 'F';

	public Navigation(char leftMotor, char rightMotor){
		leftMotor = new Motor(leftMotor);
		rightMotor = new Motor(rightMotor);
		leftMotor.setPower(getPower());
		rightMotor.setPower(getPower());
	}

	public int getPower(){
		return this.power;
	}

	public void setPower(int power){
		if(power >= 0 && power <= 100){
			this.power = power;
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
		direction = Character.toUpperCase(direction);
		if(direction == 'F' || direction == 'B'){
			this.direction = direction;
		}
	}

	public void move(){
		if(getDirection() == 'F'){
			rightMotor.forward();
			leftMotor.forward();
		}else{
			rightMotor.backward();
			leftMotor.backward();
		}
	}

	public void left(int howMuch){
		leftMotor.setPower(getPower() - getSteering()/2);
		rightMotor.setPower(getPower() + getSteering()/2);
	}

	public void right(int howMuch){
		leftMotor.setPower(getPower() + getSteering()/2);
		rightMotor.setPower(getPower() - getSteering()/2);
	}

	public void stop(){
		leftMotor.stop();
		rightMotor.stop();
	}

	public static void main(String[] args){

	}
}