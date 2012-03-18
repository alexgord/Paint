import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

/*
 * This class is a custom ToggleButton for the ToolBox. It will store the type of 
 * tool that will be set when clicked. See the inner class "ToggleActionListener"
 * for an example of a "callback".
 */
public class ToolToggleButton extends JToggleButton {

	private ToolType type;
	private ToolBox tbox;  // an alias to the ToolBox object into which we place this ToggleButton

	public ToolToggleButton(String iconFile, ToolType type, ToolBox tbox) {
		
		this.type = type;
		this.tbox = tbox;
		
		this.setIcon(new ImageIcon(iconFile));

		// set the event handler, see ToggleActionListener below
		this.addActionListener(new ToggleActionListener(this));
	}
	
	/*
	 * The following class exists only to handle the action event which occurs when the user clicks
	 * the ToggleButton. When this happens, the ToolBox's current the tool should change to
	 * kind specified here.
	 * 
	 * Since this class is only useful here, we write it as an _inner_ class, that is a 
	 * class inside another, limiting it's scope. As an inner class, it has access to the
	 * fields of the containing class, just like a would have method. This can be convenient! 
	 */
	private class ToggleActionListener implements ActionListener {

		private ToolToggleButton toggleBtn;
		
		public ToggleActionListener (ToolToggleButton toggleBtn) {
			this.toggleBtn = toggleBtn;
		}
		
		/*
		 * This method implements a "callback", what we really want to execute with this
		 * event handler is the ToolBox's setCurrentTool() method.
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			// Set the tool!
			tbox.setCurrentTool(type);
			// this will de-select the other buttons
			toggleBtn.setSelected(true);
		}
		
	}
	
}
