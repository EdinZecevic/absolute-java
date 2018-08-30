package textinput;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class TextInput extends JFrame implements ActionListener {
	
	public static final int width=500;
	public static final int height=500;
	public static final int NUMBER_OF_CHARACTERS=30;
	
	private JTextField name;
	
	public TextInput() {
		super("WIndow for input!");
		setSize(width,height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		
		JPanel panel=new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new BorderLayout());
		
		name=new JTextField(NUMBER_OF_CHARACTERS);
		panel.add(name,BorderLayout.SOUTH);
		JLabel label=new JLabel("Enter name here! ");
		panel.add(label,BorderLayout.CENTER);
		
		add(panel);
		
		JPanel panelbutton=new JPanel();
		panelbutton.setLayout(new FlowLayout());
		panelbutton.setBackground(Color.blue);
		
		JButton button=new JButton("Click");
		button.addActionListener(this);
		panelbutton.add(button);
		
		JButton clear =new JButton("Clear");
		clear.addActionListener(this);
		panelbutton.add(clear);
		
		add(panelbutton);	
	}

	public void actionPerformed(ActionEvent e) {
		
		String comand =e.getActionCommand();	
		
		if(comand.equals("Click"))
			name.setText("hello "+name.getText());
		else if(comand.equals("Clear"))
			name.setText("");
		else
			System.out.println("Error");
		
	}

}
