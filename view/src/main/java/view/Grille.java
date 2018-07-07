package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Grille extends JPanel {
	
	
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
		g.drawLine(uniteX*i+11, 0+2, uniteX*i+11, uniteY*20+2);
		}
		
		for(int i=0; i<=20; i++){
		g.drawLine(0+11, uniteY*i+2, uniteX*30+11, uniteY*i+2);
		}
		
}





}

