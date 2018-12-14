import lejos.nxt.*;
import java.lang.Thread;
import javax.microedition.lcdui.Graphics;


public class Display
{
	public Graphics g;
	
	public Display(Graphics g){
		this.g = g;
	}
	
	public void displayString(String text,int charHeight,  int x, int y){
		LCD.drawString(text, charHeight, x, y);
	}
	
	public void reset(){
		LCD.clear();
	}
	
	public void displayImage(String url, int x, int y){
		src per = new src(url);
		LCD.drawImage(per, x, y, 0);
	}
	
	public void displayBattery(int size, int x, int y){
		g.drawLine(x+1,y-1,x+2,y-1);
		g.drawRect(x,y,(int)(size/2),size);
		g.fillRect(x,size-(int)(Battery.getVoltage())+y,(int)(size/2),(int)(Battery.getVoltage()));
	}
}