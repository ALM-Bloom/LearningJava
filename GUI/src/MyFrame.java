import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	MyFrame() {
		JFrame frame = new JFrame(); // creates a frame
		
		this.setTitle("Example Title"); // sets title of frame);
		this.setVisible(true); // makes this visible
		this.setSize(500, 500); // sets x-dimension, y-dimension
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		this.setResizable(false); // prevent this from being resized
		
		ImageIcon image = new ImageIcon("example.png"); // create an ImageIcon
		this.setIconImage(image.getImage()); // change icon of this
		this.getContentPane().setBackground(Color.red); // change color of background
	}
}
