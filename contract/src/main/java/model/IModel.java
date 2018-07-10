package model;

import java.sql.SQLException;

public interface IModel {
	
    public int getMoto1x(); 
    public int getMoto1y(); 
    public int getMoto2x(); 
    public int getMoto2y(); 
    
    public void setMoto1x(int x); 
    public void setMoto1y(int y); 
    public void setMoto2x(int x); 
    public void setMoto2y(int y);
    
    public int position_joueur1x();
    public int position_joueur1y(); 
    public int position_joueur2x(); 
    public int position_joueur2y(); 

    public int getNbwall();
	public int getWallx(int nb);
	public int getWally(int nb);

	public void message (String message, int time) throws SQLException;
}
