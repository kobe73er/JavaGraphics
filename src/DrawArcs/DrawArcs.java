package DrawArcs;

import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.Graphics;

public class DrawArcs extends JFrame {

	public DrawArcs() {
		setTitle("DrawArcs");
		getContentPane().add(new ArcsPanel());
	}

	/** Main method */
	public static void main(String[] args) {
		DrawArcs frame = new DrawArcs();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 300);
		frame.setVisible(true);
	}
}
