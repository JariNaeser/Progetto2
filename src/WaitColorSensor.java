import lejos.nxt.*;

public class WaitColorSensor extends Wait{
	
	private ColorLightSensor cs;
	
	private byte red = 0;
	
	private byte blue = 0;
	
	private byte green = 0;
	
	public WaitColorSensor(ColorLightSensor cs){
		this.cs = cs;
	}
	
	public void wait(){
		while(isFinished()){
			
		}
	}
	
	public boolean isFinished(){
		boolean finished = false;
		if(cs.getRed() > red-10 && cs.getRed() < red+10){
			if(cs.getGreen() > green-10 && cs.getGreen() < green+10){
				if(cs.getBlue() > blue-10 && cs.getBlue() < blue+10){
					finished = true;
				}
			}	
		}
		return finished;
	}
	
	public void beginWait(){
		wait();
	}
}