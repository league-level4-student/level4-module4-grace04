package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph {
	BufferedImage im;
	
	ImageMorph(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
		try {
			im = ImageIO.read(this.getClass().getResourceAsStream("image.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getW(), getH());
		g.drawImage(im, getW(), getH(), null);
	}

	public void update() {
		
	}
}
