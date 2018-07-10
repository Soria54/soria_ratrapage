package model;

import java.sql.SQLException;
import model.dao.DBConnection;



public final class ModelFacade implements IModel {
	private int NbWall = 0;
	private Moto Moto1;
	private Moto Moto2;
	private int wall[][] = new int [598][2];
    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
		this.Moto1 = new Moto(5, 8);
		this.Moto2 = new Moto(24, 8);
		System.out.println("creation moto ok");
    }

    
  
    //les joueur 
	/**
	 * get Moto 1 x
	 * @return
	 * gives the position x player 1 in pixel
	 */
    public int getMoto1x() 
    {
    	return this.Moto1.getX(); 
    }
    
    /**
     * get Moto 1 y
     * @return
     * gives the position y player 1 in pixel
     */
    public int getMoto1y() 
    {
    	return this.Moto1.getY(); 
    }
    
    /**
     * get Moto 2 x
     * @return
     * gives the position x player 2 in pixel
     */
    public int getMoto2x() 
    {
    	return this.Moto2.getX(); 
    }
    
    /**
     * get Moto 2 y
     * @return
     * gives the position y player 2 in pixel
     */
    public int getMoto2y() 
    {
    	return this.Moto2.getY(); 
    }

    
    /**
     * receive a position of the box
     * @param x
     * gives the old position of the bike to make a wall and changes the position x of the motorcycle 1
     */
    public void setMoto1x(int x) 
    {
    	wall[NbWall][0] = this.Moto1.getX();
    	wall[NbWall][1] = this.Moto1.getY();
    	this.Moto1.setX(x); 
    	this.NbWall++;
    }
    
    /**
     * receive a position of the box
     * @param y
     * gives the old position of the bike to make a wall and changes the position y of the motorcycle 1
     */
    public void setMoto1y(int y) 
    {
    	wall[NbWall][0] = this.Moto1.getX();
    	wall[NbWall][1] = this.Moto1.getY();
    	this.Moto1.setY(y);
    	this.NbWall++;
    }
    
    /**
     * receive a position of the box
     * @param x
     * gives the old position of the bike to make a wall and changes the position x of the motorcycle 2
     */
    public void setMoto2x(int x) 
    {
    	wall[NbWall][0] = this.Moto2.getX();
    	wall[NbWall][1] = this.Moto2.getY();
    	this.Moto2.setX(x); 
    	this.NbWall++;
    }
    
    /**
     * receive a position of the box
     * @param y
     * gives the old position of the bike to make a wall and changes the position y of the motorcycle 2
     */
    public void setMoto2y(int y) 
    {
    	wall[NbWall][0] = this.Moto2.getX();
    	wall[NbWall][1] = this.Moto2.getY();
    	this.Moto2.setY(y); 
    	this.NbWall++;
    }
    
    /**
     * 
     * @return
     * give the position x player 1
     */
    public int position_joueur1x() 
    {
    	return this.Moto1.positionX();
    }
    
    /**
     * 
     * @return
     * give the position y player 1
     */
    public int position_joueur1y() 
    {
    	return this.Moto1.positionY();
    }
    
    /**
     * 
     * @return
     * give the position x player 2
     */
    public int position_joueur2x() 
    {
    	return this.Moto2.positionX();
    }
    
    /**
     * 
     * @return
     * give the position y player 2
     */
    public int position_joueur2y() 
    {
    	return this.Moto2.positionY();
    }
    
    
    /**
     * 
     * @return
     * gives the wall number in the part
     */
	public int getNbwall() {
		return NbWall;
	}

    /**
     * 
     * @param nb
     * @return
     * gives the position x of the wall nb
     */
	public int getWallx(int nb) {
		return wall[nb][0];
	}
	
	/**
	 * 
	 * @param nb
	 * @return
	 * gives the position y of the wall nb
	 */
	public int getWally(int nb) {
		return wall[nb][1];
	}

	/**
	 * 
	 * @param nbwall
	 * new wall
	 */
	public void setNbwall(int nbwall) {
		NbWall = nbwall;
	}


	/**
	 * send the winner to the database and the time 
	 * @param message
	 * @param time
	 * @throws SQLException
	 */
	public void message(String message, int time) throws SQLException {
	    DBConnection dbConnection = DBConnection.getInstance();
	    dbConnection.message(message, time);
		
	}

	
	

}
