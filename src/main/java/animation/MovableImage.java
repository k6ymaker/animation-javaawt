package animation;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

public class MovableImage extends JPanel{
	private int xx;
	private int yy;
	private int hh;
	private int ww;
    private Image movableimage;
    
    public MovableImage(int xx,int yy,int h,int w,Image movableimage){
    	  this.xx = xx;
    	  this.yy = yy;
    	  this.hh = h;
    	  this.ww = w;
    	  this.movableimage = movableimage;
    	  
    }
    public MovableImage(int x,int y,int h,int w){
          this.xx = w;
          this.yy = y;
          this.hh = h;
          this.ww = w; 
    }
    public int rex(){
    	return xx;
    }
    public int rey(){
    	return yy;
    }
    public int reh(){
    	return hh;
    }
    public int rew(){
    	return ww;
    }
    public void setxy(int x,int y){
    	this.xx = x;
    	this.yy = y;
    	repaint();
    }
    public void MoveYUp(){
    	 yy-=5;
    	 repaint();
    }
    public void MoveYDown(){
    	yy+=5;
    	repaint();
    }
    public void setx(int x){
    	this.xx=x;
    }
    public void sety(int y){
    	this.yy=y;
    }
    public void seth(int h){
    	this.hh = h;
    }
    public void setw(int w){
    	this.ww = w;
    }
    public void MoveXRight(){
    	xx+=5;
    	System.out.println(xx+"!!");
    	repaint();
    }
    public void MoveXLeft(){
    	xx-=5;
    	System.out.println(xx);
    	repaint();
    }
    
    public void sethw(int h,int w){
    	this.hh=h;
    	this.ww=w;
    }
    public void setIamge(Image movableimage){
    	 this.movableimage = movableimage;
    }
    
    public void paintComponent(Graphics g){
    	super.paintComponent(g);
    	
    	if(movableimage != null){
    		g.drawImage(movableimage, xx, yy, ww, hh, this);
    	}
    }
} 
