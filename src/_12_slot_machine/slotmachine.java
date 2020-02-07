package _12_slot_machine;


import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotmachine {
JFrame fr = new JFrame();
JPanel p1 = new JPanel();
JPanel p2 = new JPanel();
JPanel p3 = new JPanel();
JLabel l1;
JLabel l2;
JLabel l3;
JButton b = new JButton();
void setup() throws MalformedURLException{
	fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fr.add(p1);
	fr.add(p2);
	fr.add(p3);
	fr.add(b);
	l1 = createLabelImage("circle.jpg");
	
	l2 = createLabelImage("square.jpg");
	l3 = createLabelImage("star.jpg");
	l1.setSize(40, 40);
	l2.setSize(40, 40);
	l3.setSize(40, 40);
	fr.add(l1);
	fr.add(l2);
	fr.add(l3);
	fr.pack();
	fr.setVisible(true);
}
private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
//Icon icon = new ImageIcon(imageURL);
ImageIcon icon = new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
JLabel imageLabel = new JLabel();
imageLabel.setIcon(icon);
return imageLabel;
}

}
