package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {
	
	MovingMorph(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(getX(), getY(), getW(), getH());
	}
	
	@Override
	public void update() {
		
	}
}
