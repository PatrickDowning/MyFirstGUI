//Mostly from swing library

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
	
	int count = 0;
	
	//Don't understand what private does

	private JLabel label;
	

	public GUI() {
	
// The frame is the actual window and the panel is what's in the frame..I think

	JFrame frame = new JFrame();
	
// allows button to listen to click events (this means 
	
	JButton button = new JButton("Don't click me!:");
	button.addActionListener(this);

	label = new JLabel("Oh no: 0");

	JPanel panel = new JPanel();
	panel.add(label);
	panel.add(button);

// This is setting the border of the frame. The parameter is just an object of the border which is imported from Border Factory. The parameters in the parameter is Top, Bottom, Left, Right ( these are in pixels). 
	
	panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));

// Just the layout 
	
	panel.setLayout(new GridLayout(0,1));

// To be honest I do not know what's exactly all of this does. 	

	frame.add(panel, BorderLayout.CENTER);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("My GUI");
	frame.pack();
	frame.setVisible(true);

	}
	
	public static void main(String[] args){
	new GUI();

	}
	public void actionPerformed(ActionEvent e){
	
	count--;
	
	//Don't understand this part

	label.setText("Oh no!: "+ count);	
	}
}