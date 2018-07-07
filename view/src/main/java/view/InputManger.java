

package view;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class InputManger implements KeyListener {

	private Grille gameBoard;

	public InputManger(Grille gameBoard) {
		this.gameBoard = gameBoard;
	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();

		if (key == KeyEvent.VK_UP) {

			gameBoard.changeMoto1Direction();

		} else if (key == KeyEvent.VK_DOWN) {

			gameBoard.changeMoto1Direction();

		} else if (key == KeyEvent.VK_RIGHT) {

			gameBoard.changeMoto1Direction();

		} else if (key == KeyEvent.VK_LEFT) {

			gameBoard.changeMoto1Direction();

		}  else if (key == KeyEvent.VK_ESCAPE) {

			System.exit(0);
		}
	}

	public void keyReleased(KeyEvent e) {
	}

}
