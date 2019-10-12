import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class HitBox {

	int x, y;
	int w, h;
	int checkDown;

	boolean hits(Spieler s, Hindernis h) {
		Rectangle player = new Rectangle(s.posX, s.posY, s.playerSizeX, s.playerSizeY);
		Rectangle object = new Rectangle(h.x-5, h.y - 5, h.w, h.h);

		if (player.intersects(object)) {
			return true;
		} else {
			return false;
		}
	}

}
