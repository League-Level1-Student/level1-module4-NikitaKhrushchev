package _05_typing_tutor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingGame implements KeyListener {
static JFrame frame;
static JPanel pan;
static JLabel b1;
char curChar;
public void l() {
	
	frame = new JFrame();
//	frame.setSize(400, 400);
	pan = new JPanel();
	b1 = new JLabel();
	b1.addKeyListener(this);
	b1.setText("button");
	b1.setSize(300, 300);
	b1.setFont(b1.getFont().deriveFont(28.0f));
	b1.setHorizontalAlignment(JLabel.CENTER);
	frame.add(pan);
	pan.add(b1);
	frame.setVisible(true);
	frame.pack();
	//run();
}
public void run() {
//	frame
	
	curChar = generateRandomLetter();
	String a = Character.toString(curChar);
	b1.setText(a);
}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println(e);
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println(e.getKeyChar());
	System.out.println(Character.toString(curChar));
//	if (e.getKeyChar() == curChar) {
//		System.out.println("nice");
//	}
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


}
