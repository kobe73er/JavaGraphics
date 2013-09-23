package String;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestCenterMessage extends JFrame {
	public TestCenterMessage() {
		CenterMessage messagePanel = new CenterMessage();
		add(messagePanel);
		messagePanel.setBackground(Color.WHITE);
		messagePanel.setFont(new Font("Californian FB", Font.BOLD, 30));
	}

	public static void main(String[] args) {
		TestCenterMessage frame = new TestCenterMessage();
		// add(messagePanel);
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}

class CenterMessage extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		FontMetrics fm = g.getFontMetrics();

		int stringWidth = fm.stringWidth("Welcome to Java");
		int stringAscent = fm.getAscent();

		int xCoordinate = getWidth() / 2 - stringWidth / 2;
		int yCoordinate = getHeight() / 2 + stringAscent / 2;

		System.out.println(stringWidth);

		g.drawString("Welcome to Java", xCoordinate, yCoordinate);

	}

}
