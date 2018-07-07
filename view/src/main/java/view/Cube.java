package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Cube extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5536436972105389162L;
	Cube(Color color){
		this.setBackground(color);
		this.setSize(new Dimension(20, 20));
	}
	
}
