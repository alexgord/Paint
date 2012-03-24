import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;


public abstract class RectangleBaseTool extends Tool
{

	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private Point previousPoint;

	public RectangleBaseTool(ToolBox tbox)
	{
		super(tbox);
		Reset();
	}

	/****************************************************************************
								Reset Function
		Function resets all values needed to properly draw the next rectangle        
	 ****************************************************************************/
	public void Reset()
	{
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
		previousPoint = new Point(-1,1);
	}

	public int getX1() {
		return x1;
	}

	public int getX2() {
		return x2;
	}

	public int getY1() {
		return y1;
	}

	public int getY2() {
		return y2;
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		//Remember where we started the shape
		x1=e.getX();
		y1=e.getY();
		Graphics g = tbox.getCanvas().getGraphics();
		//Start Drawing the preview
		g.setXORMode(Color.LIGHT_GRAY);
		g.drawRect(x1, y1, 0, 0);
		previousPoint.x = e.getX();
		previousPoint.y = e.getY();
		System.out.println("getx: " + e.getX());
		System.out.println("getxonscreen: " + e.getXOnScreen());
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		//Continue drawing the preview
		Graphics g = tbox.getCanvas().getGraphics();
		g.setXORMode(Color.LIGHT_GRAY);
		// Deal with dragging from right to left, because that causes problems if you use the raw data
		int x = Math.min(previousPoint.x, x1);
		int y = Math.min(previousPoint.y, y1);
		int height = Math.max(previousPoint.y, y1) - Math.min(previousPoint.y, y1);
		int width = Math.max(previousPoint.x, x1) - Math.min(previousPoint.x, x1);
		//Erase the old preview
		g.drawRect(x, y, width, height);
		// Deal with dragging from right to left, because that causes problems if you use the raw data
		x = Math.min(e.getX(), x1);
		y = Math.min(e.getY(), y1);
		height = Math.max(e.getY(), y1) - Math.min(e.getY(), y1);
		width = Math.max(e.getX(), x1) - Math.min(e.getX(), x1);
		//Draw the new preview
		g.drawRect(x, y, width, height);
		previousPoint.x = e.getX();
		previousPoint.y = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		//Remember where we finished drawing the shape
		x2=e.getX();
		y2=e.getY();
		System.out.println("inside rectanglebasetool mouseRealeased");
		this.addToPicture();
		Reset();
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
	}

	@Override
	public void mouseMoved(MouseEvent e)
	{
	}

}
