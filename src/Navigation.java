import lejos.nxt.*;

public class Navigation{

	private char leftMotor = 'A';
	private char rightMotor = 'B';
	private int speed = 0;
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

	public int getMySpeed(){
		return this.speed;
	}

	public void setMySpeed(int speed){
		if(speed >= 0){
			this.speed = speed;
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
		switch(getLeftMotorPort()){
			case 'A':
				Motor.A.setSpeed((float)this.getMySpeed());
			case 'B':
				Motor.B.setSpeed((float)this.getMySpeed());
			case 'C':
				Motor.C.setSpeed((float)this.getMySpeed());
		}
		switch(getRightMotorPort()){
			case 'A':
				Motor.A.setSpeed((float)this.getMySpeed());
			case 'B':
				Motor.B.setSpeed((float)this.getMySpeed());
			case 'C':
				Motor.C.setSpeed((float)this.getMySpeed());
		}
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
				Motor.A.setSpeed((float)(this.getMySpeed() - this.getSteering()/2));
			case 'B':
				Motor.B.setSpeed((float)(this.getMySpeed() - this.getSteering()/2));
			case 'C':
				Motor.C.setSpeed((float)(this.getMySpeed() - this.getSteering()/2));
		}
		switch(getRightMotorPort()){
			case 'A':
				Motor.A.setSpeed((float)(this.getMySpeed() + this.getSteering()/2));
			case 'B':
				Motor.B.setSpeed((float)(this.getMySpeed() + this.getSteering()/2));
			case 'C':
				Motor.C.setSpeed((float)(this.getMySpeed() + this.getSteering()/2));
		}
	}

	public void right(int howMuch){
		switch(getLeftMotorPort()){
			case 'A':
				Motor.A.setSpeed((float)(this.getMySpeed() + this.getSteering()/2));
			case 'B':
				Motor.B.setSpeed((float)(this.getMySpeed() + this.getSteering()/2));
			case 'C':
				Motor.C.setSpeed((float)(this.getMySpeed() + this.getSteering()/2));
		}
		switch(getRightMotorPort()){
			case 'A':
				Motor.A.setSpeed((float)(this.getMySpeed() - this.getSteering()/2));
			case 'B':
				Motor.B.setSpeed((float)(this.getMySpeed() - this.getSteering()/2));
			case 'C':
				Motor.C.setSpeed((float)(this.getMySpeed() - this.getSteering()/2));
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