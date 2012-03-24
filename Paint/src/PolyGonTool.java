
public class PolyGonTool extends MultilineBaseTool {

	private Polygon pg;
	public PolyGonTool(ToolBox tbox)
	{
		super(tbox);
	}

	/****************************************************************************
							addToPicture Function
			Function adds a polygon shape to the toolbox's canvas
			so that it may be drawn to the screen.
	 ****************************************************************************/
	@Override
	protected void addToPicture()
	{
		pg = new Polygon(ArrayHelper.convertToPrimitive(this.getxValues()), ArrayHelper.convertToPrimitive(this.getyValues()), this.getxValues().size(), tbox.getBGColor(), tbox.getFGColor());
		tbox.getCanvas().add(pg);
		this.canvasRepaint();
		System.out.println("inside polylinetool tool addtopicture");
	}

}
