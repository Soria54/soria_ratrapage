package model;

import java.sql.SQLException;
import java.util.List;

import controller.Moto;
import model.dao.ExampleDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {
	private int NbWall = 1;
	Wall wall[] = new Wall[598];
    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }
    
    public void MakePlayer() {
		Moto Moto1 = new Moto(5, 9);
		Moto Moto2 = new Moto(24, 9);
    }
    
    public void MakeWall(int x, int y)
    {
    	wall[NbWall] = new Wall(x,y);
    	NbWall ++; 
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
