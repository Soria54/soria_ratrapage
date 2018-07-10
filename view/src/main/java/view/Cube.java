package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
/**
 * 
 * @author soria
 *
 */
public class Cube extends JPanel {

	/**
	 * new CUBE --> mur/ joueur 
	 */
	private static final long serialVersionUID = -5536436972105389162L;
	Cube(Color color){
		this.setBackground(color);
		this.setSize(new Dimension(20, 20));
	}
	
}
