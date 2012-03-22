import java.awt.Color;
import java.awt.Graphics;


public class RectangleTool extends RectangleBaseTool
{
	private Rectangle rec;
	public RectangleTool(ToolBox tbox)
	{
		super(tbox);
		this.addToPicture();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void addToPicture()
	{
		// TODO Auto-generated method stub
		rec = new Rectangle(1, 1, 1, 1, Color.black, Color.black,1);
		tbox.setCanvas(new CanvasComponent(rec));//getCanvas().add(new CanvasComponent(rec)); //canvas = new CanvasComponent(rec);
		tbox.getCanvas().repaint();
	}

	//@Override
	//public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//.paint(g);
	//}
}
