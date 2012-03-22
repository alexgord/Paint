import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		this.addMouseListener(new MouseEventListener());
		this.addMouseMotionListener(new MouseMotionEventListener());
		System.out.println("in CanvasComponent constructor");
	}

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(paintable != null)
			paintable.paint(g);
	}
	
	public class MouseEventListener implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			tbox.getCurrentTool().mouseClicked(e);
			System.out.println("inside mouseClicked");
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
			tbox.getCurrentTool().mousePressed(e);
			System.out.println("inside mousePressed");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			tbox.getCurrentTool().mouseReleased(e);
			System.out.println("inside mouseReleased");
		}
		
	}
	
	public class MouseMotionEventListener implements MouseMotionListener
	{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			tbox.getCurrentTool().mouseDragged(e);
			System.out.println("inside mouseDragged");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			tbox.getCurrentTool().mouseMoved(e);
			System.out.println("inside mouseMoved");
		}
	}
}
