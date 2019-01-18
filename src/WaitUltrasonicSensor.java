import lejos.nxt.*;

public class WaitUltrasonicSensor{
	
	private UltrasonicSensor sonic;
	
	public WaitUltrasonicSensor(UltrasonicSensor sonic){
		this.sonic = sonic;
	}
	
	public void wait(boolean bigger, int value){
		while(isFinished(bigger, value)){
			
		}
	}
	
	public boolean isFinished(boolean bigger, int value){
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
}