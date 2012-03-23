import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JToolBar;


public class ToolBox extends JToolBar
{
	final public static int FOREGROUND = 0;
	final public static int BACKGROUND = 1;
	private Color fgColor, bgColor;
	private CanvasComponent canvas;
	private ButtonGroup group;
	private Tool currentTool;
	private JFrame frame;
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public ToolBox()
	{
		fgColor = Color.black;
		bgColor = null;
		this.setBackground(Color.GRAY);
		this.setLayout(new FlowLayout());
		this.group = new ButtonGroup();
		ToolToggleButton ellipse = new ToolToggleButton("res/ellipse.png", ToolType.ELLIPSE, this);
		group.add(ellipse);
		this.add(ellipse);
		
		ToolToggleButton polyline = new ToolToggleButton("res/pline.png", ToolType.POLYLINE, this);
		group.add(polyline);
		this.add(polyline);
		
		ToolToggleButton polygon = new ToolToggleButton("res/pgon.png", ToolType.POLYGON, this);
		group.add(polygon);
		this.add(polygon);
		
		ToolToggleButton line = new ToolToggleButton("res/line.png", ToolType.LINE, this);
		group.add(line);
		this.add(line);
		
		ToolToggleButton rectangle = new ToolToggleButton("res/rect.png", ToolType.RECTANGLE, this);
		group.add(rectangle);
		this.add(rectangle);
		
		ColorButton foreground = new ColorButton(fgColor, 1, this);
		this.add(foreground);
		
		ColorButton background = new ColorButton(bgColor, 1, this);
		this.add(background);
		
		//this.canvas = new CanvasComponent(null);
	}
	
	public Color getFgColor()
	{
		return fgColor;
	}
	
	public void setFgColor(Color fgColor)
	{
		this.fgColor = fgColor;
	}
	
	public Color getBgColor()
	{
		return bgColor;
	}
	
	public void setBgColor(Color bgColor)
	{
		this.bgColor = bgColor;
	}
	
	public CanvasComponent getCanvas()
	{
		return canvas;
	}
	
	public void setCanvas(CanvasComponent canvas, JFrame frame)
	{
		this.canvas = canvas;
		this.frame = frame;
	}

	public void setCurrentTool(ToolType type)
	{
		switch (type)
		{
		case LINE: 
			System.out.println("LINE!");
			break;
		case ELLIPSE:
			System.out.println("ELLIPSE!!");
			break;
		case RECTANGLE:
			System.out.println("RECTANGLE!");
			currentTool = new RectangleTool(this);
			break;
		case POLYLINE: 
			System.out.println("POLYLINE!!");
			break;
		case POLYGON:
			System.out.println("POLYGON!!");
			break;
		}
	}
	
	public Tool getCurrentTool()
	{
		return currentTool;
	}
}
