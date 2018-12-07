import lejos.nxt.*;
import java.lang.Thread;
import javax.microedition.lcdui.Graphics;


public class LineAligner
{
	public LightSensor leftLight;
	
	public LightSensor rightLight;
	
	public char motorLeft = 'A';
	
	public char motorRight = 'B';
	
	public LineAligner(int leftSensor, int rightSensor, char left, char right){
		if(leftSensor == 1){			
			LightSensor leftLight = new LightSensor(SensorPort.S1);
		}else if(leftSensor == 2){
			LightSensor leftLight = new LightSensor(SensorPort.S2);
		}else if(leftSensor == 3){
			LightSensor leftLight = new LightSensor(SensorPort.S3);
		}else if(leftSensor == 4){
			LightSensor leftLight = new LightSensor(SensorPort.S4);
		}
		
		if(rightSensor == 1){			
			LightSensor rightLight = new LightSensor(SensorPort.S1);
		}else if(rightSensor == 2){
			LightSensor rightLight = new LightSensor(SensorPort.S2);
		}else if(rightSensor == 3){
			LightSensor rightLight = new LightSensor(SensorPort.S3);
		}else if(rightSensor == 4){
			LightSensor rightLight = new LightSensor(SensorPort.S4);
		}
		motorLeft = left;
		motorRight = right;
	}
	
	public void main(String[] args)
	{
		LineAligner ln = new LineAligner(1,2,'A','B');
		ln.lineAligner(true, 100, 360);
		Motor.A.forward();
		Motor.B.forward();
	}
	
	public void motorStop(char motor){
		if(motor == 'A'){
			Motor.A.stop();
		}else if(motor == 'B'){
			Motor.B.stop();
		}else if(motor == 'C'){
			Motor.C.stop();
		}
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
			if(leftLight.getLightValue()<45){
				motorStop(motorLeft);
			}
			if(rightLight.getLightValue()<45){
				motorStop(motorRight);
			}
			if(leftLight.getLightValue()<45 && rightLight.getLightValue()<45){
				flag = false;
			}
		}
	}
}