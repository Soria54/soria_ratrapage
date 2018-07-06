package controller;

import java.sql.SQLException;
import java.util.List;

import model.Example;
import model.IModel;
import view.IView;
import view.Order;



public class ControllerFacade implements IController {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;
    
	/** The clock of the game */
	private Clock clock;

    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void start() {
    	
		this.clock = new Clock(this);
		this.clock.start();
    	//  this.getView().displayMessage("message");
    	//	this.getView().displayMessage(this.getModel().getExampleById(1).toString());
    	//  this.getView().displayMessage(this.getModel().getExampleByName("Example 2").toString());
    	

    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }

	@Override
	public void orderPerform(Order order, int i) {
		switch (order){
		case LEFT:
			if (i == 1)
			{
				hm.move(Direction.LEFT);			
			}
			else 
			{
				hm.move(Direction.LEFT);
			}
			break;
			
		case RIGHT:
			if (i == 1)
			{
				hm.move(Direction.RIGHT);			
			}
			else 
			{
				hm.move(Direction.RIGHT);
			}
			break;
		
		}
		
	}
}
