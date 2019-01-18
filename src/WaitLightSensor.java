import lejos.nxt.*;

public class WaitLightSensor{
	
	private LightSensor light;
	
	public WaitLightSensor(LightSensor light){
		this.light = light;
	}
	
	public void myWait(boolean bigger, int value){
		while(isFinished(bigger, value)){
			
		}
	}
	
	public boolean isFinished(boolean bigger, int value){
		boolean finished = false;
		if(bigger){
			if(light.getLightValue() > value){
				finished = true;
			}
		}else{
			if(light.getLightValue() < value){
				finished = true;
			}
		}
		return finished;
	}
}