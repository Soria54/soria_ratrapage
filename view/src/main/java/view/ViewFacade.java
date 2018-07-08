package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controller.IController;


public class ViewFacade extends JFrame implements IView, ActionListener  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8518650981858728759L;
	
	JButton bouton = new JButton("START");	
	private Start Start = new Start();
	private IController controller;
	private Game_Frame frame;
	
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
    
    
	public void closeFrame()
	{
		this.setVisible(false);
	}
    public void closeGame()
    {
    	this.frame.setVisible(false);
    }
    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     * 
     */
    @Override
    public final void displayMessage(final String message) {
      JOptionPane.showMessageDialog(null, message);
    }
    
    
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


	public void setController(IController controller) {
		this.controller = controller;
		this.frame.setController(controller);
	}
	
	public void repaint() {
		this.frame.repaintpanel();
	}
	public void time_vus() {
		this.frame.settime();
	}

	@Override
	public void position() {
		this.frame.positon();
		
	}





    

}
