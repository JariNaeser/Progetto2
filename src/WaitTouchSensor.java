import lejos.nxt.*;

public class WaitTouchSensor{
	
	private TouchSensor touch;
	
	private byte action = 0;
	
	public WaitTouchSensor(TouchSensor touch){
		this.touch = touch;
	}
	
	public void myWait(int action){
		while(isFinished(action)){
			
		}
	}
	
	public boolean isFinished(int action){
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
}