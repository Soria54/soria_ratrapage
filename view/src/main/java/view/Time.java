package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Time extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7189121978620095069L;
	int timer = 0;
	JLabel time = new JLabel("Timer :" + timer);
	Time(){
		Font police = new Font("Courier", Font.BOLD, 20);
	    time.setFont(police);
	    this.add(time);
		this.setBackground(Color.GRAY);
		this.setSize(new Dimension(380, 38));
	}
	

	public void setTimer(int timer) {
		this.timer = timer;
		this.time.setText("Timer :" + timer);
	}
}
