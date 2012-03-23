public class PolyLineTool extends MultilineBaseTool
{
	private Polyline pl;
	public PolyLineTool(ToolBox tbox)
	{
		super(tbox);
	}

	@Override
	protected void addToPicture()
	{
		pl = new Polyline(ArrayHelper.convertToPrimitive(this.getxValues()), ArrayHelper.convertToPrimitive(this.getyValues()), this.getxValues().size(), tbox.getBGColor());
		tbox.getCanvas().add(pl);
		this.canvasRepaint();
		System.out.println("inside polylinetool tool addtopicture");
	}
}
