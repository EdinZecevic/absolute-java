package firstswign;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FirstSwign {
	public static final int width=300;
	public static final int height=200;
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		
		window.setSize(width,height);
		//window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // if press X for close window will not disappear
		//window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	//	if press X for close window will  disappear
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//	if press X for close window will  exit
		
		window.setTitle("First winow");
		
		JButton endButton = new JButton("Click to end thre program! ");
		EndingListener button = new EndingListener();
		
		endButton.addActionListener(button);
		window.add(endButton);
		window.setVisible(true);
		
		
	}

}
