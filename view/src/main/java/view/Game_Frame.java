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
	    this.setLayout(null);
	    position_joueur_base();
	    this.setContentPane(Grille);
	    this.setVisible(true);
	    
	}
	public void position_joueur_base(){
	    Cube Cube1 = new Cube(Color.BLUE);
	    Cube1.setLocation(11+(19*5),2+(18*8));
	    Grille.add(Cube1);
	    
	    Cube Cube2 = new Cube(Color.RED);
	    Cube2.setLocation(11+(19*24),2+(18*8));
	    Grille.add(Cube2);
	    
	    Time Time = new Time();
	    Time.setLocation(11+(19*5),2+(325));
	    Grille.add(Time);
	}



}
