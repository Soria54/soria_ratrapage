package model;

import java.util.ArrayList;

public class Moto extends Element {
	private boolean alive = true;

	private int direction;
	private int x;
	private int y; 


	
	public Moto(int x, int y) {
		super(x, y);
		this.setX(x);
		this.setY(y); 
		
	}
	
    public void dead()
    {
    	alive = false;
    }

    // get and set 
    
	
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = 11+(19*x);
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = 2 + (18*y);
	}
	
	public int positionX() {
		return (x-11)/19;
	}
	
	public int positionY() {
		return (y-2)/18;
	}

}
