
public class PolyGonTool extends MultilineBaseTool {
	
	private Polygon pg;
	public PolyGonTool(ToolBox tbox)
	{
		super(tbox);
	}

	@Override
	protected void addToPicture()
	{
		pg = new Polygon(ArrayHelper.convertToPrimitive(this.getxValues()), ArrayHelper.convertToPrimitive(this.getyValues()), this.getxValues().size(), tbox.getBGColor(), tbox.getFGColor());
		tbox.getCanvas().add(pg);
		this.canvasRepaint();
		System.out.println("inside polylinetool tool addtopicture");
	}

}
