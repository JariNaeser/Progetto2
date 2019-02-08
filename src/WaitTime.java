
public class WaitTime{

	/**
	* Questo metodo aspetta del tempo definito dall'utente.
	* @param Tempo che bisogna attendere.
	*/
	public void myWait(long millis){
		long now = System.currentTimeMillis();
		while(now + millis > System.currentTimeMillis()){
			try{
				Thread.sleep(10);
			}catch(InterruptedException ie){
				//Sleep has been interrupted.
			}
		}
	}

}