package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import model.IModel;

public class Grille extends JPanel implements Observer{
	
	private IModel model;
/**
	 * 
	 */
	private static final long serialVersionUID = 1167541544005820737L;

public Grille() {
	this.setLayout(null);
	this.setBackground(Color.CYAN);
	
}

public void paintComponent(Graphics g){


		g.setColor(Color.black);
	
		//grille de jeux
		int uniteX = getWidth()/30;
		int uniteY = getHeight()/20;
		for(int i=0; i<=30; i++){
			//x1, y1, x2, y2
		g.drawLine(uniteX*i+11, 0+2, uniteX*i+11, uniteY*18+2);
		}
		
		for(int i=0; i<=18; i++){
		g.drawLine(0+11, uniteY*i+2, uniteX*30+11, uniteY*i+2);
		}
		
		
		//j1
		g.setColor(Color.blue);
		g.fillRect(11+(19*5),2+(18*8), 20, 20);
		
		//j2
		g.setColor(Color.red);
		g.fillRect(11+(19*24),2+(18*8), 20, 20);
		
		
}

@Override
public void update(Observable observable, Object o) 
{
	this.model = (IModel) observable;
	this.repaint();
}





}

