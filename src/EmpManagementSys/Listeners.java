package EmpManagementSys;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.*;

public class Listeners {

	
	void exit_mouseFeature(Component component) {
		component.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				component.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			
			 public void mouseExited(MouseEvent e) {
				 component.setCursor(Cursor.getDefaultCursor());
	            }
	        });
			
		}
	
	
		void exit_mouseAction(JFrame frame,Component exit) {
			exit.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					Confirmation confirm = new Confirmation(frame, "/Exit.png", Mode.EXIT);
					confirm.setVisible(true);
					
				}
			
		});
		}

}

