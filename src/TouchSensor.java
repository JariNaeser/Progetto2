import lejos.nxt.*;
import java.lang.Thread;


public class TouchSensor
{
	public TouchSensor touch;
	
	public TouchSensor touch1;
	
	public TouchSensor touch2;
	
	public TouchSensor touch3;
	
	public int port = 1;
	
	public TouchSensor(int port){
		this.port = port;
		if(port == 4){
			touch3 = new TouchSensor(SensorPort.S4);
		}else if(port == 3){
			touch2 = new TouchSensor(SensorPort.S3);
		}else if(port == 2){
			touch1 = new TouchSensor(SensorPort.S2);
		}else{
			touch = new TouchSensor(SensorPort.S1);
		}
	}
	
	public boolean isPressed(){
		if(port == 4){
			return touch3.isPressed();
		}else if(port == 3){
			return touch2.isPressed();
		}else if(port == 2){
			return touch1.isPressed();
		}else{
			return touch.isPressed();
		}
	}
	
	public boolean isReleased(){
		if(port == 4){
			return touch3.isReleased();
		}else if(port == 3){
			return touch2.isReleased();
		}else if(port == 2){
			return touch1.isReleased();
		}else{
			return touch.isReleased();
		}
	}
	
}