package view;

import java.util.Observer;

import controller.IController;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IView {

    /**
     * Display message.
     *
     * @param message
     *            the message
     */
	void repaint();
	
    void displayMessage(String message);

	Observer getObserver();
	
	public void setController(IController controller);

	void position();
}
