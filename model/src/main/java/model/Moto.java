package model;
/**
 * 
 * @author soria
 *
 */

public class Moto {
	/**
	 * the position x 
	 */
	private int x;
	/**
	 * the position y
	 */
	private int y; 


	/**
	 * localisation motorbike
	 * @param x
	 * @param y
	 */
	public Moto(int x, int y) {
		
		this.setX(x);
		this.setY(y); 
		
	}
	

    // get and set 
    /**
     * get Moto x
     * @return
     * gives the position x in pixel
     */
	public int getX() {
		return x;
	}

    /**
     * receive a position of the box
     * @param x
     * gives the old position of the bike to make a wall and changes the position x of the motorcycle 
     */
	public void setX(int x) {
		this.x = 11+(19*x);
	}

    /**
     * get Moto y
     * @return
     * gives the position y in pixel
     */
	public int getY() {
		return y;
	}

    /**
     * receive a position of the box
     * @param y
     * gives the old position of the bike to make a wall and changes the position y of the motorcycle 
     */
	public void setY(int y) {
		this.y = 2 + (18*y);
	}
	
    /**
     * get Moto x
     * @return
     * gives the position
     */
	public int positionX() {
		return (x-11)/19;
	}
	
    /**
     * get Moto y
     * @return
     * gives the position 
     */
	public int positionY() {
		return (y-2)/18;
	}

}
