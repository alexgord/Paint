import java.awt.Graphics;


public class RectangleTool extends RectangleBaseTool
{
	private Rectangle rec;
	public RectangleTool(ToolBox tbox)
	{
		super(tbox);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void addToPicture()
	{
		// TODO Auto-generated method stub
		rec = new Rectangle(getX1(), getY1(), getX2() - getX1(), getY1() - getY2(), null, null, getX1());
		tbox.getCanvas().add(new CanvasComponent(rec)); //canvas = new CanvasComponent(rec);
		tbox.getCanvas().repaint();
	}

	//@Override
	//public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//.paint(g);
	//}
}
