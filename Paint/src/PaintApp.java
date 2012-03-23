import java.awt.BorderLayout;

import javax.swing.JFrame;

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
		CanvasComponent canvas = new CanvasComponent();
		frame.setBounds(0, 0, 500, 500);
		canvas.setBounds(tbox.getBounds());
		canvas.setTbox(tbox);
		tbox.setCanvas(canvas, frame);
		frame.add(tbox.getCanvas());
		frame.add(canvas, BorderLayout.CENTER);		
		frame.setVisible(true);
	}
}
