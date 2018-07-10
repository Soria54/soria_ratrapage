package model;

import java.sql.SQLException;
/**
 * 
 * @author soria
 *The Interface IModel.
 */
public interface IModel {
	/**
	 * get Moto 1 x
	 * @return - gives the position x player 1 in pixel
	 */
    public int getMoto1x(); 
    /**
     * get Moto 1 y
     * @return - gives the position y player 1 in pixel
     */
    public int getMoto1y(); 
    /**
     * get Moto 2 x
     * @return - gives the position x player 2 in pixel
     */
    public int getMoto2x(); 
    /**
     * get Moto 2 y
     * @return - gives the position y player 2 in pixel
     */
    public int getMoto2y(); 
    
    /**
     * receive a position x of the box player 1
     * @param x - x
     */
    public void setMoto1x(int x);
    /**
     * receive a position y of the box player 1
     * @param y - y
     */
    public void setMoto1y(int y);
    /**
     * receive a position x of the box player 2
     * @param x -x
     */
    public void setMoto2x(int x);
    /**
     * receive a position y of the box player 2
     * @param y - y
     */
    public void setMoto2y(int y);
    /**
     * 
     * @return - give the position x player 1
     */
    
    public int position_joueur1x();
    /**
     * 
     * @return - give the position y player 1
     */
    public int position_joueur1y();
    /**
     * 
     * @return - give the position x player 2
     */
    public int position_joueur2x();
    /**
     * 
     * @return - give the position y player 2
     */
    public int position_joueur2y();
    /**
     * 
     * @return - gives the wall number in the part
     */

    public int getNbwall();
    /**
     * 
     * @param nb - nb
     * @return - gives the position x of the wall nb
     */
	public int getWallx(int nb);
	/**
	 * 
	 * @param nb - nb
	 * @return - gives the position y of the wall nb
	 */
	public int getWally(int nb);
	/**
	 * send the winner to the database and the time 
	 * @param message - message
	 * @param time - time
	 * @throws SQLException 
	 */

	public void message (String message, int time) throws SQLException;
}
