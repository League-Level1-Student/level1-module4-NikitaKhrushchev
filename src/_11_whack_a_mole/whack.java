package _11_whack_a_mole;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whack implements MouseListener {
JFrame fr = new JFrame();
JPanel p = new JPanel();
JButton[] bl = new JButton[16]; 
Random r = new Random();
JButton current;
int score = 0;
whack(){
	fr.add(p);
	fr.setSize(400, 400);
	fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	for (int i = 0; i < bl.length; i++) {
		bl[i] = new JButton();
		JButton s = bl[i];
		s.addMouseListener(this);
		s.setSize(20,20);
		
		//System.out.println(s.getSize());
		bl[i].setText("");//Integer.toString((char) i));
		p.add(s);
		//System.out.println(s.getSize());
	}
	p.setLayout(new GridLayout(4, 4));
	fr.setVisible(true);
	randomButton();
	}
void randomButton() {
	int a = r.nextInt(16);
	current = bl[a];
	current.setText("mole!");
	fr.setVisible(true);
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource()==current) {
		System.out.println("got it");
		score +=1;
		if(score == 10) {
			endGame(null, score);
		}
	}
	else{
		System.out.println((e.getSource()==current));
	}
	current.setText("");
	randomButton();
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
private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date(molesWhacked);
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}
}
