public class EllipseTool extends RectangleBaseTool
{
	private Ellipse eli;
	public EllipseTool(ToolBox tbox)
	{
		super(tbox);
	}

	@Override
	protected void addToPicture()
	{
		// Deal with dragging from right to left, because that causes problems if you use the raw data
		int x = Math.min(this.getX1(), this.getX2());
		int y = Math.min(this.getY1(), this.getY2());
		int height = Math.max(this.getY1(), this.getY2()) - Math.min(this.getY1(), this.getY2());
		int width = Math.max(this.getX1(), this.getX2()) - Math.min(this.getX1(), this.getX2());			
		eli = new Ellipse(x, y, height, width, tbox.getBGColor(), tbox.getFGColor(),1);
		tbox.getCanvas().add(eli);
		this.canvasRepaint();
		System.out.println("inside rectangle tool addtopicture");

	}

}
