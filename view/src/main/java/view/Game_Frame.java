package view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import controller.IController;
import view.Order;
import model.IModel;
import java.awt.event.*;



public class Game_Frame extends JFrame implements KeyListener{
	int joueur1x=5;
	int joueur1y=8;
	int joueur2x=24;
	int joueur2y=8;
	
	Cube joueur1 = new Cube(Color.BLUE);
	Cube joueur2 = new Cube(Color.RED);
	
	private IController controller;
	private IModel model;
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
	    position_joueur();
	    this.setContentPane(Grille);
	    this.setVisible(true);
		this.addKeyListener(this);
	    
	}
	public void position_joueur(){
	    
		joueur1.setLocation(11+(19*joueur1x),2+(18*joueur1y));
	    Grille.add(joueur1);
	    
	   
	    joueur2.setLocation(11+(19*joueur2x),2+(18*joueur2y));
	    Grille.add(joueur2);
	    
	    Time Time = new Time();
	    Time.setLocation(11+(19*5),2+(325));
	    Grille.add(Time);
	}
	
	public void closeFrame()
	{
		this.setVisible(false);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode())
		{
			case KeyEvent.VK_Z: 
				this.controller.orderPerform(Order.UP, 1, joueur1x, joueur1y);
				this.joueur1y --;
			break;
			case KeyEvent.VK_S:
				this.controller.orderPerform(Order.DOWN, 1, joueur1x, joueur1y);
				this.joueur1y ++;
			break;
			case KeyEvent.VK_Q:
				this.controller.orderPerform(Order.LEFT, 1, joueur1x, joueur1y);
				this.joueur1x --;
			break;
			case KeyEvent.VK_D:
				this.controller.orderPerform(Order.RIGHT, 1, joueur1x, joueur1y);
				this.joueur1x ++;
			break;
				
			case KeyEvent.VK_UP:
				this.controller.orderPerform(Order.UP, 2, joueur2x, joueur2y);
				this.joueur2y --;
			break;

			case KeyEvent.VK_DOWN:
				this.controller.orderPerform(Order.DOWN, 2, joueur2x, joueur2y);
				this.joueur2y ++;
			break;

			case KeyEvent.VK_LEFT:
				this.controller.orderPerform(Order.LEFT, 2, joueur2x, joueur2y);
				this.joueur2x --;
			break;
			
			case KeyEvent.VK_RIGHT:
				this.controller.orderPerform(Order.RIGHT, 2, joueur2x, joueur2y);
				this.joueur2x ++;
			break;
			
			case KeyEvent.VK_SPACE:
			//pause
			break;

			case KeyEvent.VK_ESCAPE:
				System.exit(0);
			break;
			
		}
		position_joueur();
		SwingUtilities.updateComponentTreeUI(this);
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public IController getController() {
		return controller;
	}
	public void setController(IController controller) {
		this.controller = controller;
	} 



}
