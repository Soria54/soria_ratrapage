package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Start extends JPanel { 
	
  public void paintComponent(Graphics g){
	    Font font = new Font("Courier", Font.BOLD, 120);
	    g.setFont(font);
	    g.setColor(Color.BLUE);
	    g.drawString("TRON!", 135, 180);
	   
  }               
}