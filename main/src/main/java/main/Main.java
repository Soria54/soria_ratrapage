package main;

import controller.ControllerFacade;
import model.ModelFacade;
import view.ViewFacade;
/**
 * The Class Main.
 * @author soria
 *
 */
 abstract class Main {
		/**
		 * The main method.
		 *
		 * @param args - args 
		 *          the arguments
		 */
    public static void main(final String[] args) {
    	ModelFacade Model = new ModelFacade();
    	ViewFacade View = new ViewFacade();
    	ControllerFacade ControllerFacade = new ControllerFacade(Model, View);
    	View.setController(ControllerFacade);

    }

}
