package controller;

import java.sql.SQLException;
import model.IModel;
import view.IView;
import view.Order;
/**
 * 
 * @author soria
 *
 */

public class ControllerFacade implements IController {

	/** The view. */
	private IView	view;
	
    /** The model. */
    private final IModel model;
    
	/** The clock of the game */
	private Clock clock;
	
	/** The last other in player 2*/
	private Order lastOrder2 = Order.LEFT;
	
	/** The last other in player 1*/
	private Order lastOrder1 = Order.RIGHT;
	

    public ControllerFacade( final IModel model, final IView view) {
        this.setView(view);
        this.model = model;
    }

    /**
     * Start the clock and the game 
     *
     */
    public void start() {
		this.clock = new Clock(this);
		this.clock.start();
		System.out.println("start");
    	//  this.getView().displayMessage("message");
    	//	this.getView().displayMessage(this.getModel().getExampleById(1).toString());
    	//  this.getView().displayMessage(this.getModel().getExampleByName("Example 2").toString());

    }


    
    // je fait sa car impossible de comuniquer model vus directement
   
		/**
		 * 
		 * @return - return position x joueur 1
		 */
		public int TransMoto1x() {
			return this.model.getMoto1x(); 
		}
		
		/**
		 * 
		 * @return - return position y joueur 1
		 */
		public int TransMoto1y() {
			return this.model.getMoto1y(); 
		}
		
		/**
		 * 
		 * @return - return position x joueur 2
		 */
		public int TransMoto2x() {
			return this.model.getMoto2x(); 
		}
		
		/**
		 * 
		 * @return - return position y joueur 2
		 */
		public int TransMoto2y() {
			return this.model.getMoto2y(); 
		}


		/**
		 * 
		 * @param order - order
		 * @param i - i
		 * 
		 * take the keys of the keyboard and the stock
		 */
	@Override
	public void orderPerform(Order order, int i) {
		if (i == 1)
		{
			this.lastOrder1 = order;
		}
		else if (i == 2)
		{
			this.lastOrder2 = order;
		}
		
	}
	
		/**
		 * 
		 * @param order - order
		 * @param i - i
		 * 
		 * take the touch of the keyboard stock and move the motorcycles
		 */
	public void ActionorderPerform(Order order, int i) {
		if (i == 1)
		{
			switch (order){
			case DOWN:
				this.getModel().setMoto1y(this.getModel().position_joueur1y()+1);
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
			
			if (canMoveOn(this.getModel().getMoto1x(), this.getModel().getMoto1y(), this.getModel().getMoto2x(), this.getModel().getMoto2y()) == false )
			{
				game_over("Player RED win");
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
			if (canMoveOn(this.getModel().getMoto2x(), this.getModel().getMoto2y(), this.getModel().getMoto1x(), this.getModel().getMoto1y()) == false )
			{
				game_over("Player BLUE win");
			}
		}
		this.getView().position();
		this.getView().repaint();
		
	}
	
	/**
	 * Collision test
	 * @param Myx - Myx
	 * @param Myy - Myy
	 * @param Otherx - Otherx
	 * @param Otherx - Otherx
	 * @return - return if there was a collision, true or false
	 */
    boolean canMoveOn(int Myx, int Myy, int Otherx, int Othery){
        int ok = 1;
        if(Myx > 562 || Myx < 11)
        {
            ok = 0;
        }
        if(Myy > 308 || Myy < 2)
        {
        	ok = 0;
        }
        if(Myx == Otherx && Myy == Othery )
        {
        	game_over("none winner");
        }
	    for (int count = 0; count < this.getModel().getNbwall(); count++) 
	    {

	        if(this.getModel().getWallx(count) == Myx && this.getModel().getWally(count) == Myy)
	        {
	        	ok = 0;
	        }
	    }

	    if (ok == 0)
	    {
	    	return false;
	    }
        else
        {
        	return true;
        }
    }

	/**
	 * end-of-game method that sends the winner to the database and closes the game
	 * @param message - message
	 */
	public void game_over(String message)
	{

		try {
			this.model.message(message, this.clock.getTickNumber());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		this.getView().closeGame();
		this.getView().displayMessage(message);
		this.clock.stop();
		System.exit(0);
	}

	/**
	 * 
	 * @return - return the time in second
	 */
	@Override
	public int time() {
		return this.clock.getTickNumber();
	}
	
	/**
	 * this is the most important method
	 * every 1/4 second he moves the motorcycles, sends the time to the view and updates the view
	 */
	public void update() {
		ActionorderPerform(this.lastOrder1, 1);
		ActionorderPerform(this.lastOrder2, 2);
		 this.view.time_vus();
		
	}
	
	// GETTERS & SETTERS //

	/**
	 * Gets the Model.
	 * 
	 * @return - model
	 */
    public IModel getModel() {
        return this.model;
    }

    /**
     * get the view	
     * @return - view
     */
	public IView getView() {
		return view;
	}

	/**
	 * Sets the view.
	 *
	 * @param - the new view
	 *          
	 */
	public void setView(IView view) {
		this.view = view;
	}



	
}
