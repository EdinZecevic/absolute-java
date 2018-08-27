package firstwindowcall;
import javax.swing.JFrame;
import javax.swing.JButton;


public class FirstWindowCall extends JFrame {
	
	public static final int width=300;
	public static final int height=200;
	
	public FirstWindowCall() {
		super();
		setSize(width,height);
		
		setTitle("FirstWindowCall");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		JButton endButton = new JButton("Click to end the program");
		endButton.addActionListener(new Listener());
		add(endButton);
		
	}
}
