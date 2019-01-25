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
		if(bigger){
			if(light.getLightValue() > value){
				return true;
			}
		}else{
			if(light.getLightValue() < value){
				return true;
			}
		}
		return false;
	}
}