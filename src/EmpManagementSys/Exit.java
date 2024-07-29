package EmpManagementSys;

import java.awt.Component;

import javax.swing.*;
public class Exit {
	
	Component close(JButton button, int width, int height) {
		try {
			button = new JButton();
			button.setContentAreaFilled(false);
			button.setBorder(null);
			button.setOpaque(false);
			button.setBounds(995, 13, width, height);
			return button;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

	

	
}
