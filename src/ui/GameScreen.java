package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import fruits.Apple;
import fruits.Grape;
import fruits.Mango;
import fruits.Orange;
import fruits.Pear;

public class GameScreen extends JPanel implements Runnable, KeyListener{
	
	public static final float GROUND = 650;
	
	private int i = 0;  
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
	}
	
	public void startGame() {
		thread.start();
		
	}

	@Override
	public void run() {
		while(true) {
			
		}
	}
	
	public void paint(Graphics g) {
		apple.draw(g);
		grape.draw(g);
		mango.draw(g);
		orange.draw(g);
		pear.draw(g);
		
		g.setColor(Color.black);
		g.drawLine(0, (int) GROUND, getWidth(), (int) GROUND);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Key Pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Key Released");
	}
}
