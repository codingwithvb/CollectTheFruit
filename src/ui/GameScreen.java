package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import fruits.Apple;
import fruits.Grape;
import fruits.Mango;
import fruits.Orange;
import fruits.Pear;

public class GameScreen extends JPanel implements Runnable, KeyListener{
	
	public static final float GRAVITY = 0.2f; 
	public static final float GROUND = 650;
	
	private int i = 0;  
	
	public int score = 0; 
	
	private Thread thread;
	private Apple apple; 
	private Grape grape; 
	private Mango mango;
	private Orange orange; 
	private Pear pear; 

	public GameScreen() {
		thread = new Thread(this);
		apple = new Apple();
		grape = new Grape();
		mango = new Mango();
		orange = new Orange(); 
		pear = new Pear();
		
		setBackground(Color.white);
	}
	
	public void startGame() {
		thread.start();
		
	}

	@Override
	public void run() {
		while(true) {
			try {
				
				apple.update();
				grape.update();
				mango.update();
				orange.update();
				pear.update();
				
				Thread.sleep(20);
				repaint();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(apple.y == 650 || grape.y == 650 || mango.y == 650 || orange.y == 650 || pear.y == 650) {
				score = 0; 
				
				apple.y = 0; 
				grape.y = 0; 
				mango.y = 0; 
				orange.y = 0;
				pear.y = 0; 
				
			}
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		apple.draw(g);
		grape.draw(g);
		mango.draw(g);
		orange.draw(g);
		pear.draw(g);
		
		g.setColor(Color.black);
		g.drawLine(0, (int) GROUND, getWidth(), (int) GROUND);
		
		g.drawString("Score: " + score , 700, 750);
		g.drawString("Collect The Fruit", 350, 750);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_C) {
			apple.y = 0; 
			score = score + 5; 
		}
		if(key == KeyEvent.VK_I) {
			grape.y = 0; 
			score = score + 7;
		}
		if(key == KeyEvent.VK_R) {
			mango.y = 0;
			score = score + 3; 
		}
		if(key == KeyEvent.VK_L) {
			orange.y = 0; 
			score = score + 10; 
		}
		if(key == KeyEvent.VK_E) {
			pear.y = 0;
			score = score + 15; 
		}
}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}
