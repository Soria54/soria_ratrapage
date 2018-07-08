package model;

import java.sql.SQLException;
import java.util.List;

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
    /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
    Example getExampleById(int id) throws SQLException;

    /**
     * Gets the example by name.
     *
     * @param name
     *            the name
     * @return the example by name
     * @throws SQLException
     *             the SQL exception
     */
    Example getExampleByName(String name) throws SQLException;

    /**
     * Gets the all examples.
     *
     * @return the all examples
     * @throws SQLException
     *             the SQL exception
     */
    List<Example> getAllExamples() throws SQLException;
}
