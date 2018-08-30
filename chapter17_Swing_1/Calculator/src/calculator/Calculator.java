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
		
		JButton plus=new JButton("+");
		plus.addActionListener(this);
		button.add(plus);
		
		JButton minus=new JButton("-");
		minus.addActionListener(this);
		button.add(minus);
		
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
 
        if (string.equals("+")){
            resault = resault + stringToDouble(number.getText( ));
            	number.setText(Double.toString(resault));
        }
        else if (string.equals("-")) {
            resault = resault - stringToDouble(number.getText( ));
            	number.setText(Double.toString(resault));
 
        }
        else if (string.equals("Reset")){
            resault = 0.0;
            
            	number.setText("0.0");
        }
        else
        	number.setText("Unexpected error.");
     }
 
 
    private static double stringToDouble(String stringObject){
        return Double.parseDouble(stringObject.trim( ));
    }

}
