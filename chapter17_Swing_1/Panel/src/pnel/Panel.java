package pnel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JFrame implements ActionListener {
	public static final int width=300;
	public static final int height=200;
	
	private JPanel bluePanel;
	private JPanel whitePanel;
	private JPanel grayPanel;
	
	public Panel() {
		super("My first panel");
		setTitle("My first panel");
		setSize(width,height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,3));
		
		bluePanel =new JPanel();
		bluePanel.setBackground(Color.LIGHT_GRAY);
		panel.add(bluePanel);
		
		whitePanel =new JPanel();
		whitePanel.setBackground(Color.LIGHT_GRAY);
		panel.add(whitePanel);
		
		grayPanel =new JPanel();
		grayPanel.setBackground(Color.LIGHT_GRAY);
		panel.add(grayPanel);
		
		add(panel, BorderLayout.CENTER);
		
		JPanel buttonPanel =new JPanel();
		buttonPanel.setBackground(Color.LIGHT_GRAY);
		buttonPanel.setLayout(new FlowLayout());
		
		
		
		JButton blue=new JButton ();
		blue.setBackground(Color.BLUE);
		blue.addActionListener(this);
		buttonPanel.add(blue);
		
		JButton white=new JButton ();
		white.setBackground(Color.WHITE);
		white.addActionListener(this);
		buttonPanel.add(white);
		
		JButton gray=new JButton ();
		gray.setBackground(Color.GRAY);
		gray.addActionListener(this);
		buttonPanel.add(gray);
		
		add(buttonPanel, BorderLayout.SOUTH);
		
	}

	public void actionPerformed(ActionEvent e) {
		
		String buttonString=e.getActionCommand();
		if(buttonString.equals("Blue"))
			bluePanel.setBackground(Color.BLUE);
		
		else if (buttonString.equals("White"))
			whitePanel.setBackground(Color.WHITE);
		
		else if (buttonString.equals("Gray"))
			grayPanel.setBackground(Color.GRAY);
		
		else
			System.out.println("EROR");
	}
}
