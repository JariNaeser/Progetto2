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
			switch(getLeftMotorPort()){
				case 'A':
					Motor.A.setSpeed((float)(this.getPower()*3.6));
				case 'B':
					Motor.B.setSpeed((float)(this.getPower()*3.6));
				case 'C':
					Motor.C.setSpeed((float)(this.getPower()*3.6));
			}
			switch(getRightMotorPort()){
				case 'A':
					Motor.A.setSpeed((float)(this.getPower()*3.6));
				case 'B':
					Motor.B.setSpeed((float)(this.getPower()*3.6));
				case 'C':
					Motor.C.setSpeed((float)(this.getPower()*3.6));
			}
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
			switch(getLeftMotorPort()){
				case 'A':
					Motor.A.forward();
				case 'B':
					Motor.B.forward();
				case 'C':
					Motor.C.forward();
			}
			switch(getRightMotorPort()){
				case 'A':
					Motor.A.forward();
				case 'B':
					Motor.B.forward();
				case 'C':
					Motor.C.forward();
			}
		}else{
			switch(getLeftMotorPort()){
				case 'A':
					Motor.A.backward();
				case 'B':
					Motor.B.backward();
				case 'C':
					Motor.C.backward();
			}
			switch(getRightMotorPort()){
				case 'A':
					Motor.A.backward();
				case 'B':
					Motor.B.backward();
				case 'C':
					Motor.C.backward();
			}
		}
	}

	public void left(int howMuch){
		switch(getLeftMotorPort()){
			case 'A':
				Motor.A.setPower(this.getPower() - this.getSteering()/2);
			case 'B':
				Motor.B.setPower(this.getPower() - this.getSteering()/2);
			case 'C':
				Motor.C.setPower(this.getPower() - this.getSteering()/2);
		}
		switch(getRightMotorPort()){
			case 'A':
				Motor.A.setPower(this.getPower() + this.getSteering()/2);
			case 'B':
				Motor.B.setPower(this.getPower() + this.getSteering()/2);
			case 'C':
				Motor.C.setPower(this.getPower() + this.getSteering()/2);
		}
	}

	public void right(int howMuch){
		switch(getLeftMotorPort()){
			case 'A':
				Motor.A.setPower(this.getPower() + this.getSteering()/2);
			case 'B':
				Motor.B.setPower(this.getPower() + this.getSteering()/2);
			case 'C':
				Motor.C.setPower(this.getPower() + this.getSteering()/2);
		}
		switch(getRightMotorPort()){
			case 'A':
				Motor.A.setPower(this.getPower() - this.getSteering()/2);
			case 'B':
				Motor.B.setPower(this.getPower() - this.getSteering()/2);
			case 'C':
		 		Motor.C.setPower(this.getPower() - this.getSteering()/2);
		}
	}

	public void stop(){
		switch(getLeftMotorPort()){
			case 'A':
				Motor.A.stop();
			case 'B':
				Motor.B.stop();
			case 'C':
				Motor.C.stop();
		}
		switch(getRightMotorPort()){
			case 'A':
				Motor.A.stop();
			case 'B':
				Motor.B.stop();
			case 'C':
		 		Motor.C.stop();
		}
	}
	
	public static void main(String[] args){

	}
}