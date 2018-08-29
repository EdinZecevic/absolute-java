package menuinnerclasses;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.Color;
import java.awt.GridLayout;

public class Menu extends JFrame{
	
	public static final int width=300;
	public static final int height=200;
	
	private JFrame bluePanel;
	private JFrame whitePanel;
	private JFrame grayPanel;
	
	public class Blue implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			bluePanel.setBackground(Color.BLUE);
		}
	}
	
	public class White implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			whitePanel.setBackground(Color.WHITE);
		}
	}
	
	public class Gray implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			grayPanel.setBackground(Color.GRAY);
		}
	}
	
	public Menu(){
	
	super("This is the menu: ");
	setSize(width,height);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new GridLayout(1,3));
	
	JPanel bluePanel=new JPanel();
	bluePanel.setBackground(Color.LIGHT_GRAY);
	add(bluePanel);
	
	JPanel whitePanel=new JPanel();
	whitePanel.setBackground(Color.LIGHT_GRAY);
	add(whitePanel);
	
	JPanel grayPanel= new JPanel();
	grayPanel.setBackground(Color.LIGHT_GRAY);
	add(grayPanel);
	
	JMenu menu =new JMenu("Colours");
	
	JMenuItem blue= new JMenuItem("Blue");
	blue.addActionListener(new Blue());
	menu.add(blue);
	
	JMenuItem white = new JMenuItem("White");
	white.addActionListener(new White());
	menu.add(white);
	
	JMenuItem gray= new JMenuItem("Gray");
	gray.addActionListener(new Gray());
	menu.add(gray);
	
	JMenuBar bar=new JMenuBar();
	bar.add(menu);
	setJMenuBar(bar);
	
	}
}

