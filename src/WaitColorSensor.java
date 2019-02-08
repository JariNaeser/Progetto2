import lejos.nxt.*;
import lejos.robotics.*;

public class WaitColorSensor{
	
	private ColorSensor cs;
	
	public WaitColorSensor(ColorSensor cs){
		this.cs = cs;
	}
	
	public void myWait(int red, int green, int blue){
		while(isFinished(red, green, blue)){
			
		}
	}
	
	public boolean isFinished(int red, int blue, int green){
		Color c = cs.getColor();
		if(c.getRed() > red-10 && c.getRed() < red+10){
			if(c.getGreen() > green-10 && c.getGreen() < green+10){
				if(c.getBlue() > blue-10 && c.getBlue() < blue+10){
					return true;
				}
			}	
		}
		return false;
	}
}