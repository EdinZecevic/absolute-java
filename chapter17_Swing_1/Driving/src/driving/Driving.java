package driving;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;

public class Driving extends JFrame implements ActionListener {
	
	public static final int weight=400;
	public static final int height=200;
	
	private int counter=0;
	private int counterr=0;
	
	
	private JButton yes;
	private JButton no;
	private JLabel good;
	private JLabel bad;
	
	public Driving() {
		super("Driving window!");
		setSize(weight,height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		
		JPanel up=new JPanel();
		up.setBackground(Color.LIGHT_GRAY);
		add(up);
		
		JPanel down=new JPanel();
		down.setBackground(Color.BLUE);
		add(down);
		
		good=new JLabel ("Are you an exelent driver?");
		up.add(good);
		
		bad=new JLabel ("   Place for counter!");
		up.add(bad);
		
		yes=new JButton("Yes");
		yes.addActionListener(this);
		down.add(yes);
		
		no=new JButton("No");
		no.addActionListener(this);
		down.add(no);
	}
	
	public void actionPerformed(ActionEvent e) {
		String action=e.getActionCommand();
		
		if(action.equals("Yes")) {
			counter++;
		good.setText("We need you!");
		bad.setText(this.toString());
		}
		else if(action.equals("No")) {
			good.setText("Your need to practice!");
			counterr++;
			bad.setText(this.toString());
		}
		else
			good.setText("Error");
	}
	
	public String toString() {
		return("Yes: "+counter+" No: "+counterr);
	}
	

}
