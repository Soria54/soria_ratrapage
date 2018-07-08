package controller;

import java.sql.SQLException;
import java.util.List;

import model.Example;
import model.IModel;
import view.IView;
import view.Order;



public class ControllerFacade implements IController {

	/** The view. */
	private IView	view;
	
    /** The model. */
    private final IModel model;
    
	/** The clock of the game */
	private Clock clock;

    public ControllerFacade( final IModel model, IView view) {
        super();
        this.setView(view);
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void start() {
    	this.model.getObservable().addObserver(this.view.getObserver());
		this.clock = new Clock(this);
		this.clock.start();
    	//  this.getView().displayMessage("message");
    	//	this.getView().displayMessage(this.getModel().getExampleById(1).toString());
    	//  this.getView().displayMessage(this.getModel().getExampleByName("Example 2").toString());

    }



	@Override
	public void orderPerform(Order order, int i) {
		if (i == 1)
		{
			switch (order){
			case DOWN:
				//this.getModel().setMoto1y(y-1);
				break;
			case UP:
				//this.getModel().setMoto1y(y+1);
				break;
			case LEFT:
				//this.getModel().setMoto1x(x-1);
				break;
			case RIGHT:
				//this.getModel().setMoto1x(x+1);
				break;
		}
		}
		else if (i == 2)
		{
			switch (order){
			case DOWN:
				//this.getModel().setMoto2y(y-1);
				break;
			case UP:
				//this.getModel().setMoto2y(y+1);
				break;
			case LEFT:
				//this.getModel().setMoto2x(x-1);
				break;
			case RIGHT:
				//this.getModel().setMoto2x(x+1);
				break;	
		}
		}
		
		
		
	}
	
    boolean canMoveOn(int x, int y){
        
        if(x > 562 || x < 11)
        {
            return false;
        }
        if(y > 308 || y < 2)
        {
            return false;
        }
        else
        {
        return true;
        }
    }
	public void update() {
		// TODO Auto-generated method stub
		
	}
	


    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }

	public IView getView() {
		return view;
	}

	public void setView(IView view) {
		this.view = view;
	}
	
}
