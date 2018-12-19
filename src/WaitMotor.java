import lejos.nxt.*;

public class WaitMotor extends Wait{

	private int value = 0;
	private boolean rotations = false;
	private Motor motor;

	public Motor getMotor(){
		return this.motor;
	}

	public void setMotor(Motor motor){
		this.motor = motor;
	}

	public int getValue(){
		return this.value;
	}

	public void setValue(int value){
		if(value > 0){
			this.value = value;
		}
	}

	public boolean isRotations(){
		return this.rotations;
	}

	public void setRotations(boolean rotations){
		this.rotations = rotations;
	}

	public WaitMotor(Motor motor){
		setMotor(motor);
	}

	public void wait(){
		while(isFinished()){
			
		}
	}

	public boolean isFinished(){
		if(rotations){
			motor.rotate(value);
		}else{
			motor.rotate(value*360);
		}
		return true;
	}

	public void beginWait(){
		wait();
	}

	public static void main(String[] args){

	}
}