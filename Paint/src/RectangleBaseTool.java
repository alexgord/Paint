import java.awt.MouseInfo;
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
		// TODO Auto-generated constructor stub
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
		x1 = MouseInfo.getPointerInfo().getLocation().x;
		y1 = MouseInfo.getPointerInfo().getLocation().y;
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		x2 = MouseInfo.getPointerInfo().getLocation().x;
		y2 = MouseInfo.getPointerInfo().getLocation().y;
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
}
