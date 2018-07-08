package controller;

import java.sql.SQLException;
import model.IModel;
import view.IView;
import view.Order;
import java.util.Observable;
import java.util.Observer;


public class ControllerFacade implements IController {

	/** The view. */
	private IView	view;
	
    /** The model. */
    private final IModel model;
    
	/** The clock of the game */
	private Clock clock;

    public ControllerFacade( final IModel model, final IView view) {
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
		System.out.println("start");
    	//  this.getView().displayMessage("message");
    	//	this.getView().displayMessage(this.getModel().getExampleById(1).toString());
    	//  this.getView().displayMessage(this.getModel().getExampleByName("Example 2").toString());

    }

    
    // je fait sa car impossible de comuniquer model vus directement
		public int TransMoto1x() {
			return this.model.getMoto1x(); 
		}
		public int TransMoto1y() {
			return this.model.getMoto1y(); 
		}
		public int TransMoto2x() {
			return this.model.getMoto2x(); 
		}
		public int TransMoto2y() {
			return this.model.getMoto2y(); 
		}



	@Override
	public void orderPerform(Order order, int i) {
		if (i == 1)
		{
			switch (order){
			case DOWN:
				//System.out.println(this.getModel().position_joueur1y());
				this.getModel().setMoto1y(this.getModel().position_joueur1y()+1);
				//System.out.println(this.getModel().position_joueur1y());
				break;
			case UP:
				this.getModel().setMoto1y(this.getModel().position_joueur1y()-1);
				break;
			case LEFT:
				this.getModel().setMoto1x(this.getModel().position_joueur1x()-1);
				break;
			case RIGHT:
				this.getModel().setMoto1x(this.getModel().position_joueur1x()+1);
				break;
		}
		}
		else if (i == 2)
		{
			switch (order){
			case DOWN:
				this.getModel().setMoto2y(this.getModel().position_joueur2y()+1);
				break;
			case UP:
				this.getModel().setMoto2y(this.getModel().position_joueur2y()-1);
				break;
			case LEFT:
				this.getModel().setMoto2x(this.getModel().position_joueur2x()-1);
				break;
			case RIGHT:
				this.getModel().setMoto2x(this.getModel().position_joueur2x()+1);
				break;
		}
		}
		this.getView().position();
		this.getView().repaint();
		
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
