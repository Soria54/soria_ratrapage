package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 * 
 * @author soria
 *
 */
public class Start extends JPanel { 
	
 
	private static final long serialVersionUID = 1L;
/**
 * Instance Start panel
 */
public void paintComponent(Graphics g){
	    Font font = new Font("Courier", Font.BOLD, 120);
	    g.setFont(font);
	    g.setColor(Color.BLUE);
	    g.drawString("TRON!", 135, 180);
	   
  }               
}