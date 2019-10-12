import java.awt.Color;
import java.awt.Graphics2D;

public class Spieler {

	int playerSizeX = 0;
	int playerSizeY = 0;
	int posX, posY;
	Grav grav = new Grav(800, 100);
	
	public Spieler(int x , int y, int playerSizeX,int playerSizeY) {
		posX = x;
		posY = y;
		this.playerSizeX = playerSizeX;
		this.playerSizeY = playerSizeY;
	}
	
	void drawPlayer(int x, int y, Graphics2D g2d) {
		posX = x;
		posY = y;
		g2d.setColor(Color.BLACK);
		g2d.fillRect(x, y, playerSizeX, playerSizeY);
	}

}
