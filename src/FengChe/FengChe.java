package FengChe;

import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

//The class for drawing arcs on a panel
public class FengChe extends JPanel {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private int angle = 0;

	Timer timer = new Timer();

	// Graphics g是自动创建的对象，并且传递给paintComponent方法调用
	// paintComponent方法是一個會被jvm自動調用的方法
	protected void paintComponent(Graphics g) {
		System.out.println("Timer");
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				angle += 20;
				// System.out.println(angle);
				repaint();
			}
		}, 10000);//執行了這個timer方法後，休息了10秒鐘
		System.out.println("paintComponet");
		super.paintComponent(g);

		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);

		int x = xCenter - radius;
		int y = yCenter - radius;

		// g.setColor(Utils.Tools.GenerateRandomColor());
		g.fillArc(x, y, 2 * radius, 2 * radius, angle, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, angle + 90, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, angle + 180, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, angle + 270, 30);
	}

}