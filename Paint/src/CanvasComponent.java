import java.awt.Graphics;

import javax.swing.JComponent;


public class CanvasComponent extends JComponent
{
	private static final long serialVersionUID = 1L;
	private Paintable paintable;
	private ToolBox tbox;
	
	public ToolBox getTbox() {
		return tbox;
	}

	public void setTbox(ToolBox tbox) {
		this.tbox = tbox;
	}

	public CanvasComponent(Paintable paintable)
	{
		super();
		this.paintable = paintable;
	}

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(paintable != null)
			paintable.paint(g);
	}
	
}
