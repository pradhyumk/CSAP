//Usually you will require both swing and awt packages
//even if you are working with just swings.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myGUI extends Frame implements ActionListener {
	JTextField tf1;
	JLabel L0;
	JLabel L1;
	JLabel L2;
	JLabel L3;
	JButton B1;
	JCheckBox cb1;
	JCheckBox cb2;
	JCheckBox cb3;

	// constructor
	public myGUI() {

		// Creating the Frame
		JFrame frame = new JFrame("Jokes");
		frame.setLayout(null);
		frame.setSize(400, 400);

		// Display direction for user
		L0 = new JLabel("Weather at JP Stevens HS");
		L0.setBounds(50, 20, 250, 30);
		L1 = new JLabel("Enter F or C");
		L1.setBounds(50, 50, 250, 30);

		// Get answer from user (KIDS or TEENS)
		tf1 = new JTextField();
		tf1.setBounds(200, 50, 60, 30);

		// Create a button
		B1 = new JButton("Get Weather");
		B1.setBounds(70, 100, 100, 30);
		B1.addActionListener(this);

		// Display joke to user
		L2 = new JLabel();
		L2.setBounds(50, 150, 400, 30); // the joke
		L3 = new JLabel();
		L3.setBounds(50, 200, 100, 30);

		// Let user click to get answer

		// Let user rate the joke
		cb1 = new JCheckBox("Bad");
		cb1.setBounds(50, 250, 60, 100);
		cb2 = new JCheckBox("OK");
		cb2.setBounds(150, 250, 60, 100);
		cb3 = new JCheckBox("LOL");
		cb3.setBounds(250, 250, 60, 100);

		// Adding Components to the frame.
		add(L0);
		add(L1);
		add(L2);
		add(L3);
		add(tf1);
		add(B1);
		add(cb1);
		add(cb2);
		add(cb3);

		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String answer = tf1.getText();
		if (answer.equals("KIDS"))
			L2.setText("Why did the student eat his homework?"); 
		    //teacher said it was a piece of cake
		else if (answer.equals("TEENS"))
			L2.setText("How many programmers does it take to change a lightbulb?");
			//None, it is a hardware problem
		else
			L3.setText("Try Again");
	}

	public static void main(String args[]) {
		new myGUI();
	}
}