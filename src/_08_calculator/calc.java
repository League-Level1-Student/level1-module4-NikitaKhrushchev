package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calc implements MouseListener, ActionListener {
JFrame fr = new JFrame();
JPanel pa = new JPanel();
JLabel l = new JLabel();
JTextField tf = new JTextField(6);
JTextField tf2 = new JTextField(6);
JButton b1 = new JButton();
JButton b2 = new JButton();
JButton b3 = new JButton();
JButton b4 = new JButton();
calc() {
	fr.addMouseListener(this);
	fr.setVisible(true);
	fr.add(pa);
//	pa.add(l);
//	l.setText("add");
	pa.add(tf);
	pa.add(tf2);
	b1.setText("Add");
	b1.addActionListener(this);
	pa.add(b1);
	b2.setText("Subract");
	b2.addActionListener(this);
	pa.add(b2);
	b3.setText("Multiply");
	b3.addActionListener(this);
	pa.add(b3);
	b4.setText("Divide");
	b4.addActionListener(this);
	pa.add(b4);
	pa.add(l);
	
//	tf.resize(0,70);
//	tf.set
	fr.pack();
}
void add() {
	int a = ((int) Integer.parseInt(tf.getText()));
	int b = ((int) Integer.parseInt(tf2.getText()));
	int c = a + b;
	String d = Integer.toString((char) c);
	System.out.println(a+b);
	l.setText(Integer.toString((char) (a+b)));
	
	fr.pack();
}
void subtract() {
	
}
void multiply() {
	
}
void divide() {
	
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
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
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println(e.getSource());
	System.out.println(e.getSource()==(b1));
	if (e.getSource()==(b1)) {
		add();
	}
	if (e.getSource()==(b2)) {
		subtract();
	}
	if (e.getSource().equals(b3)) {
		multiply();
	}
	if (e.getSource().equals(b4)) {
		divide();
	}
}
}
