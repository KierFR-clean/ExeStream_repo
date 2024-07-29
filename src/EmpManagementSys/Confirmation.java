package EmpManagementSys;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Confirmation extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPane;
	private JLabel background;
	private Construct construct;
	private JButton exit_yes, exit_not, update;
	private final int BREADTH = 380, HEIGHT = 192;
	
	public Confirmation(JFrame frame, String path, Mode mode) {
		construct = new Construct();
		setModal(true);
		setUndecorated(true);
		setSize(BREADTH, HEIGHT);
		this.contentPane = new JPanel();
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		
		custom(frame, path, mode);
	}
	
	void custom(JFrame frame, String path, Mode mode) {
		
		
		switch(mode) {
		case EXIT -> {
			confirm_exit(frame);
			not_exit();
			
		}
		case UPDATE -> {
			
		}
		default ->{
			break;
		}
			
		
		}
		
		setBackground(path);
		
	}
	
	void confirm_exit(JFrame frame) {
		exit_yes = new JButton();
		construct.newButton(exit_yes, 24, 133, 119, 40);
		contentPane.add(exit_yes);
		
		
		exit_yes.addActionListener(e -> {
			try {
				super.dispose();
				frame.dispose();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		});
		
		
	}
	
	void not_exit() {
		exit_not = new JButton();
		construct.newButton(exit_not, 180, 134, 119, 40);
		contentPane.add(exit_not);
		
		exit_not.addActionListener(e -> {
			try {
				super.dispose();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		});
		
		
	}
	
	void setBackground(String path) {
		background = new JLabel("");
		background.setBounds(0, 0, BREADTH, HEIGHT);
		Scale scale = new Scale(BREADTH, HEIGHT);
		background.setIcon(scale.resizeImg(this.getClass().getResource(path)));
		contentPane.add(background);
	}

}
