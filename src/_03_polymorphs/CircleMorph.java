package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {
	CircleMorph(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.cyan);
		g.fillRect(getX(), getY(), getW(), getH());
	}
	
	@Override
	public void update() {
		int i = 0;
		setX((int) (getX() + Math.sin(i) * 10));
		setY((int) (getY() + Math.cos(i) * 10));
		i++;
		if (i>359)
			i = 0;
	}
}
