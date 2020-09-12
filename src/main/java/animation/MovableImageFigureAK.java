package animation;


import java.awt.*;

import javax.swing.*;



public class MovableImageFigureAK extends MovableImageFigure {
	
	JPanel jp;
    public MovableImageFigureAK(int xx,int yy,int h,int w,Image image1,Image image2,Image image3,Image image4,JPanel jp){
    	super(xx,yy,h,w,image1,image2,image3,image4);
    	Timer timer= new Timer(500,new TimerListener());
    	timer.start();
    	this.jp=jp;
    }
    
   public void paintComponent (Graphics g){
 	    	super.paintComponent(g);
 	    	Image image1=reImage1();
	    	Image image2=reImage2();
	    	Image image3=reImage3(); 
	    	Image image4=reImage4();
	        if(super.rex()<-20){
	        	setx(200);
	        	sety(200);	        
	        }  
	        if(super.rex()>390)
	        { 
	            setx(200);
	            sety(200);
	        }
	        if(super.rey()<5)
	        {
	        	setx(200);
	        	sety(200);
	        }
	        if(super.rey()>385)
	        { 
	        	setx(200);
	        	sety(200);
	        }
 	    	if(reState()==1&&image1!=null){   	
 	    		g.drawImage(image1, super.rex(),super.rey(),super.rew(),super.reh(),this);
 	    		setState(2);
 	    	}
 	    	else if(reState()==2&&image2!=null){
 	     		g.drawImage(image2, super.rex(),super.rey(),super.rew(),super.reh(),this);
 	     		setState(3);
 	     	}
 	    	else if(reState()==3&&image3!=null){
 	    		g.drawImage(image3, super.rex(),super.rey(),super.rew(),super.reh(),this);
 	     		setState(4);
 	    	}
 	    	else if(reState()==4&&image4!=null){
 	    		g.drawImage(image4, super.rex(),super.rey(),super.rew(),super.reh(),this);
 	     		setState(1);
 	    	}
 	    }
 	
 

}
