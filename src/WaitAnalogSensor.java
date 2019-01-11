
public class WaitAnalogSensor() extends Wait{
	
	private boolean bigger = false;
	
	private byte value = 0;
	
	public WaitAnalogSensor(boolean bigger, byte value){
		this.bigger = bigger;
		this.value = value;
	}
	
	public boolean isBigger(){
		return bigger;
	}
	
	public boolean setBigger(boolean value){
		bigger = value;
	}
	
	public byte getValue(){
		return value;
	}
	
	public void setValue(byte value){
		this.value = value;
	}
	
	public void wait(){
		
	}
	
	public boolean isFinished(){
		
	}

	public void beginWait(){
		
	}
}