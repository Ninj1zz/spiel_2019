import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Draw extends JPanel implements ActionListener {

	private Timer t = new Timer(20, (ActionListener) this);
	Grav grav = new Grav(getHeight(), 100);
	int playerX;
	int playerY;

	Spieler sp = new Spieler(0, 0, 50, 50);
	Hindernis h = new Hindernis(0, 300, 500, 50);
	Hindernis h1 = new Hindernis(200, 0, 50, 500);
	HitBox hB = new HitBox();

	int collY = 0;
	int collX = 0;

	

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		g2d.setBackground(Color.WHITE);

			if (hB.hits(sp, h)) {
				sp.drawPlayer(collX, collY, g2d);
				h.drawBound(g2d);
				h1.drawBound(g2d);
			} else if (!hB.hits(sp, h)) {
				collY = playerY;
				collX = playerX;
				sp.drawPlayer(playerX, playerY, g2d);
				h.drawBound(g2d);
				h1.drawBound(g2d);
			}
			
		
		

		t.start();

	}

	public void actionPerformed(ActionEvent arg0) {
		repaint();
	}

}
