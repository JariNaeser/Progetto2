import lejos.nxt.*;

public class WaitTouchSensor{
	
	private TouchSensor touch;
	
	private boolean pressed = false; 
	
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
		}else{
			if(pressed){
				finished = !touch.isPressed();
			}
			pressed = touch.isPressed();
		}
		return finished;
	}
}