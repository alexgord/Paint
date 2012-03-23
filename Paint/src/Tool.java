import java.awt.event.MouseEvent;
/*
 * Superclass to all Tool in the ToolBox.
 */
abstract public class Tool
{
	final protected ToolBox tbox;
	public Tool(ToolBox tbox)
	{
		this.tbox = tbox;
	}
	
	public void canvasRepaint()
	{
		tbox.getCanvas().repaint();
	}
	/*
	 * Each shape should add itself to the current Picture
	 * object inside the canvas.
	 * it’s abstract: each subclass must implement their own.
	 */
	abstract protected void addToPicture();
	/*
	 * Abstract public methods for handling mouse events
	 */
	abstract public void mousePressed(MouseEvent e);
	abstract public void mouseDragged(MouseEvent e);
	abstract public void mouseReleased(MouseEvent e);
	abstract public void mouseClicked(MouseEvent e);
	abstract public void mouseMoved(MouseEvent e);
}