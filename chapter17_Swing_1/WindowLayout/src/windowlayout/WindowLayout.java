package windowlayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class WindowLayout extends JFrame {
	public static final int width=300;
	public static final int height=200;
	
	public WindowLayout() {
	
	super("The window layout ");
	setSize(width, height);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setLayout(new BorderLayout());
	
	JLabel label1 = new JLabel ("Sinan Sakic");
	add(label1,BorderLayout.NORTH);
	
	JLabel label2 = new JLabel ("Semsa Suljakovic");
	add(label2, BorderLayout.SOUTH);
	
	JLabel label3 = new JLabel ("Jasar Ahmedovski");
	add(label3, BorderLayout.CENTER);
	
	}
}
