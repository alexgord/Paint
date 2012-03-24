public class PolyLineTool extends MultilineBaseTool
{
	private Polyline pl;
	public PolyLineTool(ToolBox tbox)
	{
		super(tbox);
	}

	/****************************************************************************
							addToPicture Function
			Function adds a polyline shape to the toolbox's canvas
			so that it may be drawn to the screen.
	 ****************************************************************************/
	@Override
	protected void addToPicture()
	{
		pl = new Polyline(ArrayHelper.convertToPrimitive(this.getxValues()), ArrayHelper.convertToPrimitive(this.getyValues()), this.getxValues().size(), tbox.getBGColor());
		tbox.getCanvas().add(pl);
		this.canvasRepaint();
		System.out.println("inside polylinetool tool addtopicture");
	}
}
