package model.mock;


public class MotoMock {
	int x;
	int y;
	
	public MotoMock(int x, int y) {
		this.x = 11+(19*x);
		this.y = 2 + (18*y);
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
