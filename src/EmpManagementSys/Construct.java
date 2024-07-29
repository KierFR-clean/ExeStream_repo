package EmpManagementSys;

import javax.swing.JButton;

public class Construct {
	private Listeners feature;

	
	public Construct() {
		feature = new Listeners();
	}
	
	
	void newButton(JButton button, int x, int y, int width, int height) {
		button.setContentAreaFilled(false);
		button.setBorder(null);
		feature.exit_mouseFeature(button);
		button.setOpaque(false);
		button.setBounds(x, y, width, height);
		
	}
}
