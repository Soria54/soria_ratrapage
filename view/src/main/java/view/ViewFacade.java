package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controller.IController;

/**
 * 
 * @author soria
 *
 */
public class ViewFacade extends JFrame implements IView, ActionListener  {

	private static final long serialVersionUID = -8518650981858728759L;
	/** new button for start*/
	JButton bouton = new JButton("START");	
	/** new start for menu*/
	private Start Start = new Start();
	/** the controller*/
	private IController controller;
	/** the game frame*/
	private Game_Frame frame;
	
	/**instanci Wies  */
    public ViewFacade() {
    		    this.setTitle("TRON");
    		    this.setSize(600, 400);
    		    this.setLocationRelativeTo(null);
    		    this.setResizable(false);
    		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    		    this.setBackground(Color.BLACK);         
    		    
    		    
    		    Start.setLayout(new BorderLayout());
    		    Start.add(bouton, BorderLayout.SOUTH);
    		    bouton.addActionListener(this);
    		    
    	        // j'ajoute un objet implémentant l'interface KeyListener à ma fenetre

    	         

    		    this.setContentPane(Start);
    		    this.setVisible(true);
    		    
    		  }
    
    /**close frame (widows menu)*/
	public void closeFrame()
	{
		this.setVisible(false);
	}
	/**close panel game */
    public void closeGame()
    {
    	this.frame.setVisible(false);
    }
    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     * 
     */
    /**
     * show a message on a new window
     * @param message - message
     */
    @Override
    public final void displayMessage(final String message) {
      JOptionPane.showMessageDialog(null, message);
    }
    
    /**
     * if you press the button it closes the menu page
     * @param arg0  arg0 (click button)
     */
    public void actionPerformed(ActionEvent arg0) {   
    	closeFrame();
    	frame = new Game_Frame();
    	setController(this.controller);
    	position();
    	this.controller.start();
    	
      }


	public IController getController() {
		return controller;
	}

	/**
	 * set the controller associated to the view
	 * @param controller - controller
	 * The controller associated
     */
	public void setController(IController controller) {
		this.controller = controller;
		this.frame.setController(controller);
	}
	
	/**
	 * refresh panel 
	 */
	public void repaint() {
		this.frame.repaintpanel();
	}
	
	/**
	 * refresh time 
	 */
	public void time_vus() {
		this.frame.settime();
	}

	/**
	 * refresh position of motorcycles
	 */
	@Override
	public void position() {
		this.frame.positon();
		
	}





    

}
