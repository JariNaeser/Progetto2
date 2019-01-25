import lejos.nxt.*;

public class WaitSoundSensor{
	
	private SoundSensor sound;
	
	public WaitSoundSensor(SoundSensor sound){
		this.sound = sound;
	}
	
	public void myWait(boolean bigger, int value){
		while(isFinished(bigger, value)){
			
		}
	}
	
	public boolean isFinished(boolean bigger, int value){
		if(bigger){
			if(sound.readValue() > value){
				return true;
			}
		}else{
			if(sound.readValue() < value){
				return true;
			}
		}
		return false;
	}
}