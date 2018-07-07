package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game_Frame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6961787722092453231L;
	
	private JLabel time = new JLabel();
	private Grille Grille = new Grille();
	
	Game_Frame(){
	    this.setTitle("TRON");
	    this.setSize(600, 400);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	    this.setBackground(Color.CYAN); 
	    this.setContentPane(Grille);
	    this.setVisible(true);
	}


}
