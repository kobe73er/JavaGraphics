package DrawArcs;

import java.awt.Graphics;

import javax.swing.JPanel;

//The class for drawing arcs on a panel
public class ArcsPanel extends JPanel implements Runnable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	
	private int angle=0;

	Thread t1 = new Thread(this);

	public ArcsPanel() {
		t1.start();
	}

	// Graphics g是自动创建的对象，并且传递给paintComponent方法调用
	// paintComponent方法是一個會被jvm自動調用的方法
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);

		int x = xCenter - radius;
		int y = yCenter - radius;

		g.setColor(Utils.Tools.GenerateRandomColor());
		g.fillArc(x, y, 2 * radius, 2 * radius, angle, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, angle+90, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, angle+180, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, angle+270, 30);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// repaint();
		try {
			while (true) {
				repaint();
				t1.sleep(1000);
				// System.out.println("1");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}