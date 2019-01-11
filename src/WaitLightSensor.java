import lejos.nxt.*;

public class WaitLightSensor extends WaitAnalogSensor{
	
	private LightSensor light;
	
	public WaitLightSensor(LightSensor light){
		this.light = light;
	}
	
	public void wait(){
		while(isFinished()){
			
		}
	}
	
	public boolean isFinished(){
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
	
	public void beginWait(){
		wait();
	}
}