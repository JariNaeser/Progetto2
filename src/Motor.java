/*
	Mettere toLower a tutte le stringhe che definiscono le opzioni del motore. Es: Forward -> forward
	Coerenza con l'ide, guardare che con certe opzioni certe opzioni siano disattivate
*/
public class Motor{

	private char port = 'A';
	private String direction = "Forward";
	private String action = "Constant";	
	private int power = 75;
	private boolean control = false;
	private double durationValue = 0.0;
	private String durationType = "Unlimited";

	public Motor(char port, String direction, String action, int power, boolean control, double durationValue, String durationType){
		//Not all paremeters are needed in the constructor, remove if not needed.
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
		if(direction == "forward" || direction == "backward" || direction == "stop"){
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
	}
}