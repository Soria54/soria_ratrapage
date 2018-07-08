package view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import controller.IController;
import view.Order;

import java.awt.event.*;


public class Game_Frame extends JFrame implements KeyListener{

	
	Cube joueur1 = new Cube(Color.BLUE);
	Cube joueur2 = new Cube(Color.RED);
	
	private IController controller;
	/**
	 * 
	 */
	private static final long serialVersionUID = 6961787722092453231L;
	
	private Time time;
	private Grille Grille; 
	
	
	Game_Frame(){
	    this.setTitle("TRON");
	    this.setSize(600, 400);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	    this.setBackground(Color.CYAN); 
	    this.setLayout(null);
	    this.Grille = new Grille();
	    this.time = new Time();
	    this.time.setLocation(106, 327);
	    this.Grille.add(time);
	    this.setContentPane(this.Grille);
	    this.setVisible(true);
		this.addKeyListener(this);
	    
	}
	
	public void positon() {
		this.Grille.setJoueur1x(this.controller.TransMoto1x());
		this.Grille.setJoueur1y(this.controller.TransMoto1y());
		this.Grille.setJoueur2x(this.controller.TransMoto2x());
		this.Grille.setJoueur2y(this.controller.TransMoto2y());
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
				this.controller.orderPerform(Order.UP, 1);
				
			break;
			case KeyEvent.VK_S:
				this.controller.orderPerform(Order.DOWN, 1);
				
			break;
			case KeyEvent.VK_Q:
				this.controller.orderPerform(Order.LEFT, 1);
				
			break;
			case KeyEvent.VK_D:
				this.controller.orderPerform(Order.RIGHT,1);
				
			break;
				
			case KeyEvent.VK_UP:
				this.controller.orderPerform(Order.UP, 2);
				
			break;

			case KeyEvent.VK_DOWN:
				this.controller.orderPerform(Order.DOWN, 2);
				
			break;

			case KeyEvent.VK_LEFT:
				this.controller.orderPerform(Order.LEFT, 2);
				
			break;
			
			case KeyEvent.VK_RIGHT:
				this.controller.orderPerform(Order.RIGHT, 2);
				
			break;
			
			case KeyEvent.VK_SPACE:
			//pause
			break;

			case KeyEvent.VK_ESCAPE:
				System.exit(0);
			break;
			
		}
		//position_joueur();
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
	public void repaintpanel() {
		this.Grille.repaint();
		SwingUtilities.updateComponentTreeUI(this);
	}
	
	public IController getController() {
		return controller;
	}
	public void setController(IController controller) {
		this.controller = controller;
	} 

	public Grille getGamePanel()
	{
		return this.Grille;
	}

}
