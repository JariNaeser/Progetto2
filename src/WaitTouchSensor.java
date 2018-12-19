import lejos.nxt.*;

public class WaitTouchSensor extends WaitDigitalSensor{
	
	private TouchSensor touch;
	
	public WaitTouchSensor(TouchSensor touch){
		this.touch = touch;
	}
	
	public void wait(){
		while(isFinished()){
			
		}
	}
	
	public boolean isFinished(){
		boolean finished = false;
		if(action == 0){
			finished = touch.isPressed();
		}else if(action == 1){
			if(touch.isPressed()){
				while(touch.isPressed()){
				
				}
				finished = true;
			}
		}else{
			if(touch.isPressed()){
				while(touch.isPressed()){
				
				}
				finished = true;
			}
		}
	}
	
	public void beginWait(){
		startTime = System.currentTimeMillis();
		wait();
	}
}