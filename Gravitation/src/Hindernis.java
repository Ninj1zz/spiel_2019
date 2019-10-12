import java.awt.Color;
import java.awt.Graphics2D;

public class Hindernis {

	int x, y;
	int w, h;

	public Hindernis(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	void drawBound(Graphics2D g2d) {

		g2d.setColor(Color.GRAY);

		g2d.fillRect(x, y, w, h);

	}
}
