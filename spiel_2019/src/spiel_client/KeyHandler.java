package spiel_client;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		if (e.getKeyCode() == KeyEvent.VK_W) {
			var.up = true;

		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			var.down = true;

		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			var.left = true;

		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			var.right = true;

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_W) {
			var.up = false;

		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			var.down = false;

		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			var.left = false;

		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			var.right = false;

		}

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}
}
