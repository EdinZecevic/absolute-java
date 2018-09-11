package jtextfielddemo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;

public class JTextFieldDemo extends JFrame implements ActionListener  {
	
	public static final int width=400;
	public static final int height=600;
	public static final int max=20;
	
	public JTextField name;
	public JTextField lastName;
	public JTextField age;
	public JTextField user;
	public JTextField pass;
	
	public JTextFieldDemo() {
		super("text input!");
		setSize(width,height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		
		JPanel upper= new JPanel();
		upper.setBackground(Color.blue);
		add(upper);
		
		JPanel down= new JPanel();
		down.setBackground(Color.white);
		add(down);
		
		name=new JTextField("Enter name here: ",max);
		name.setBackground(Color.white);
		upper.add(name);
		
		lastName=new JTextField("Enter last name here: ",max);
		lastName.setBackground(Color.white);
		upper.add(lastName);
		
		age=new JTextField("Enter age here: ",max);
		age.setBackground(Color.white);
		upper.add(age);
		
		user=new JTextField("Enter username here: ",max);
		user.setBackground(Color.white);
		upper.add(user);
		
		pass=new JTextField("Enter pasword here: ",max);
		pass.setBackground(Color.white);
		upper.add(pass);
		
		JButton ok = new JButton("OK");
		ok.addActionListener(this);
		down.add(ok);
		
		JButton cancel = new JButton("cancel");
		cancel.addActionListener(this);
		down.add(cancel);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		 try {
			 Text(e);
	      }
	        catch (NumberFormatException e2){
	        	
	     }
	    
		
	}
	
	public void Text(ActionEvent e){
        String string = e.getActionCommand( );
 
        if (string.equals("OK")){
           name.setText("Thank you for filling the form");
           lastName.setText("Thank you for filling the form");
           age.setText("Thank you for filling the form");
           user.setText("Thank you for filling the form");
           pass.setText("Thank you for filling the form");
        }
        else if (string.equals("cancel")) {
        	name.setText("Enter name here: ");
        lastName.setText("Enter last name here: ");
        age.setText("Enter age here: ");
        user.setText("Enter username here: ");
        pass.setText("Enter pasword here: ");
        }
        else
        	System.out.println("error");
        
     }

}
