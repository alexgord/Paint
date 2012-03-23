import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;


public class RectangleTool extends RectangleBaseTool
{
	private Rectangle rec;
	public RectangleTool(ToolBox tbox)
	{
		super(tbox);
		//this.addToPicture();
		//this.tbox.setCanvas(new CanvasComponent(new Rectangle(0, 0, 100, 100, Color.black, Color.black,1)));
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void addToPicture()
	{
		rec = new Rectangle(this.getX1(), this.getY1(), this.getY2() - this.getY1(), this.getX2() - this.getX1(), Color.black, Color.black,1);
		tbox.getCanvas().add(rec);
		this.canvasRepaint();
		System.out.println("inside rectangle tool addtopicture");
	}

	//@Override
	//public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//.paint(g);
	//}
}
