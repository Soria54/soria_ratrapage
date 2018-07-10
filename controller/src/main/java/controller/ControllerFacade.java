package controller;

import java.sql.SQLException;
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
	
	private Order lastOrder2 = Order.LEFT;;
	private Order lastOrder1 = Order.RIGHT;
	

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
			this.lastOrder1 = order;
		}
		else if (i == 2)
		{
			this.lastOrder2 = order;
		}
		
	}
	
	public void ActionorderPerform(Order order, int i) {
		if (i == 1)
		{
			this.lastOrder1 = order;
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
			
			if (canMoveOn(this.getModel().getMoto1x(), this.getModel().getMoto1y(), this.getModel().getMoto2x(), this.getModel().getMoto2y()) == false )
			{
				game_over("Player RED win");
			}
		}
		else if (i == 2)
		{
			this.lastOrder2 = order;
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

	@Override
	public int time() {
		return this.clock.getTickNumber();
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

	public void update() {
		ActionorderPerform(this.lastOrder1, 1);
		ActionorderPerform(this.lastOrder2, 2);
		 this.view.time_vus();
		
	}


	
}
