package fruits;

import static ui.GameScreen.GROUND;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import util.Resource;

public class Apple {
	
	private static float GRAVITY = 0.2f; 
	
	private float x = 30; 
	public float y = 0; 
	private float speedY = 0; 
	private BufferedImage appleImage;
	
	public Apple() {
		appleImage = Resource.getResourceImage("data/Apple.png");
	}

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
	g.setColor(Color.white);
	g.drawRect((int) x, (int) y, 50, 50);
	g.drawImage(appleImage,(int)x, (int)y, 50, 50, null);
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