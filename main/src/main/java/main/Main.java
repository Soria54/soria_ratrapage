package main;

import java.sql.SQLException;

import controller.ControllerFacade;
import model.ModelFacade;
import view.ViewFacade;

 abstract class Main {

    public static void main(final String[] args) {
    	ModelFacade Model = new ModelFacade();
    	
    	ControllerFacade ControllerFacade = new ControllerFacade(Model);
    	ViewFacade View = new ViewFacade(ControllerFacade);
        
        /*
        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
        */
    }

}
