public class LineTool extends RectangleBaseTool
{
	private Line line;
	public LineTool(ToolBox tbox)
	{
		super(tbox);
	}

	/****************************************************************************
							addToPicture Function
			Function adds a line shape to the toolbox's canvas
			so that it may be drawn to the screen.
	 ****************************************************************************/
	@Override
	protected void addToPicture()
	{		
		line = new Line(this.getX1(), this.getY1(), this.getX2(), this.getY2(), tbox.getFGColor());
		tbox.getCanvas().add(line);
		this.canvasRepaint();
		System.out.println("inside rectangle tool addtopicture");
	}
}
