package wndowcolor;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;


public class WindowColor extends JFrame {
	
	public static final int width=300;
	public static final int height=200;
	
	public WindowColor(Color theColor) {
		
		super("The window with colour!");
		setSize(width,height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setBackground(theColor);
		
		//Close Close=new Close();
		
		//JButton button=new JButton("Click to close");
		//button.addActionListener(new Close());
		
		JLabel button=new JLabel("Click to close");
		add(button);
		
	}
	public WindowColor() {
		this(Color.BLUE);
}
}
