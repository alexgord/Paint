import java.awt.BorderLayout;

import javax.swing.JFrame;

/***************************************ID BLOCK***********************************************

Due Date:			March 25th, 2012
Software Designer:	Alexandre Simard
Course:				420-603  Winter 2012
Deliverable:		Assignment #3 --- Paint
Description:		This program lets the user draw shapes on the screen. The user selects
					a shape from the toolbox at the top of the window, and then draws the
					shape either by clicking multiple times or clicking and dragging the
					mouse, depending on the shape.

******************************************************************************************************/
public class PaintApp
{


	public static void main(String[] args)
	{
		ToolBox tbox = new ToolBox();
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout());
		//Add the toolbox to the top of the screen
		frame.add(tbox, BorderLayout.NORTH);
		//Initialise the CanvasCompent that all tools will use to draw their shapes
		CanvasComponent canvas = new CanvasComponent();
		frame.setBounds(0, 0, 500, 500);
		canvas.setBounds(tbox.getBounds());
		canvas.setTbox(tbox); //Set the toolbox so all tools may use it
		tbox.setCanvas(canvas, frame);
		frame.add(tbox.getCanvas());
		//Add the canvas where all the shapes will be drawn. This time underneath the toolbox
		frame.add(canvas, BorderLayout.CENTER);		
		frame.setVisible(true);
	}
}
