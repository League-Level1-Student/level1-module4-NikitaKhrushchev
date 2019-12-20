package _01_nasty_surprise;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastysurprise implements MouseListener {
JFrame frame = new JFrame();
JButton b1 = new JButton();
JButton b2 = new JButton();
JPanel pa = new JPanel();
public void start() {
	frame.add(pa);
	b1.addMouseListener(this);
	b1.setText("Trick");
	b2.setText("Treat");
	pa.add(b1);
	pa.add(b2);
	frame.pack();
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == b1) {
		showPictureFromTheInternet("data:image/jpeg;base64,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");
	}
	else {
		showPictureFromTheInternet("data:image/jpeg;base64,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");
	}
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
private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
}
