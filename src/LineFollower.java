import lejos.nxt.*;
import java.lang.Thread;
import javax.microedition.lcdui.Graphics;


public class LineFollower
{
	public LightSensor light;
	
	public LineFollower(int sensor){
		if(sensor == 1){			
			LightSensor light = new LightSensor(SensorPort.S1);
		}else if(sensor == 2){
			LightSensor light = new LightSensor(SensorPort.S2);
		}else if(sensor == 3){
			LightSensor light = new LightSensor(SensorPort.S3);
		}else if(sensor == 4){
			LightSensor light = new LightSensor(SensorPort.S4);
		}
	}
	
	public void main(String[] args)
	{
		LineFollower ln = new LineFollower(1);
		lineFollower(true, 100, 360);		
	}
	
	public void setMotorSpeed(char name, int speed){
		if(name == 'A'){
			Motor.A.setSpeed(speed);
		}else if(name == 'B'){
			Motor.B.setSpeed(speed);
		}else if(name == 'C'){
			Motor.C.setSpeed(speed);
		}
	}
	
	public void lineFollower(boolean flag, int minSpeed, int maxSpeed){
		while(flag){
			if(light.getLightValue()>50){
				setMotorSpeed('A', maxSpeed);
				setMotorSpeed('B', minSpeed);
			}else{
				setMotorSpeed('B', maxSpeed);
				setMotorSpeed('A', minSpeed);
			}
		}
	}
}