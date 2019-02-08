import lejos.nxt.*;

public class Navigation{

	private char leftMotor = 'A';
	private char rightMotor = 'B';
	private int speed = 0;
	private char direction = 'F';

	public Navigation(char leftMotor, char rightMotor){
		setMotorLeftPort(leftMotor);
		setMotorRightPort(rightMotor);
	}
	
	/**
	* Questo metodo ritorna la porta del motore sinistro.
	* @return porta del motore sinistro.
	*/
	public char getLeftMotorPort(){
		return this.leftMotor;
	}

	/**
	* Questo metodo ritorna la porta del motore destro.
	* @return porta del motore destro.
	*/
	public char getRightMotorPort(){
		return this.rightMotor;
	}
	
	/**
	* Questo metodo istanzia la porta del motore sinistro.
	* @param char Carattere della porta del motore
	*/
	public void setMotorLeftPort(char port){
		String mp = port + "";
		port = mp.toUpperCase().charAt(0);
		if(port == 'A' || port == 'B' || port == 'C'){
			leftMotor = port;
		}
	}

	/**
	* Questo metodo istanzia la porta del motore destro.
	* @param char Carattere della porta del motore
	*/
	public void setMotorRightPort(char port){
		String mp = port + "";
		port = mp.toUpperCase().charAt(0);
		if(port == 'A' || port == 'B' || port == 'C'){
			leftMotor = port;
		}
	}

	/**
	* Questo metodo ritorna la velocità.
	* @return Ritorna la velocità del robot.
 	*/
	public int getMySpeed(){
		return this.speed;
	}
	
	/**
	* Questo metodo assegna un valore alla velocità.
	* @param int Velocità da assegnare.
	*/
	public void setMySpeed(int speed){
		if(speed >= 0){
			this.speed = speed;
		}
	}
	
	/**
	* Questo metodo ritorna la direzione.
	* @return Ritorna il valore della direzione.
	*/
	public char getDirection(){
		return this.direction;
	}
	
	/**
	* Questo metodo assegna un valore alla direzione.
	* @param int Direzione da assegnare.
	*/
	public void setDirection(char direction){
		String s = direction + "";
		direction = s.toUpperCase().charAt(0);
		if(direction == 'F' || direction == 'B'){
			this.direction = direction;
		}
	}

	/**
	* Questo metodo fa partire il robot nella direzione assegnata alla velocità assegnata.
	*/
	public void move(){
		switch(getLeftMotorPort()){
			case 'A':
				Motor.A.setSpeed((float)this.getMySpeed());
			case 'B':
				Motor.B.setSpeed((float)this.getMySpeed());
			case 'C':
				Motor.C.setSpeed((float)this.getMySpeed());
		}
		switch(getRightMotorPort()){
			case 'A':
				Motor.A.setSpeed((float)this.getMySpeed());
			case 'B':
				Motor.B.setSpeed((float)this.getMySpeed());
			case 'C':
				Motor.C.setSpeed((float)this.getMySpeed());
		}
		if(getDirection() == 'F'){
			switch(getLeftMotorPort()){
				case 'A':
					Motor.A.forward();
				case 'B':
					Motor.B.forward();
				case 'C':
					Motor.C.forward();
			}
			switch(getRightMotorPort()){
				case 'A':
					Motor.A.forward();
				case 'B':
					Motor.B.forward();
				case 'C':
					Motor.C.forward();
			}
		}else{
			switch(getLeftMotorPort()){
				case 'A':
					Motor.A.backward();
				case 'B':
					Motor.B.backward();
				case 'C':
					Motor.C.backward();
			}
			switch(getRightMotorPort()){
				case 'A':
					Motor.A.backward();
				case 'B':
					Motor.B.backward();
				case 'C':
					Motor.C.backward();
			}
		}
	}
	
	/**
	* Questo metodo fa muovere il robot verso sinistra.
	* @param int Di quanto si deve spostare a sinistra.
	*/
	public void left(int howMuch){
		switch(getLeftMotorPort()){
			case 'A':
				Motor.A.setSpeed((float)(this.getMySpeed() - this.getSteering()/2));
			case 'B':
				Motor.B.setSpeed((float)(this.getMySpeed() - this.getSteering()/2));
			case 'C':
				Motor.C.setSpeed((float)(this.getMySpeed() - this.getSteering()/2));
		}
		switch(getRightMotorPort()){
			case 'A':
				Motor.A.setSpeed((float)(this.getMySpeed() + this.getSteering()/2));
			case 'B':
				Motor.B.setSpeed((float)(this.getMySpeed() + this.getSteering()/2));
			case 'C':
				Motor.C.setSpeed((float)(this.getMySpeed() + this.getSteering()/2));
		}
	}

	/**
	* Questo metodo fa muovere il robot verso destra.
	* @param int Di quanto si deve spostare a destra.
	*/
	public void right(int howMuch){
		switch(getLeftMotorPort()){
			case 'A':
				Motor.A.setSpeed((float)(this.getMySpeed() + this.getSteering()/2));
			case 'B':
				Motor.B.setSpeed((float)(this.getMySpeed() + this.getSteering()/2));
			case 'C':
				Motor.C.setSpeed((float)(this.getMySpeed() + this.getSteering()/2));
		}
		switch(getRightMotorPort()){
			case 'A':
				Motor.A.setSpeed((float)(this.getMySpeed() - this.getSteering()/2));
			case 'B':
				Motor.B.setSpeed((float)(this.getMySpeed() - this.getSteering()/2));
			case 'C':
				Motor.C.setSpeed((float)(this.getMySpeed() - this.getSteering()/2));
		}
	}

	/**
	* Questo metodo ferma il robot.
	*/
	public void stop(){
		switch(getLeftMotorPort()){
			case 'A':
				Motor.A.stop();
			case 'B':
				Motor.B.stop();
			case 'C':
				Motor.C.stop();
		}
		switch(getRightMotorPort()){
			case 'A':
				Motor.A.stop();
			case 'B':
				Motor.B.stop();
			case 'C':
		 		Motor.C.stop();
		}
	}
	
}