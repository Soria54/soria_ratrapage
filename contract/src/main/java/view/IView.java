package view;

import controller.IController;

/**
 * 
 * @author soria
 *
 */
public interface IView {

	/**
	 * refresh the panel and frame
	 */
	void repaint();
	
	/**
	 * 
	 * @param message - message
	 * shows a new frame with a message
	 */
    void displayMessage(String message);
	
    /**
     * 
     * @param controller - controller
     * send the controller
     */
	public void setController(IController controller);

	/**
	 * place the bikes on the panel
	 */
	void position();
	
	/**
	 * close grame, frame, panel
	 */
	void closeGame();
	
	/**
	 * sends the temp in the Time panel
	 */
	public void time_vus();
}
