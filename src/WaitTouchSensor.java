import lejos.nxt.*;

public class WaitTouchSensor{
	
	/**
	* Sensore che l'utente passa per leggere i valori.
	*/
	private TouchSensor touch;
	
	/**
	* Valore booleano per sapere se il pulsante è premuto o no
	*/
	private boolean pressed = false; 
	
	public WaitTouchSensor(TouchSensor touch){
		this.touch = touch;
	}
	
	/**
	* Questo metodo aspetta finché isFinished ritorna true.
	* @param int Valore che determina l'azione che deve succedere.
	*/
	public void myWait(int action){
		while(isFinished(action)){
			
		}
	}
	
	/**
	* Questo metodo aspetta finché l'azione richiesta accada.
	* @param int Valore che determina l'azione che deve succedere.
	*/
	public boolean isFinished(int action){
		boolean finished = false;
		if(action == 0){
			finished = touch.isPressed();
		}else{
			if(pressed){
				finished = !touch.isPressed();
			}
			pressed = touch.isPressed();
		}
		return finished;
	}
}