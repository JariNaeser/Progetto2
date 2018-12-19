import lejos.nxt.*;

public class Motor{

	private char port = 'A';
	private byte power = 0;
	private Motor motor;
	private boolean forward = true;

	public char getPort(){
		return this.port;
	}

	public void setPort(char port){
		port = Character.toUpperCase(port);
		if(port == 'A' || port == 'B' || port == 'C'){
			this.port = port;
		}
	}

	public byte getPower(){
		return this.power;
	}

	public void setPower(byte power){
		if(power >= 0 && power <= 255){
			this.power = power;
		}
	}

	public Motor getMotor(){
		return this.motor;
	}

	public void setMotor(Motor motor){
		this.motor = motor;
	}

	public boolean isForward(){
		return this.forward;
	}

	public void setForward(boolean forward){
		this.forward = forward;
	}

	public Motor(byte port){
		setPort(port);
	}

	public void start(){
		Motor.port.setSpeed(power);
		//To finish
	}

	public void stop(){
		Motor.port.stop();
	}

	public static void main(String[] args){

	}

	/*
	private static char port = 'A';
	private String direction = "forward";
	private String action = "constant";	
	private int power = 75;
	private boolean control = false;
	private double durationValue = 0.0;
	private String durationType = "unlimited";

	public Motor(char port, String direction, int power){
		setPort(port);
		setDirection(direction);
		setPower(power);
	}

	public void start(){
		if(durationType == "unlimited"){
			setDurationValue(0.0);
			setAction("constant");
			Motor.port.forward();
		}else if(durationType == "degrees"){
			Motor.port.rotate((int)durationValue);
		}else if(durationType == "rotations"){
			Motor.port.rotate((int)durationValue*360);
		}else if(durationType == "Seconds"){
			setAction("constant");
			long initTime = System.currentTimeMillis();
			while((System.currentTimeMillis() - initTime)/1000 < durationValue){
				Motor.port.forward();
			}
			Motor.port.stop();
		}
	}

	public void stop(){
		Motor.port.stop();
	}

	// Getter methods
	public char getPort(){
		return this.port;
	}

	public String getDirection(){
		return this.direction;
	}

	public String getAction(){
		return this.action;
	}

	public int getPower(){
		return this.power;
	}

	public boolean getControl(){
		return this.control;
	}

	public double getDurationValue(){
		return this.durationValue;
	}

	public String getDurationType(){
		return this.durationType;
	}

	// Setter methods
	public void setPort(char port){
		port = Character.toUpperCase(port);
		if(port == 'A' || port == 'B' || port == 'C'){
			this.port = port;
		}
	}

	public void setDirection(String direction){
		direction = direction.toLowerCase();
		if(direction == "forward" || direction == "backward"){
			if(this.direction != direction){
				Motor.port.reverseDirection();
			}
			this.direction = direction;
		}
	}

	public void setAction(String action){
		action = action.toLowerCase();
		if(action == "constant" || action == "rampup" || action == "rampdown"){
			this.action = action;
		}
	}

	public void setPower(int power){
		if(power >= 0 && power <= 100){
			this.power = power;
		}
	}

	public void setControl(boolean control){
		this.control = control;
	}

	public void setDurationValue(double durationValue){
		if(durationValue >= 0){
			this.durationValue = durationValue;
		}
	}

	public void setDurationType(String durationType){
		durationType = durationType.toLowerCase();
		if(durationType == "unlimited" || durationType == "degrees" || durationType == "rotations" || durationType == "seconds"){
			this.durationType = durationType;
		}
	}*/
}