import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
public class Main {

	public static void main(String[] args) {
		// Jlabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("castor.png"); // create an ImageIcon
		Border border = BorderFactory.createLineBorder(Color.GREEN, 3); // create a border
		JLabel label = new JLabel(); // create a new label
		label.setText("This is my first label"); // set text of label
		label.setIcon(image); // add icon to label
		label.setHorizontalTextPosition(JLabel.RIGHT); // set text LEFT, CENTER, RIGHT of image icon
		label.setVerticalTextPosition(JLabel.CENTER); // set text TOP, CENTER, BOTTOM of image icon
		label.setForeground(Color.BLUE); // set font color of text
		label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set font of text
		label.setIconTextGap(10); // set gap of text to image
		label.setBackground(Color.BLACK); // set background color
		label.setOpaque(true); // display background color
		label.setBorder(border); // add border to label
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label);
		JFrame frame = new JFrame(); // creates a frame
		label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
		//label.setBounds(-500, -500, 1500, 1500); // set x, y position within frame as well as dimensions
		
		frame.setTitle("JLabel Demo"); // sets title of frame);
		frame.setVisible(true); // makes frame visible
		frame.setSize(500, 500); // sets x-dimension, y-dimension
		//frame.setLayout(null); // set layout
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		frame.add(label); // add label to frame
		frame.pack(); // fit size of frame to components
	}

}
