package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Grille extends JPanel {
	Grille()
	{
		setBackground(Color.CYAN);
		setVisible(true);
	}
public void paintComponent(Graphics g){
	
	this.setPreferredSize(new Dimension(600, 400));
	this.setLayout(null);
	
g.setColor(Color.black);
int uniteX = getWidth()/30;
int uniteY = getHeight()/20;
for(int i=0; i<=30; i++){
	//x1, y1, x2, y2
g.drawLine(uniteX*i+11, 0+2, uniteX*i+11, uniteY*20+2);
}

for(int i=0; i<=20; i++){
g.drawLine(0+11, uniteY*i+2, uniteX*30+11, uniteY*i+2);
}

//j1
g.setColor(Color.blue);
g.fillRect(11+(19*5),2+(18*9), 20, 20);

//j2
g.setColor(Color.red);
g.fillRect(11+(19*24),2+(18*9), 20, 20);



}

}