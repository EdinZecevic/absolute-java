package vowelnumber;
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

public class VowelNumber extends JFrame implements ActionListener {
	
	public static final int width=400;
	public static final int height=200;
	public static final int max=20;
	
	public JTextField textinput;
	private int resault=0;
	
	public VowelNumber() {
		super("Calculating the vowel number in text!");
		setSize(width,height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		
		JPanel text= new JPanel();
		text.setBackground(Color.blue);
		add(text);
		
		JPanel button= new JPanel();
		button.setBackground(Color.white);
		add(button);
		
		textinput = new JTextField(max);
		textinput.setBackground(Color.WHITE);
		text.add(textinput);
		
		JButton buttonbutton = new JButton("Click");
		buttonbutton.addActionListener(this);
		button.add(buttonbutton);
		
	}

	
	public void actionPerformed(ActionEvent e) {
        try {
        	countVowels(e);
      }
        catch (NumberFormatException e2){
        	textinput.setText("Enter number again");
     }
    }
	
	public void countVowels(ActionEvent e) {
		
		String text = textinput.getText();
		 int count = 0;
		
	
	    for (int i = 0; i < text.length(); i++) {
	        char c = text.charAt(i);
	        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
	            count++;
	        }
	        textinput.setText("number of vowels is: "+count);
	    }
	}
	

}
