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
		this.model.MakePlayer();
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
	public void orderPerform(Order order, int i, int x ,int y) {
		if (i == 1)
		{
			switch (order){
			case DOWN:
				Moto1.setdirection();
				break;
			case UP:
				Moto1.move(UP);
				break;
			case LEFT:
				Moto1.move(LEFT);
				break;
			case RIGHT:
				Moto1.move(RIGHT);
				break;
		}
		}
		else if (i == 2)
		{
			switch (order){
			case DOWN:
				Moto2.move(Direction.DOWN);
				break;
			case UP:
				Moto2.move(Direction.UP);
				break;
			case LEFT:
				Moto2.move(Direction.LEFT);
				break;
			case RIGHT:
				Moto2.move(Direction.RIGHT);
				break;			
		}
		}
		
		this.model.flush();
		
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
}
