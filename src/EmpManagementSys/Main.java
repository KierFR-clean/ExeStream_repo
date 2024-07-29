package EmpManagementSys;

import java.awt.EventQueue;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login login = new Login();
					login.setVisible(true);	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}
