package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Grille extends JPanel implements ActionListener {
	private InputManger inputManager;
	private int test = 9;
	
public Grille() {
	inputManager = new InputManger(this);
	this.setBackground(Color.CYAN);
}

public void paintComponent(Graphics g){
	
	this.setPreferredSize(new Dimension(600, 400));
	this.setLayout(null);
	
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
/*
//j1
g.setColor(Color.blue);
g.fillRect(11+(19*5),2+(18*9), 20, 20);

//j2
g.setColor(Color.red);
g.fillRect(11+(19*24),2+(18*test), 20, 20);
*/
}

public void Moto2(Graphics2D g2) {

			g2.setColor(Color.RED);
			g2.fillrect(Moto.getSnakeBody().get(0));

	
}


@Override
public void actionPerformed(ActionEvent e) {
	 
	repaint();
	
}

}