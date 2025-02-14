import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		// Jframe = a GUI window to add components to
		/*
		JFrame frame = new JFrame(); // creates a frame
		
		frame.setTitle("Example Title"); // sets title of frame);
		frame.setVisible(true); // makes frame visible
		frame.setSize(500, 500); // sets x-dimension, y-dimension
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		frame.setResizable(false); // prevent frame from being resized
		
		ImageIcon image = new ImageIcon("example.png"); // create an ImageIcon
		frame.setIconImage(image.getImage()); // change icon of frame
		frame.getContentPane().setBackground(Color.red); // change color of background
		*/
		
		MyFrame frame = new MyFrame();
	}

}
