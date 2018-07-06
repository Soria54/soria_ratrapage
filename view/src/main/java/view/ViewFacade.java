package view;

import controller.IController;
import view.Order;
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.Border;


public class ViewFacade extends JFrame implements IView, ActionListener, KeyListener  {

	JButton bouton = new JButton("START");	
	private Start Start = new Start();
	private Grille Grille = new Grille();
	private int jouer = 0;
	private controller.IController controller;

	
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
    	        addKeyListener(this);
    	         

    		    this.setContentPane(Start);
    		    this.setVisible(true);
    		    
    		  }
    
    
	public void closeFrame()
	{
		this.setVisible(false);
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
        jouer = 1;
        this.setBackground(Color.CYAN);
        this.remove(bouton);
        this.remove(Start);
        
        
    	this.setContentPane(Grille);
    	this.revalidate();
    	
  
      // controller.start();



    	
      }


	public void keyPressed(KeyEvent key) 
	{
		int codeDeLaTouche = key.getKeyCode();
		if (jouer == 1)
		{
			switch(codeDeLaTouche)
			{
				//joueur 1 
				case KeyEvent.VK_UP:
				this.controller.orderPerform(Order.RIGHT, 1);
				break;
			
				case KeyEvent.VK_D:
				this.controller.orderPerform(Order.LEFT, 1);
				break;
			
				//joueur 2 
				case KeyEvent.VK_6:
					this.controller.orderPerform(Order.RIGHT, 2);
				break;
				case KeyEvent.VK_4:
					this.controller.orderPerform(Order.LEFT, 2);
				break;
					
			}	
		}

	}


	public controller.IController getController() {
		return controller;
	}




	public void setController(controller.IController controller) {
		this.controller = controller;
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
    

}
