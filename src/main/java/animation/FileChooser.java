package animation;


import java.awt.Image;
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.io.File;  

import javax.swing.ImageIcon;
import javax.swing.JButton;  
import javax.swing.JFileChooser;
import javax.swing.JLabel;  

public class FileChooser extends JButton implements ActionListener{  
  
	
  JButton open=null;
  File file ;
  ImageCanvas ic;
  public static void main(String[] args) {  
     
  }  
  public FileChooser(ImageCanvas ic){ 
	  this.ic = ic;
      open=new JButton("open");  
      this.add(open);  
      this.setBounds(400, 200, 100, 100);  
      this.setVisible(true);
      this.setFocusable(false);
      open.setFocusable(false);
      open.addActionListener(this);  
  }
  public File reiamgefile(){
	   return this.file;
  }


  public void actionPerformed(ActionEvent e) {  
      // TODO Auto-generated method stub  
      JFileChooser jfc=new JFileChooser();
      jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );  
      jfc.showDialog(new JLabel(), "选择图片");
      File file=jfc.getSelectedFile(); 
      this.file = file;
      if(file.isDirectory()){  
          System.out.println("文件夹:"+file.getAbsolutePath());
      }else if(file.isFile()){  
          System.out.println("文件:"+file.getAbsolutePath());
          Image image = new ImageIcon(file.getAbsolutePath()).getImage();
          ic.setImage(image);          
      }

      System.out.println(jfc.getSelectedFile().getName());
  }  

}  