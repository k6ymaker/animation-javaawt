package animation;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame{
	private Image image1  = new ImageIcon("").getImage();
	private Image image2  = new ImageIcon("").getImage();
	private Image image3  = new ImageIcon("").getImage();
	private Image image4  = new ImageIcon("").getImage();

	
	JPanel Contrl  = new JPanel();
	
	
	MovableImageFigureAK mif = new  MovableImageFigureAK(0,200,200,200,image1,image2,image3,image4,Contrl); 
	
	Button submit = new Button("点击更换图片");
	
	ImageCanvas showimage1 = new ImageCanvas(image1);
	ImageCanvas showimage2 = new ImageCanvas(image2);
	ImageCanvas showimage3 = new ImageCanvas(image3);
	ImageCanvas showimage4 = new ImageCanvas(image4);
	
    private FileChooser fc1 = new FileChooser(showimage1);
    private FileChooser fc2 = new FileChooser(showimage2);
    private FileChooser fc3 = new FileChooser(showimage3);
    private FileChooser fc4 = new FileChooser(showimage4);
    

	
	public Main()
	{

	    setLayout(new GridLayout(0,2));
	    submit.setFocusable(false);

		Contrl.setLayout(new GridLayout(0,2,5,5));
		Contrl.add(showimage1);
		Contrl.add(fc1);
		Contrl.add(showimage2);
		Contrl.add(fc2);
		Contrl.add(showimage3);
		Contrl.add(fc3);
		Contrl.add(showimage4);
		Contrl.add(fc4);
		Contrl.add(submit);
		Contrl.setSize(400, 600);

		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e){
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_UP){
					mif.MoveYUp();
					System.out.println("up");
				}

				if (keyCode == KeyEvent.VK_DOWN){
					mif.MoveYDown();
					System.out.println("down");
				}

				if (keyCode == KeyEvent.VK_LEFT){
					mif.MoveXLeft();
					System.out.println("lift");
				}

				if (keyCode == KeyEvent.VK_RIGHT){
					mif.MoveXRight();
					System.out.println("right");
				}
			}
		});

		Contrl.setFocusable(false);

		add(Contrl);
		add(mif);

		submit.addActionListener(
		   new  ActionListener(){
			public void actionPerformed(ActionEvent e){
				mif.setImage1(showimage1.reImage());
				mif.setImage2(showimage2.reImage());
				mif.setImage3(showimage3.reImage());
				mif.setImage4(showimage4.reImage());

			}
			
		});

		setFocusable(false);
		setResizable(false);
	}





	public static void main(String[] args) {
		Main mn = new Main();
		mn.setTitle("k6ymaker牌动画演示");
		mn.setLocationRelativeTo(null);
		mn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mn.setSize(1100,600);
	    mn.setVisible(true);

	    mn.setFocusable(true);
	}


}
