package _12_slot_machine;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotmachine implements ActionListener {
int e = 0;
JFrame fr = new JFrame();
JPanel p = new JPanel();
JButton b = new JButton();
JLabel l;
JLabel l2;
JLabel l3;
JLabel[] ll = new JLabel[3];
int[] numList = new int[3];
Random r = new Random();
void setup() {
	fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	b.addActionListener(this);
	fr.add(p);
	fr.setVisible(true);
	newSet();
	fr.pack();
}
void newSet() {
	for (int i = 0; i < numList.length; i++) {
		numList[i] = r.nextInt(3);
		if(e>0) {
		p.remove(ll[i]);
		}
	}
	nextSet(numList);
	for (int i = 0; i < ll.length; i++) {
		p.add(ll[i]);
		e+=1;
	}
	b.setText("spin");
	p.add(b);
	fr.setVisible(true);
}

private JLabel[] nextSet(int[] numList){
	for (int i = 0; i < numList.length; i++) {
		if (numList[i] == 0) {
			ll[i] = createLabelImage("circle.png");
		}
		if (numList[i] == 1) {
			ll[i] = createLabelImage("star.png");
		}
		if (numList[i] == 2) {
			ll[i] = createLabelImage("square.png");
		}
	}
	System.out.println(numList.length);
	return ll;
	
}


private JLabel createLabelImage(String fileName){
    URL imageURL = getClass().getResource(fileName);
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}
@Override
public void actionPerformed(ActionEvent e) {
	
	if((numList[0]== numList[0])&&(numList[2]==numList[1])) {
		fr.dispose();
		JFrame c = new JFrame();
		JLabel o = new JLabel();
		o.setText("you win");
		c.add(o);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.pack();
		c.setVisible(true);
	}
	else{
		newSet();
	}
}
}

