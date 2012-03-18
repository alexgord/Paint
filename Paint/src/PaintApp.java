import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JToolBar;


public class PaintApp {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		ToolBox tbox = new ToolBox();
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.add(tbox, BorderLayout.NORTH);
		//frame.add(canvas, BorderLayout.CENTER);
		frame.setBounds(0, 0, 500, 500);
		frame.setVisible(true);
	}

}
