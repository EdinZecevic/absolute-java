package textinputfield;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextInputField extends JFrame implements ActionListener {
	
	public static final int width=500;
	public static final int height=500;
	public static final int N_LINES=20;
	public static final int N_CHARACTERS=20;
	
	public JTextArea text;
	
	public JButton clickme;
	public JButton clear;
	public JButton numberOfLines;
	
	public TextInputField() {
		
		super("Text input");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(width,height);
		setLayout(new BorderLayout());
		
		JPanel panel=new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		add(panel,BorderLayout.CENTER);
		
		JLabel label=new JLabel("Enter your text here");
		panel.add(label);
		
		text =new JTextArea(N_LINES,N_CHARACTERS);
		panel.add(text);
		
		JPanel buttonPanel=new JPanel();
		buttonPanel.setBackground(Color.BLUE);
		add(buttonPanel,BorderLayout.SOUTH);
		
		clickme=new JButton("Click me");
		clickme.addActionListener(this);
		buttonPanel.add(clickme);
		
		clear=new JButton("Clear");
		clear.addActionListener(this);
		buttonPanel.add(clear);
		
		numberOfLines=new JButton("Number of lines");
		numberOfLines.addActionListener(this);
		buttonPanel.add(numberOfLines);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		String text=e.getActionCommand();
		
		if(text.equals("Click me"))
			this.text.setText("Your text is: "+this.text.getText());
		else if(text.equals("Clear"))
			this.text.setText("");
		else if(text.equals("Number of lines"))
			this.text.setText("Number of lines is: "+getLineCount());
		else 
			System.out.println("Error");
		
	}
	
	private int getLineCount()
    {
        String textString = text.getText();
        int counter = 1;
 
        for (int i = 0; i < textString.length(); i++)
            if (textString.charAt(i) == '\n')
                counter++;
        return counter;
    }
	

}
