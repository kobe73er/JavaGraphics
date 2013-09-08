package BookExample;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class TestFiggurePanel extends JFrame{
	public TestFiggurePanel(){
		setLayout(new GridLayout(2, 3, 5, 5));
		add(new FigurePanel(FigurePanel.LINE));
		add(new FigurePanel(FigurePanel.RECTANGLE));
	}
	
	public static void main(String[] args){
		TestFiggurePanel frame=new TestFiggurePanel();
		frame.setSize(400,200);
		frame.setTitle("TestFigure");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
