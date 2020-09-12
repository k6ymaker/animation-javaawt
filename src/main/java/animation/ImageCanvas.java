package animation;
import java.awt.*;
import javax.swing.*;

public class ImageCanvas extends JPanel{
	ImageIcon imageIcon = new ImageIcon("image/AK/1.gif");
	Image image= imageIcon.getImage();
	public ImageCanvas(Image image){
		this.image = image;
		this.setVisible(true);
		this.setFocusable(false);
		repaint();
		this.setSize(400, 410);
	}

    protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(image != null)
			g.drawImage(image, 0, 0,getSize().width,getSize().height,this);
	}
	public void setImage(Image image){
		this.image = image;
		repaint();
	}
	public Image reImage(){
		return image;
	}

}
