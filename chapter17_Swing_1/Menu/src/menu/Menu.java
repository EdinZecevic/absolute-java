package menu;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.Color;
import java.awt.GridLayout;

public class Menu extends JFrame implements ActionListener {
	
	public static final int width=300;
	public static final int height=200;
	
	private JPanel bluePanel;
	private JPanel whitePanel;
	private JPanel grayPanel;
	
	public Menu () {
		
		super("This is the window with menu!");
		setSize(width,height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,3));
		
		JPanel bluePanel= new JPanel();
		bluePanel.setBackground(Color.LIGHT_GRAY);
		add(bluePanel);
		
		JPanel whitePanel= new JPanel();
		whitePanel.setBackground(Color.LIGHT_GRAY);
		add(whitePanel);
		
		JPanel grayPanel= new JPanel();
		grayPanel.setBackground(Color.LIGHT_GRAY);
		add(grayPanel);
		
		JMenu menu =new JMenu("Colours");
		
		JMenuItem blue=new JMenuItem("Blue");
		blue.addActionListener(this);
		menu.add(blue);
		
		JMenuItem white=new JMenuItem("White");
		white.addActionListener(this);
		menu.add(white);
		
		JMenuItem gray=new JMenuItem("Gray");
		gray.addActionListener(this);
		menu.add(gray);
		
		JMenuBar bar = new JMenuBar();
		bar.add(menu);
		setJMenuBar(bar);
	}

	
	public void actionPerformed(ActionEvent e) {
		
		String buttonString=e.getActionCommand();
		
		if(buttonString.equals("Blue"))
			bluePanel.setBackground(Color.BLUE);
		else if(buttonString.equals("White"))
			whitePanel.setBackground(Color.WHITE);
		else if(buttonString.equals("Gray"))
			grayPanel.setBackground(Color.GRAY);
		else
			System.out.println("ERROR");
			
		
	}
	

}
