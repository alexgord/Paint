import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;

/*
 * This class is a custom button for color selectors to the toolbox.
 * See ToolToggleButton for an example of the technique used here for
 * event handing.
 */
public class ColorButton extends JButton {

	private ToolBox tbox;
	private int type;
	private Color color;

	public ColorButton(Color color, int type, ToolBox tbox) {
		this.color = color;
		this.tbox = tbox;
		this.type = type;
		this.addActionListener(new ToggleActionListener(this));
		this.setPreferredSize(new Dimension(20, 20));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(color != null) {
			g.setColor(color);
			g.fillRect(0, 0, this.getWidth()-1, this.getHeight()-1);
		}
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, this.getWidth()-1, this.getHeight()-1);
	}

	private class ToggleActionListener implements ActionListener {

		private ColorButton toggle;

		public ToggleActionListener (ColorButton toggle) {
			this.toggle = toggle;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(type == ToolBox.FOREGROUND) {
				color = JColorChooser.showDialog(tbox,"Choose A Color", tbox.getFgColor());
				tbox.setFgColor(color);
			}	
			else {
				color = JColorChooser.showDialog(tbox,"Choose A Color", tbox.getBgColor());
				tbox.setBgColor(color);
			}
			tbox.repaint();
		}

	}

}


