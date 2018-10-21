package controler;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.fazecast.jSerialComm.SerialPort;

public abstract class Controler implements ActionListener {
	
	public static SerialPort chosenPort;
	public static final JButton clickme = new JButton("Set");
	public static final JFrame window = new JFrame();
	public static  JTextField text =new JTextField();
	public static int v=0;

	public static void main(String[] args) {
		
		
		// create and configure the window
		
		window.setTitle("Arduino LCD Clock");
		window.setSize(400, 100);
		window.setLayout(new BorderLayout());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create a drop-down box and connect button, then place them at the top of the window
		
		JComboBox<String> portList = new JComboBox<String>();
		JButton connectButton = new JButton("Connect");
		JPanel topPanel = new JPanel();
		topPanel.add(portList);
		topPanel.add(connectButton);
		window.add(topPanel, BorderLayout.NORTH);
		
		JPanel buttonPanel=new JPanel();
		buttonPanel.setBackground(Color.WHITE);
		window.add(buttonPanel,BorderLayout.SOUTH);
		
		JLabel label=new JLabel("Diesel 1");
		buttonPanel.add(label,BorderLayout.CENTER);
		
		text =new JTextField(5);
		text.setSize(20, 20);
		buttonPanel.add(text,BorderLayout.CENTER);
		// populate the drop-down box
		
		
		//clickme.addActionListener(this);
		buttonPanel.add(clickme);
		
		
		SerialPort[] portNames = SerialPort.getCommPorts();
		for(int i = 0; i < portNames.length; i++)
			portList.addItem(portNames[i].getSystemPortName());
		
		
		// configure the connect button and use another thread to send data
		
		connectButton.addActionListener(new ActionListener(){
			@Override public void actionPerformed(ActionEvent arg0) {
				if(connectButton.getText().equals("Connect")) {
					
					// attempt to connect to the serial port
					
					chosenPort = SerialPort.getCommPort(portList.getSelectedItem().toString());
					chosenPort.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER, 0, 0);
					if(chosenPort.openPort()) {
						connectButton.setText("Disconnect");
						portList.setEnabled(false);
						
						// create a new thread for sending data to the arduino
						
						Thread thread = new Thread(){
							@Override public void run() {
								
								// wait after connecting, so the bootloader can finish
								
								try {Thread.sleep(100); } catch(Exception e) {}
								


								// enter an infinite loop that sends text to the arduino
								
								PrintWriter output = new PrintWriter(chosenPort.getOutputStream());
								while(true) {
									
									
									
									output.println(259);
									output.flush();
									
									try {Thread.sleep(100); } catch(Exception e) {}
								}
							}
						};
						thread.start();
					}
				} 
				
					
				
				
				else 
					
					// disconnect from the serial port
					
					chosenPort.closePort();
					portList.setEnabled(true);
					connectButton.setText("Connect");
				
			}
		});
		
		// show the window
		
		window.setVisible(true);
	}

}
