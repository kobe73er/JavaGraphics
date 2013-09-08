package FengChe;

import javax.swing.JFrame;

import DrawArcs.ArcsPanel;

public class Client extends JFrame {

	public Client() {
		setTitle("FengChe");
		getContentPane().add(new FengChe());
	}

	/** Main method */
	public static void main(String[] args) {
		Client frame = new Client();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 300);
		frame.setVisible(true);
	}
}