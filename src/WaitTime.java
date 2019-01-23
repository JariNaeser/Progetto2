
public class WaitTime{
	
	private long time;
	
	private long startTime;
	
	public void setTime(long time){
		
	}
	
	public long getTime(){
		return time;
	}
	
	public WaitTime(long time){
		this.time = time;
	}
	
	public void myWait(){
		while(isFinished()){
			
		}
	}
	
	public boolean isFinished(){
		if(startTime + time >= System.currentTimeMillis()){
			return true;
		}else{
			return false;
		}
	}
}