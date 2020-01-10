package _04_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class jokeBot {
static JFrame frame;
static JPanel pa;
static JButton b1;
static JButton b2;
public static void main(String[] args) {
	makeButtons();
	
}
static void makeButtons() {
	System.out.println("sd");
	frame = new JFrame();
	pa = new JPanel();
	b1 = new JButton("Joke");
	b2 = new JButton("Punchline");
	pa.add(b1);
	pa.add(b2);
	frame.add(pa);
	frame.pack();
	frame.setVisible(true);
}
}
