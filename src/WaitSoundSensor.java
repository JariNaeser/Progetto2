import lejos.nxt.*;

public class WaitSoundSensor extends WaitAnalogSensor{
	
	private SoundSensor sound;
	
	public WaitSoundSensor(SoundSensor sound){
		this.sound = sound;
	}
	
	public void wait(){
		while(isFinished()){
			
		}
	}
	
	public boolean isFinished(){
		boolean finished = false;
		if(bigger){
			if(sound.readValue() > value){
				finished = true;
			}
		}else{
			if(sound.readValue() < value){
				finished = true;
			}
		}
		return finished;
	}
	
	public void beginWait(){
		wait();
	}
}