package controller;

import view.Order;

/**
 * The Interface IController.
 * @author soria
 *
 */
public interface IController {
	
	/**
	 * 
	 * Start the Clock 
	 */
	void start();

	
	/**
	 * 
	 * @param order - oder
	 * @param i - i
	 * 
	 * take the keys of the keyboard and the stock
	 */
	void orderPerform(Order order, int i);

	
	/**
	 * 
	 * @return
	 * return the time in second
	 */
	public int time();

	
	/**
	 * 
	 * @return - return position x joueur 1
	 */
	public int TransMoto1x();

	
	/**
	 * 
	 * @return - return position y joueur 1
	 */
	public int TransMoto1y();

	
	/**
	 * 
	 * @return - return position x joueur 2
	 */
	public int TransMoto2x();

	
	/**
	 * 
	 * @return - return position y joueur 2
	 */
	public int TransMoto2y();


}
