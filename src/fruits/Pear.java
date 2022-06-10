package fruits;

import static ui.GameScreen.GROUND;

import java.awt.Graphics;

public class Pear {
	
	private static float GRAVITY = 0.6f;
	private float x = 670; 
	public float y = 0; 
	private float speedY = 0; 

	public void update() {
		if(y>=GROUND) {
			speedY = 0; 
			y = GROUND;
		}else {
			speedY+=GRAVITY; 
			y+=speedY;
		}
		
		}	
	public void draw(Graphics g) {
		g.drawRect((int) x, (int) y, 50, 50);
	}

	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getSpeedY() {
		return speedY;
	}
	public void setSpeedY(float speedY) {
		this.speedY = speedY;
	}	
	}