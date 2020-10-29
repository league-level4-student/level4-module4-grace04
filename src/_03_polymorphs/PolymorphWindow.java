package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    /*Polymorph bluePoly;
    Polymorph redMor;
    Polymorph moveMor;*/
    
    ArrayList<Polymorph> mor = new ArrayList<Polymorph>();
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 /*bluePoly = new BluePolymorph(20, 20, 20, 20);
   	 redMor = new RedMorph(20, 60, 20, 20);
   	 moveMor = new MovingMorph(20, 100, 20, 20);*/
   	 
   	 for(int i=0;i<4;i++) {
   		 if(i%4==0)
   			 mor.add(new CircleMorph(25, i*4*25+25, 25, 25));
   		 else if(i%4==1)
   			 mor.add(new FollowMorph(25, i*4*25+25, 25, 25));
   		 else if(i%4==2)
   			 mor.add(new ImageMorph(25, i*4*25+25, 25, 25));
   		 else
   			 mor.add(new ClickMorph(25, i*4*20+25, 25, 25));
   	 }
   	 
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 
   	 /*bluePoly.draw(g);
   	 redMor.draw(g);
   	 moveMor.draw(g);*/
   	 
   	 for(int i=0;i<mor.size();i++) {
   		 mor.get(i).draw(g);
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 
   	 /*bluePoly.update();
   	 redMor.update();
   	 moveMor.update();*/
   	 
   	for(int i=0;i<mor.size();i++) {
  		 mor.get(i).update();
  	 }
    }
}
