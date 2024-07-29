package EmpManagementSys;


import java.awt.Component;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



public class Login extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int HEIGHT = 750, BREADTH = 1050 ; 
	private JPanel contentPane;
	private JLabel background;
	private JButton exit;
	private Listeners exit_mouse;
	
	public Login() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(BREADTH, HEIGHT);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		exit(exit,40,36);
		
		setBackground();
	}
	
	
	void setBackground() {
		contentPane.setLayout(null);
		background = new JLabel("");
		background.setBounds(0, 0, BREADTH, HEIGHT);
		Scale scale = new Scale(BREADTH, HEIGHT);
		background.setIcon(scale.resizeImg(this.getClass().getResource("/Login.png")));
		contentPane.add(background);
	}
	
	
	
	void exit(JButton button, int width, int height) {
		Exit exit = new Exit();
		exit_mouse = new Listeners();
		Component component = exit.close(button, width, height);
		exit_mouse.exit_mouseFeature(component);
		exit_mouse.exit_mouseAction(this, component);
		contentPane.add(component);
		
		
	}

}
