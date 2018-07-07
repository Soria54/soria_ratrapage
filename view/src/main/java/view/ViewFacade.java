package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class ViewFacade extends JFrame implements IView, ActionListener  {

	JButton bouton = new JButton("START");	
	private Start Start = new Start();
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
    		    
    	        // j'ajoute un objet impl�mentant l'interface KeyListener � ma fenetre

    	         

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
    	closeFrame();
    	new Game_Frame();
    	
    	//controller.start();
    	
      }

    


	public controller.IController getController() {
		return controller;
	}




	public void setController(controller.IController controller) {
		this.controller = controller;
	}



    

}
