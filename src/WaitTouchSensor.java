import lejos.nxt.*;

public class WaitTouchSensor extends Wait{
	
	private TouchSensor touch;
	
	private byte action = 0;
	
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
		return finished;
	}
	
	public void beginWait(){
		wait();
	}
}