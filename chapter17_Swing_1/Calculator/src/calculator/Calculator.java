package calculator;

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

public class Calculator extends JFrame implements ActionListener {
	
	public static final int width=400;
	public static final int height=200;
	public static final int N_NUMBERS=20;
	
	public JTextField number;
	private double resault=0.0;
	
	public Calculator() {
		super("Simple Calculator!");
		setSize(width,height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		
		JPanel upper= new JPanel();
		upper.setBackground(Color.LIGHT_GRAY);
		add(upper);
		
		JPanel button =new JPanel();
		button.setBackground(Color.BLUE);
		
		JButton one=new JButton("1");
		one.addActionListener(this);
		button.add(one);
		
		JButton two=new JButton("2");
		two.addActionListener(this);
		button.add(two);
		
		JButton three=new JButton("3");
		three.addActionListener(this);
		button.add(three);
		
		JButton four=new JButton("4");
		four.addActionListener(this);
		button.add(four);
		
		JButton five=new JButton("5");
		five.addActionListener(this);
		button.add(five);
		
		JButton six=new JButton("6");
		six.addActionListener(this);
		button.add(six);
		
		JButton seven=new JButton("7");
		seven.addActionListener(this);
		button.add(seven);
		
		JButton eight=new JButton("8");
		eight.addActionListener(this);
		button.add(eight);

		JButton nine=new JButton("9");
		nine.addActionListener(this);
		button.add(nine);
		
		JButton zero=new JButton("0");
		zero.addActionListener(this);
		button.add(zero);
		
		JButton plus=new JButton("+");
		plus.addActionListener(this);
		button.add(plus);
		
		JButton minus=new JButton("-");
		minus.addActionListener(this);
		button.add(minus);
		
		JButton times=new JButton("*");
		times.addActionListener(this);
		button.add(times);
		
		JButton devide=new JButton("/");
		devide.addActionListener(this);
		button.add(devide);
		
		JButton equal=new JButton("=");
		equal.addActionListener(this);
		button.add(equal);
		
		JButton reset =new JButton("Reset");
		reset.addActionListener(this);
		button.add(reset);
		
		add(button);
		
		number = new JTextField("Enter numbers here: ",N_NUMBERS);
		number.setBackground(Color.WHITE);
		upper.add(number,BorderLayout.PAGE_END);
		
	}
	
	public void actionPerformed(ActionEvent e) {
        try {
           CorrectNumberFormats(e);
      }
        catch (NumberFormatException e2){
        	number.setText("Enter number again");
     }
    }
 
 
    public void CorrectNumberFormats(ActionEvent e){
        String string = e.getActionCommand( );
        if(string.equals("1")) {
        	number.setText("1");
        }
     }
 
 
    private static double stringToDouble(String stringObject){
        return Double.parseDouble(stringObject.trim( ));
    }

}
