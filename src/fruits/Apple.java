package fruits;

import java.awt.Graphics;

public class Apple {
	
	private float x = 30; 
	private float y = 0; 
	private float speedY = 0; 

public void draw(Graphics g) {
	g.drawRect((int) x, (int) y, 50, 50);
}
}