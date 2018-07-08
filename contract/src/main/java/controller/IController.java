package controller;

import view.Order;

/**
 * <h1>The Interface IController.</h1>
 * 
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IController {

	void start();
	void orderPerform(Order order, int i);
	public int time();
	public int TransMoto1x();
	public int TransMoto1y();
	public int TransMoto2x();
	public int TransMoto2y();

}
