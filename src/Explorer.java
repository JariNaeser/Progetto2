import lejos.nxt.*;

public class Explorer{
	private static final char MOTOR_LEFT_PORT = 'A';
	private static final char MOTOR_RIGHT_PORT = 'B';
	private static final int DISTANCE = 30;
	private static Navigation navigator;
	private static UltrasonicSensor ultrasonicSensor = new UltrasonicSensor(SensorPort.S3);
	private static WaitUltrasonicSensor waitUltrasonicSensor = new WaitUltrasonicSensor(ultrasonicSensor);
	private static TouchSensor touchSensorLeft = new TouchSensor(SensorPort.S2);
	private static TouchSensor touchSensorRight = new TouchSensor(SensorPort.S4);
	private static WaitTouchSensor waitTouchSensorLeft = new WaitTouchSensor(touchSensorLeft);
	private static WaitTouchSensor waitTouchSensorRight = new WaitTouchSensor(touchSensorRight);
	private static LightSensor lightSensor = new LightSensor(SensorPort.S1);
	private static WaitLightSensor waitLightSensor = new WaitLightSensor(lightSensor);

	public Explorer(){
		navigator = new Navigation(MOTOR_LEFT_PORT, MOTOR_RIGHT_PORT);
		navigator.setPower(80);
	}

	public static void main(String[] args){
		try{
			navigator.move();
			while(true){
				if(waitUltrasonicSensor.isFinished(false, DISTANCE)){
					//Inserire cosa deve fare se è più vicino di 30 cm
					navigator.stop();
					navigator.setDirection('B');
					navigator.move();
					Thread.sleep(1500);
					navigator.stop();
					navigator.setDirection('F');
					navigator.right(20);
					Thread.sleep(2000);
					navigator.setPower(80);
				}
				if(waitTouchSensorLeft.isFinished(0)){
					//gira a sinistra indietro
					navigator.stop();
					navigator.setDirection('B');
					navigator.move();
					Thread.sleep(1500);
					navigator.stop();
					navigator.setDirection('F');
					navigator.left(20);
					Thread.sleep(2000);
					navigator.setPower(80);
				}
				if(waitTouchSensorRight.isFinished(0)){
					//gira a destra indietro
					navigator.stop();
					navigator.setDirection('B');
					navigator.move();
					Thread.sleep(1500);
					navigator.stop();
					navigator.setDirection('F');
					navigator.right(20);
					Thread.sleep(2000);
					navigator.setPower(80);
				}
				if(waitLightSensor.isFinished(false, 50)){
					//Si ferma 
					navigator.stop();
				}
			}
		}catch(InterruptedException ie){
			//Interrupted
		}
	}
}