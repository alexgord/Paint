import java.awt.BorderLayout;
import java.awt.Color;

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
		CanvasComponent canvas = new CanvasComponent(null);
		frame.setBounds(0, 0, 500, 500);
		canvas.setBounds(tbox.getBounds());
		canvas.setTbox(tbox);
		tbox.setCanvas(canvas, frame);
		frame.add(tbox.getCanvas());
		//Tool testTool = new Tool(ToolType.RECTANGLE);
		//testTool.addToPicture();
		//frame.add(canvas, BorderLayout.SOUTH);		
		frame.setVisible(true);
	}
}
