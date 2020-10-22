package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int w;
    private int h;
    
    Polymorph(int x, int y, int w, int h){
   	 this.x = x;
   	 this.y = y;
   	 this.w = w;
   	 this.h = h;
    }
    
    public Integer getX() {
    	return x;
    }
    
    public void setX(int x) {
    	this.x = x;
    }
    
    public Integer getY() {
    	return y;
    }
    
    public void setY(int y) {
    	this.y = y;
    }
    
    public Integer getW() {
    	return w;
    }
    
    public void setW(int w) {
    	this.w = w;
    }
    
    public Integer getH() {
    	return h;
    }
    
    public void setH(int h) {
    	this.h = h;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
