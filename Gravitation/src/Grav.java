
public class Grav {
	int g;
	
	public Grav( int hoehe, int pixelInMeter) {
		this.g = hoehe/pixelInMeter;
		return;
	}
	
	protected int gravitation (int y) {	
		g = 5;
		y = y + g;
		return y;
	}
	
	
}
