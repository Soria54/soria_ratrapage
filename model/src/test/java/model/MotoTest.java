package model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.mock.MotoMock;


public class MotoTest {

	private int x;
	private int y; 
	MotoMock moto;
    @Before
    public void setUp() throws Exception {
    	x=11+(19*5);
    	y=2 + (18*8);
    	moto = new MotoMock(5,8);
    }
    
    @Test
	public void TestgetX() {
		assertEquals(this.x, this.moto.getX());
	}

    @Test
	public void TestsetX() {
		this.moto.setX(5); 
		assertEquals(this.x, this.moto.getX());
	}

    @Test
	public void TestgetY() {
    	assertEquals(this.y, this.moto.getY());
	}

    @Test
	public void TestsetY() {
		this.moto.setY(8); 
		assertEquals(this.y, this.moto.getY());
	}
    

}


