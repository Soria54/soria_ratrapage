package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * 
 * @author soria
 *
 */
public class Time extends JPanel {


	private static final long serialVersionUID = 7189121978620095069L;
	/** the time */
	int timer = 0;
	/** the Jlabel time to display the time */ 
	JLabel time = new JLabel("Timer :" + timer);
	/**
	 * intanci time panel  
	 */
	Time(){
		Font police = new Font("Courier", Font.BOLD, 20);
	    time.setFont(police);
	    this.add(time);
		this.setBackground(Color.GRAY);
		this.setSize(new Dimension(380, 38));
	}
	

	/***
	 * change the time variable
	 * @param timer - timer
	 */
	public void setTimer(int timer) {
		this.timer = timer;
		this.time.setText("Timer :" + timer);
	}
}
