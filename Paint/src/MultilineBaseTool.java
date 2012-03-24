import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public abstract class MultilineBaseTool extends Tool
{
	private Point lastPoint;
	private Point lastPointMoved;
	private ArrayList<Integer> xValues;
	private ArrayList<Integer> yValues;
	public MultilineBaseTool(ToolBox tbox)
	{
		super(tbox);
		Reset();
	}

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
		if (lastPoint.x != e.getX() || lastPoint.y != e.getY())
		{
			int x;
			int y;
			x = e.getX();
			y = e.getY();
			lastPoint.x = x;
			lastPoint.y = y;
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
		Graphics g = tbox.getCanvas().getGraphics();
		g.setXORMode(Color.LIGHT_GRAY);
		g.drawLine(e.getX(),e.getY(), e.getX(), e.getY());
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
		if (lastPoint.x != -1 || lastPoint.y != -1)
		{
			Graphics g = tbox.getCanvas().getGraphics();
			g.setXORMode(Color.LIGHT_GRAY);
			g.drawLine(lastPoint.x,lastPoint.y, lastPointMoved.x, lastPointMoved.y);
			g.drawLine(lastPoint.x,lastPoint.y, e.getX(), e.getY());
			lastPointMoved.x = e.getX();
			lastPointMoved.y = e.getY();
		}
	}

}
