import lejos.nxt.*;
import java.lang.Thread;
import javax.microedition.lcdui.Graphics;


public class NXT
{
	/**
	* @param args
	*/
	public static void main(String[] args)
	{
		TouchSensor touch = new TouchSensor(SensorPort.S1);
		UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S3);
		Graphics g = new Graphics();
		try{
			LCD.drawString("Program 1", 2, 2);
			Thread.sleep(1000);
			LCD.clear();
			batteryDisplay(g);
			while (!touch.isPressed()) {
				// try again
			}
			while (touch.isPressed()) {
				// try again
			}
			LCD.drawString("Finished", 3, 4);
			Thread.sleep(1000);
			LCD.clear();
			while (!touch.isPressed()) {
				LCD.drawInt(light.getLightValue(), 4, 0, 0);
			}
			while (touch.isPressed()) {
				// try again
			}
			LCD.clear();
			while (!touch.isPressed()){
				LCD.drawInt(sonic.getDistance(), 0, 3);
			}
		}catch(InterruptedException ie){
			
		}
	}
	
	public static void batteryDisplay(Graphics g){
		g.drawLine(4,2,5,2);
		g.drawRect(3,3,3,8);
		g.fillRect(3,8-(int)(Battery.getVoltage())+3,4,(int)(Battery.getVoltage()));
	}
}