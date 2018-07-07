package model;

import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

public class Moto extends Element {
	private boolean alive = true;
	private ArrayList<Ellipse2D.Double> MotoBody = new ArrayList<Ellipse2D.Double>();
	private int direction;
	private int x;
	private int y; 
	private int upx;
	private int upy;

	
	public Moto(int x, int y) {
		super(x, y);
		this.x = x;
		this.y = y; 
		MotoBody.add(new Ellipse2D.Double(11+(19*x),2+(18*y), 20, 20));
	}
	
	void roll() {
		this.x = x + upx;
		this.y = y + upy;
	}
	
	public void move() {

		if (direction == 1) {
			decreaseY();
		} else if (direction == 2) {
			increaseY();
		} else if (direction == 3) {
			increaseX();
		} else if (direction == 4) {
			decreaseX();
		}
	}
    
	public void increaseY() {
		Ellipse2D.Double temp = (Ellipse2D.Double) MotoBody.get(0);
		Ellipse2D.Double elli = new Ellipse2D.Double(temp.x, temp.y + 18,
				temp.getWidth(), temp.getHeight());

		MotoBody.set(0, (Ellipse2D.Double) elli);

	}

	public void decreaseY() {
		Ellipse2D.Double temp = (Ellipse2D.Double) MotoBody.get(0);
		Ellipse2D.Double elli = new Ellipse2D.Double(temp.x, temp.y - 18,
				temp.getWidth(), temp.getHeight());

		MotoBody.set(0, (Ellipse2D.Double) elli);
	}

	public void increaseX() {
		Ellipse2D.Double temp = (Ellipse2D.Double) MotoBody.get(0);
		Ellipse2D.Double elli = new Ellipse2D.Double(temp.x + 19, temp.y,
				temp.getWidth(), temp.getHeight());

		MotoBody.set(0, (Ellipse2D.Double) elli);
	}

	public void decreaseX() {
		Ellipse2D.Double temp = (Ellipse2D.Double) MotoBody.get(0);
		Ellipse2D.Double elli = new Ellipse2D.Double(temp.x - 19, temp.y,
				temp.getWidth(), temp.getHeight());

		MotoBody.set(0, (Ellipse2D.Double) elli);
	}
	
    public void dead()
    {
    	alive = false;
    }

    // get and set 
    
	public int getUpy() {
		return upy;
	}
	public void setUpy(int upy) {
		this.upy = upy;
	}
	public int getUpx() {
		return upx;
	}
	public void setUpx(int upx) {
		this.upx = upx;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}

}
