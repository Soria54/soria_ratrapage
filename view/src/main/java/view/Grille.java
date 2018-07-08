package view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Grille extends JPanel {
	
	private int joueur1x;
	private int joueur1y;
	private int joueur2x;
	private int joueur2y;
	
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
		Cube Cube1 = new Cube(Color.blue);
		Cube1.setLocation(this.joueur1x, this.joueur1y);
		this.add(Cube1);
		
		//j2
		Cube Cube2 = new Cube(Color.red);
		Cube2.setLocation(this.joueur2x, this.joueur2y);
		this.add(Cube2);
		
		
}




public void setJoueur1x(int joueur1x) {
	this.joueur1x = joueur1x;
}

public void setJoueur1y(int joueur1y) {
	this.joueur1y = joueur1y;
}

public void setJoueur2x(int joueur2x) {
	this.joueur2x = joueur2x;
}

public void setJoueur2y(int joueur2y) {
	this.joueur2y = joueur2y;
}



}

