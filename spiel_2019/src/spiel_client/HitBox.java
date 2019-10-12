package spiel_client;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class HitBox {

	int x, y;
	int w, h;
	int checkDown;

	
	boolean hits(var s, var h) {
		Rectangle player = new Rectangle(s.x, s.y, s.playerwidth, s.playerhight);
		Rectangle object = new Rectangle(h.player2x, h.player2y, h.playerwidth, h.playerhight);

		if (player.intersects(object)) {
			return true;
		} else {
			return false;
		}
	}

}
