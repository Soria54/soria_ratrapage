package model;

import java.sql.SQLException;
import model.dao.DBConnection;


/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
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
    public int getMoto1x() 
    {
    	return this.Moto1.getX(); 
    }
    public int getMoto1y() 
    {
    	return this.Moto1.getY(); 
    }
    
    public int getMoto2x() 
    {
    	return this.Moto2.getX(); 
    }
    public int getMoto2y() 
    {
    	return this.Moto2.getY(); 
    }

    
    
    public void setMoto1x(int x) 
    {
    	wall[NbWall][0] = this.Moto1.getX();
    	wall[NbWall][1] = this.Moto1.getY();
    	this.Moto1.setX(x); 
    	this.NbWall++;
    }
    public void setMoto1y(int y) 
    {
    	wall[NbWall][0] = this.Moto1.getX();
    	wall[NbWall][1] = this.Moto1.getY();
    	this.Moto1.setY(y);
    	this.NbWall++;
    }
    public void setMoto2x(int x) 
    {
    	wall[NbWall][0] = this.Moto2.getX();
    	wall[NbWall][1] = this.Moto2.getY();
    	this.Moto2.setX(x); 
    	this.NbWall++;
    }
    public void setMoto2y(int y) 
    {
    	wall[NbWall][0] = this.Moto2.getX();
    	wall[NbWall][1] = this.Moto2.getY();
    	this.Moto2.setY(y); 
    	this.NbWall++;
    }
    
    
    public int position_joueur1x() 
    {
    	return this.Moto1.positionX();
    }
    public int position_joueur1y() 
    {
    	return this.Moto1.positionY();
    }
    public int position_joueur2x() 
    {
    	return this.Moto2.positionX();
    }
    public int position_joueur2y() 
    {
    	return this.Moto2.positionY();
    }
    
    
    
	public int getNbwall() {
		return NbWall;
	}


	public int getWallx(int nb) {
		return wall[nb][0];
	}
	
	public int getWally(int nb) {
		return wall[nb][1];
	}


	public void setNbwall(int nbwall) {
		NbWall = nbwall;
	}



	public void message(String message, int time) throws SQLException {
	    DBConnection dbConnection = DBConnection.getInstance();
	    dbConnection.message(message, time);
		
	}

	
	

}
