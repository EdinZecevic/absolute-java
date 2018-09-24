package pricecontroler;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PriceControler extends JFrame implements ActionListener {
	
	public static final int width=500;
		public static final int height=500;
		public static final int N_CHARACTERS=4;
		
		public JTextField text;
		public JTextField text1;
		public JTextField text2;
		public JTextField text3;
		public JTextField text4;
		
		public JButton clickme;
		public JButton clear;
		public JButton numberOfLines;
		
		public PriceControler() {
			
			super("Text input");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(width,height);
			setLayout(new BorderLayout());
			
			JPanel panel=new JPanel();
			panel.setBackground(Color.LIGHT_GRAY);
			add(panel);
			
			JLabel label=new JLabel("Diesel 1");
			panel.add(label,BorderLayout.CENTER);
			
			text =new JTextField(N_CHARACTERS);
			panel.add(text,BorderLayout.CENTER);
			
			JLabel label1=new JLabel("Diesel 2");
			panel.add(label1,BorderLayout.CENTER);
			
			text1 =new JTextField(N_CHARACTERS);
			panel.add(text1,BorderLayout.CENTER);
			
			JLabel label2=new JLabel("Benzin 1");
			panel.add(label2,BorderLayout.CENTER);
			
			text2 =new JTextField(N_CHARACTERS);
			panel.add(text2,BorderLayout.CENTER);
			
			JLabel label3=new JLabel("Benzin 2");
			panel.add(label3,BorderLayout.CENTER);
			
			text3 =new JTextField(N_CHARACTERS);
			panel.add(text3,BorderLayout.CENTER);
			
			JLabel label4=new JLabel("Plin 1");
			panel.add(label4,BorderLayout.CENTER);
			
			text4 =new JTextField(N_CHARACTERS);
			panel.add(text4,BorderLayout.CENTER);
			
			JPanel buttonPanel=new JPanel();
			buttonPanel.setBackground(Color.BLUE);
			add(buttonPanel,BorderLayout.SOUTH);
			
			clickme=new JButton("Set");
			clickme.addActionListener(this);
			buttonPanel.add(clickme);
			
			clear=new JButton("Clear");
			clear.addActionListener(this);
			buttonPanel.add(clear);
			
		}
		
		
		public void actionPerformed(ActionEvent e) {
			String command=e.getActionCommand();
			
			if(command.equals("Set")) {
				this.text.setText(this.text.getText());
				this.text1.setText(this.text1.getText());
				this.text2.setText(this.text2.getText());
				this.text3.setText(this.text3.getText());
				this.text4.setText(this.text4.getText());
			}
			else if(command.equals("Clear")) {
				this.text.setText("");
				this.text1.setText("");
				this.text2.setText("");
				this.text3.setText("");
				this.text4.setText("");
			}
			else 
				System.out.println("Error");
			
		}
		
		

	}



