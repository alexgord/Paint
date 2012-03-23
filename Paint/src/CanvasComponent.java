import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JComponent;


public class CanvasComponent extends JComponent
{
	private static final long serialVersionUID = 1L;
	private ArrayList<Paintable> paintables;
	private ToolBox tbox;

	private static int id = 0;
	private int currId;

	public ToolBox getTbox() {
		return tbox;
	}

	public void setTbox(ToolBox tbox) {
		this.tbox = tbox;
	}

	public CanvasComponent() //Paintable paintable)
	{
		super();
		this.currId = id++;
		this.paintables = new ArrayList<Paintable>();		
		this.addMouseListener(new MouseEventListener());
		this.addMouseMotionListener(new MouseMotionEventListener());
		System.out.println("in CanvasComponent constructor");
	}

	public void add(Paintable p) {
		paintables.add(p);
	}

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(paintables != null)
		{
			Iterator<Paintable> it = paintables.iterator();
			while(it.hasNext()) 
				it.next().paint(g);
		}
	}

	public class MouseEventListener implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (tbox.getCurrentTool() != null)
			{
				tbox.getCurrentTool().mouseClicked(e);
			}
			System.out.println("inside mouseClicked");
			System.out.println(tbox.getCurrentTool() != null);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			//tbox.getCurrentTool().mouseEntered(e);
			System.out.println("inside mouseEntered");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			//tbox.getCurrentTool().mouseExited(e);
			System.out.println("inside mouseExited");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			if (tbox.getCurrentTool() != null)
			{
				tbox.getCurrentTool().mousePressed(e);
			}
			System.out.println("inside mousePressed " + currId);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			if (tbox.getCurrentTool() != null)
			{
				tbox.getCurrentTool().mouseReleased(e);
			}
			System.out.println("inside mouseReleased " + currId);
		}

	}

	public class MouseMotionEventListener implements MouseMotionListener
	{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			if (tbox.getCurrentTool() != null)
			{
				tbox.getCurrentTool().mouseDragged(e);
			}
			System.out.println("inside mouseDragged");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			if (tbox.getCurrentTool() != null)
			{
				tbox.getCurrentTool().mouseMoved(e);
			}
			System.out.println("inside mouseMoved");
		}
	}
}
