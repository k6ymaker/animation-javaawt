package animation;
import java.awt.*;


import java.awt.event.*;

public class MovableImageFigure extends MovableImage{
	private Image image1;
	private Image image2;
	private Image image3;
	private Image image4;
	private int state=1;
    public MovableImageFigure(int xx,int yy,int h,int w,Image image1,Image image2,Image image3,Image image4){
    	super(xx,yy,h,w);
    	this.image1=image1;
    	this.image2=image2;
    	this.image3=image3;
    	this.image4=image4;
    }

    public int reState(){
    	return state;
    }
    public void setState(int state){
    	this.state = state;
    }
    public Image reImage1(){
    	return image1;
    }
    public Image reImage2(){
    	return image2;
    }
    public Image reImage3(){
    	return image3;
    }
    public Image reImage4(){
    	return image4;
    }
    
    
    
    public void setImage1(Image image1){
    	this.image1 = image1;
    	repaint();
    	System.out.println("image1 has changed.");
    }
    public void setImage2(Image image2){
    	this.image2 = image2;
    	repaint();
    	System.out.println("image2 has changed.");
    }
    public void setImage3(Image image3){
    	this.image3 = image3;
    	repaint();
    	System.out.println("image3 has changed.");
    }
    public void setImage4(Image image4){
    	this.image4 = image4;
    	repaint();
    	System.out.println("image4 has changed.");
    }
    
    
    public void paintComponent(Graphics g){
    	//System.out.println("x:"+super.rex()+" y:"+super.rey());
    	super.paintComponent(g);
    	if(state==1&&image1!=null){   	
    		g.drawImage(image1, super.rex(),super.rey(),super.rew(),super.reh(),this);
    		this.state++;
    	}
    	else if(state==2&&image2!=null){
     		g.drawImage(image2, super.rex(),super.rey(),super.rew(),super.reh(),this);
     		this.state++;
     	}
    	else if(state==3&&image3!=null){
    		g.drawImage(image3, super.rex(),super.rey(),super.rew(),super.reh(),this);
     		this.state++;
    	}
    	else if(state==4&&image4!=null){
    		g.drawImage(image3, super.rex(),super.rey(),super.rew(),super.reh(),this);
     		this.state = 1;
    	}
    }
    public class TimerListener implements ActionListener{
    	public void actionPerformed(ActionEvent e){
    		repaint();
    	}
    }
}