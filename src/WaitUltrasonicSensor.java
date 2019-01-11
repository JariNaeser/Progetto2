import lejos.nxt.*;

public class WaitUltrasonicSensor extends WaitAnalogSensor{
	
	private UltrasonicSensor sonic;
	
	public WaitUltrasonicSensor(UltrasonicSensor sonic){
		this.sonic = sonic;
	}
	
	public void wait(){
		while(isFinished()){
			
		}
	}
	
	public boolean isFinished(){
		boolean finished = false;
		if(bigger){
			if(sonic.getDistance() > value){
				finished = true;
			}
		}else{
			if(sonic.getDistance() < value){
				finished = true;
			}
		}
		return finished;
	}
	
	public void beginWait(){
		wait();
	}
}