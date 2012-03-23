import java.awt.Frame;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;

import javax.swing.SwingUtilities;


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
		x1=e.getX();
		y1=e.getY();
		System.out.println("getx: " + e.getX());
		System.out.println("getxonscreen: " + e.getXOnScreen());
		//x1 = (int) MouseInfo.getPointerInfo().getLocation().getX();
		//y1 = (int) MouseInfo.getPointerInfo().getLocation().getY();
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		x2=e.getX();
		y2=e.getY();
		//x2 = (int) MouseInfo.getPointerInfo().getLocation().getX();
		//y2 = (int) MouseInfo.getPointerInfo().getLocation().getY();
		System.out.println("inside rectanglebasetool mouseRealeased");
		this.addToPicture();
		
		//tbox.setCurrentTool(null);
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
