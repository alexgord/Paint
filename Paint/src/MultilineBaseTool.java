import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public abstract class MultilineBaseTool extends Tool
{
	private Point lastPoint; // The last point on the screen the cursor was when mousePressed was called
	private Point lastPointMoved; //The last point on the screen the cursor was when mouseMoved was called
	private ArrayList<Integer> xValues; //The collection of all x values of the multiline shape
	private ArrayList<Integer> yValues; //The collection of all y values of the multiline shape
	public MultilineBaseTool(ToolBox tbox)
	{
		super(tbox);
		Reset();
	}

	/****************************************************************************
									Reset Function
			Function resets all necessary values so that after a double click
			a new line is started        
	 ****************************************************************************/
	private void Reset()
	{
		lastPoint = new Point(-1,-1);
		lastPointMoved = new Point(-1,-1);
		xValues = new ArrayList<Integer>();
		yValues = new ArrayList<Integer>();
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		if (lastPoint.x != e.getX() || lastPoint.y != e.getY()) //If the user did not double click
		{
			int x;
			int y;
			x = e.getX();
			y = e.getY();
			//remember we clicked here, to properly display the preview
			lastPoint.x = x;
			lastPoint.y = y;
			//Add this position to the list of points needed to draw this shape
			xValues.add(x);
			yValues.add(y);
			System.out.println("not equal");
		}
		else
		{
			this.addToPicture();
			System.out.println("equal");
			Reset();
		}
		//Begin drawing the preview
		Graphics g = tbox.getCanvas().getGraphics();
		g.setXORMode(Color.LIGHT_GRAY);
		g.drawLine(e.getX(),e.getY(), e.getX(), e.getY());
		//Remember that this was the last place we were while moving the mouse
		lastPointMoved.x = lastPoint.x;
		lastPointMoved.y = lastPoint.y;
		System.out.println("inside multilinebasetool mouseClicked");
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{

	}

	@Override
	public void mouseReleased(MouseEvent e)
	{

	}

	@Override
	public void mouseClicked(MouseEvent e)
	{

	}

	public ArrayList<Integer> getxValues()
	{
		return xValues;
	}

	public ArrayList<Integer> getyValues()
	{
		return yValues;
	}

	@Override
	public void mouseMoved(MouseEvent e)
	{
		if (lastPoint.x != -1 || lastPoint.y != -1)//If we've already clicked our first point
		{
			//Then we can begin drawing the preview
			Graphics g = tbox.getCanvas().getGraphics();
			g.setXORMode(Color.LIGHT_GRAY);
			//Erase the old preview
			g.drawLine(lastPoint.x,lastPoint.y, lastPointMoved.x, lastPointMoved.y);
			//Draw the new preview
			g.drawLine(lastPoint.x,lastPoint.y, e.getX(), e.getY());
			lastPointMoved.x = e.getX();
			lastPointMoved.y = e.getY();
		}
	}

}
