package model;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import model.ModelFacade;
import model.mock.MotoMock;




public class ModelFacadeTest {
		 MotoMock moto1;
		 MotoMock moto2;
		 int wall[][];
		 int NbWall;
		 int intest1;
		 int intest2;
		 ModelFacade ModelFacade;
		 
		    @Before
		    public void setUp() throws Exception {
		    	moto1 = new MotoMock(5,8);
		    	moto2 = new MotoMock(24, 8);
		    	ModelFacade = new ModelFacade();
		    	wall = new int [598][2];
		    	NbWall = 0;
		    }
		    
		    
		    //les joueur 
		    @Test
		    public void TestgetMoto1x() throws Exception
		    {	
		    	intest1 = ModelFacade.getMoto1x();
		    	assertEquals(intest1, this.moto1.getX());	
		    }
		    
		    @Test
		    public void TestgetMoto1y() throws Exception
		    {
		    	intest1 = ModelFacade.getMoto1y();
		    	assertEquals(intest1, this.moto1.getY());
		    }
		    
		    @Test
		    public void TestgetMoto2x() throws Exception
		    {
		    	intest1 = ModelFacade.getMoto2x();
		    	assertEquals(intest1, this.moto2.getX()); 
		    }
		    
		    @Test
		    public void TestgetMoto2y() throws Exception
		    {
		    	intest1 = ModelFacade.getMoto1y();
		    	assertEquals(intest1, this.moto2.getY()); 
		    }


		    @Test
		    public void TestsetMoto1x() throws Exception
		    {
		    	ModelFacade.setMoto1x(6);
		    	
		    	wall[NbWall][0] = this.moto1.getX();
		    	wall[NbWall][1] = this.moto1.getY();
		    	this.moto1.setX(6); 
		    	this.NbWall++;
		    	
		    	assertEquals(this.NbWall, this.ModelFacade.getNbwall());
		    	assertEquals(wall[NbWall][0], this.ModelFacade.getWallx(NbWall));
		    	assertEquals(wall[NbWall][0], this.ModelFacade.getWally(NbWall));
		    	assertEquals(this.moto1.getX(), this.ModelFacade.getMoto1x());
		    	
		    }
		    
		    
		    @Test
		    public void TestsetMoto1y() throws Exception
		    {
		    	ModelFacade.setMoto1y(9);
		    	
		    	wall[NbWall][0] = this.moto1.getX();
		    	wall[NbWall][1] = this.moto1.getY();
		    	this.moto1.setY(9);
		    	this.NbWall++;
		    	
		    	assertEquals(this.NbWall, this.ModelFacade.getNbwall());
		    	assertEquals(wall[NbWall][0], this.ModelFacade.getWallx(NbWall));
		    	assertEquals(wall[NbWall][0], this.ModelFacade.getWally(NbWall));
		    	assertEquals(this.moto1.getY(), this.ModelFacade.getMoto1y());
		    }
		    
		    
		    @Test
		    public void TestsetMoto2x() throws Exception
		    {
		    	ModelFacade.setMoto2x(25);
		    	
		    	wall[NbWall][0] = this.moto2.getX();
		    	wall[NbWall][1] = this.moto2.getY();
		    	this.moto2.setX(25); 
		    	this.NbWall++;
		    	
		    	assertEquals(this.NbWall, this.ModelFacade.getNbwall());
		    	assertEquals(wall[NbWall][0], this.ModelFacade.getWallx(NbWall));
		    	assertEquals(wall[NbWall][0], this.ModelFacade.getWally(NbWall));
		    	assertEquals(this.moto2.getX(), this.ModelFacade.getMoto2x());
		    }
		    
		    
		    @Test
		    public void TestsetMoto2y() throws Exception
		    {
		    	ModelFacade.setMoto2y(9);
		    	
		    	wall[NbWall][0] = this.moto1.getX();
		    	wall[NbWall][1] = this.moto1.getY();
		    	this.moto2.setY(9);
		    	this.NbWall++;
		    	
		    	assertEquals(this.NbWall, this.ModelFacade.getNbwall());
		    	assertEquals(wall[NbWall][0], this.ModelFacade.getWallx(NbWall));
		    	assertEquals(wall[NbWall][0], this.ModelFacade.getWally(NbWall));
		    	assertEquals(this.moto2.getY(), this.ModelFacade.getMoto2y());
		    }
		    
		    
		    @Test
		    public void Testposition_joueur1x() throws Exception
		    {
		    	intest1 = ModelFacade.position_joueur1x();
		    	assertEquals(intest1, this.moto1.positionX());	
		    }
		    
		    @Test
		    public void Testposition_joueur1y() throws Exception
		    {
		    	intest1 = ModelFacade.position_joueur1y();
		    	assertEquals(intest1, this.moto1.positionY());	
		    }
		    
		    @Test
		    public void Testposition_joueur2x() throws Exception
		    {
		    	intest2 = ModelFacade.position_joueur2x();
		    	assertEquals(intest2, this.moto2.positionX());	
		    }
		    
		    @Test
		    public void Testposition_joueur2y() throws Exception
		    {
		    	intest2 = ModelFacade.position_joueur2y();
		    	assertEquals(intest2, this.moto1.positionY());	
		    }
		    
		    
		    @Test
			public void TestgetNbwall() throws Exception{
		    	assertEquals(NbWall, this.ModelFacade.getNbwall());
			}

		    @Test
			public void TestgetWallx() throws Exception{
		    	assertEquals(this.wall[0][0], this.ModelFacade.getWallx(0));
			}
			
		    @Test
			public void TestgetWally() throws Exception{
		    	assertEquals(this.wall[0][1], this.ModelFacade.getWally(0));
			}

		    
}
