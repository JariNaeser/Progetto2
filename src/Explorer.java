import lejos.nxt.*;

public class Explorer{
	private final char MOTOR_LEFT_PORT = 'A';
	private final char MOTOR_RIGHT_PORT = 'B';
	private Navigation navigator;
	private UltrasonicSensor us = new UltrasonicSensor(SensorPort.S3);
	private WaitUltrasonicSensor wus = new WaitUltrasonicSensor(us);
	private TouchSensor tsl = new TouchSensor(SensorPort.S2);
	private TouchSensor tsr= new TouchSensor(SensorPort.S4);
	private WaitTouchSensor wtsl = new WaitTouchSensor(tsl);
	private WaitTouchSensor wtsr = new WaitTouchSensor(tsr);
	private LightSensor ls = new LightSensor(SensorPort.S1);
	private WaitLightSensor wls = new WaitLightSensor(ls);

	public Explorer(){
		navigator = new Navigation(MOTOR_LEFT_PORT, MOTOR_RIGHT_PORT);
		navigator.setPower(80);
		
	}

	public static void main(String[] args){
		while(true){
			navigator.move();
			if(wus.isFinished(false, 30)){
				//Inserire cosa deve fare se è più vicino di 30 cm
			}
			if(wtsl.isFinished(0)){
				//gira a sinistra indietro
			}
			if(wtsr.isFinished(0)){
				//gira a destra indietro
			}
			if(wls.isFinished(false, 50)){
				//Si ferma 
			}
		}
	}
}