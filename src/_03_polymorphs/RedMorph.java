package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedMorph extends Polymorph{
	
	RedMorph(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(getX(), getY(), getW(), getH());
	}
}
