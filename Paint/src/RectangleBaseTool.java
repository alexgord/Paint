import java.awt.event.MouseEvent;


public abstract class RectangleBaseTool extends Tool
{
	
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	
	public RectangleBaseTool(ToolBox tbox)
	{
		super(tbox);
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
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
		x1=e.getX();
		y1=e.getY();
		System.out.println("getx: " + e.getX());
		System.out.println("getxonscreen: " + e.getXOnScreen());
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		x2=e.getX();
		y2=e.getY();
		System.out.println("inside rectanglebasetool mouseRealeased");
		this.addToPicture();
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
