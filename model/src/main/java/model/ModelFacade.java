package model;

import java.awt.geom.Ellipse2D;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


import model.dao.ExampleDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade extends Observable implements IModel, Imodel_view {
	private int NbWall = 1;
	private Moto Moto1;
	private Moto Moto2;
	Wall wall[] = new Wall[598];
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
    	this.Moto1.setX(x); 
    }
    public void setMoto1y(int y) 
    {
    	this.Moto1.setY(y);
    }
    public void setMoto2x(int x) 
    {
    	this.Moto2.setX(x); 
    }
    public void setMoto2y(int y) 
    {
    	this.Moto2.setY(y); 
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
    
    
    
    
    
    
    
    public void MakeWall(int x, int y)
    {
    	wall[NbWall] = new Wall(x,y);
    	NbWall ++; 
    }

    
	public void flush() {
		this.setChanged();
		this.notifyObservers();
	}
	
	public Observable getObservable() {
		return this;
	}
	
    @Override
    public Example getExampleById(final int id) throws SQLException {
        return ExampleDAO.getExampleById(id);
    }


    @Override
    public Example getExampleByName(final String name) throws SQLException {
        return ExampleDAO.getExampleByName(name);
    }


    @Override
    public List<Example> getAllExamples() throws SQLException {
        return ExampleDAO.getAllExamples();
    }












}
