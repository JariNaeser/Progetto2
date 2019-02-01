import lejos.nxt.*;



public class Tocco
{
	
	public static void Main(String[] args){
		TouchSensor touch = new TouchSensor(SensorPort.S1);
		while(!touch.isPressed()){

		}
	}
}