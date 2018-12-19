
public class WaitTime extends Wait{
	
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
	
	public void wait(){
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
	
	public void beginWait(){
		startTime = System.currentTimeMillis();
		wait();
	}
}