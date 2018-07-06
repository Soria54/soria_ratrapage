package model;

public class Moto extends Element {
	private boolean alive = true;
	private int x;
	private int y; 
	private int upx;
	private int upy;
	private int NbWall = 1;
	
	public Moto(int x, int y) {
		super(x, y);
		this.x = x;
		this.y = y; 
	}
	void roll() {
		this.x = x + upx;
		this.y = y + upy;
	}
    public void moveTo(int x, int y){
		this.x = x;
		this.y = y; 
    }
    public void MakeWall()
    {
    	NbWall ++; 
    	new Wall(x, y);
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
