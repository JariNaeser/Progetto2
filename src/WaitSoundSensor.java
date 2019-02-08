import lejos.nxt.*;

public class WaitSoundSensor{
	
	/**
	* Sensore che l'utente passa per leggere i valori.
	*/
	private SoundSensor sound;
	
	public WaitSoundSensor(SoundSensor sound){
		this.sound = sound;
	}
	
	/**
	* Questo metodo aspetta finché isFinished ritorna true.
	* @param boolean Definisce se il valore dev'essere più piccolo o più grande del secondo paramentro.
	* @param int Valore per terminare il wait.
	*/
	public void myWait(boolean bigger, int value){
		while(isFinished(bigger, value)){
			
		}
	}
	
	/**
	* Questo metodo ritorna true quando il valore raggiunge la soglia desiderata.
	* @param boolean Definisce se il valore dev'essere più piccolo o più grande del secondo paramentro.
	* @param int Valore per ritornare true.
	*/
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