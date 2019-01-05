public class Navigation{

	private Motor leftMotor;
	private Motor rightMotor;
	//Turning for what?
	private byte power = 0;
	private byte steering = 0;

	public Nagivation(char leftMotor, char rightMotor){
		leftMotor = new Motor(leftMotor);
		rightMotor = new Motor(rightMotor);
	}

	public byte getPower(){
		return this.power;
	}

	public void setPower(byte power){
		//No need for controls, it's a byte
		if(power >= 0){
			this.power = power;
		}
	}

	public byte getSteering(){
		return this.steering;
	}

	public void setSteering(byte steering){
		if(steering > -128 && steering <= 128){
			this.steering = steering;
		}
	}

	public void start(){

	}

	// public void left(){

	// }

	public void left(byte howMuch){

	}

	// public void right(){

	// }

	public void right(byte howMuch){

	}

	public void stop(){
		
	}

	public static void main(String[] args){

	}
}