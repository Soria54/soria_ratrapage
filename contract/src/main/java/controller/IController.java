package controller;

import view.Order;

/**
 * <h1>The Interface IController.</h1>
 * 
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IController {

	void orderPerform(Order order, int i);
	void start();
}
