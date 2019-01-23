
public class WaitTime{
	
	private long startTime;
	
	public WaitTime(){
	
	}
	
	public void setStartTime(){
		startTime = System.currentTimeMillis();
	}
	
	public void myWait(long time){
		startTime = System.currentTimeMillis();
		while(isFinished(time)){
			
		}
	}
	
	public boolean isFinished(long time){
		if(startTime + time >= System.currentTimeMillis()){
			return true;
		}else{
			return false;
		}
	}
}