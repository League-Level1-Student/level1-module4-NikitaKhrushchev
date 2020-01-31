package _10_pig_latin;

import java.awt.Button;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class i implements MouseListener {
JFrame fr = new JFrame();
JPanel p = new JPanel();
JTextField tf = new JTextField(12);
JButton b = new JButton("translate");
JLabel l = new JLabel();
PigLatinTranslator plt = new PigLatinTranslator();
i(){
	fr.add(p);
	p.add(tf);
	p.add(b);
	p.add(l);
	fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fr.setVisible(true);
	fr.pack();
	b.addMouseListener(this);
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	String a = plt.translate(tf.getText());
	l.setText(a);
	fr.pack();
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}
