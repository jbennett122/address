package gui;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;

public class AddEntry extends JFrame implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Add Button Pressed");
	
		/*		  
		 * When AddEntry button is pushed a new window 
		 * is created for address entry 
		 * 
		 */
		JFrame addFrame = new JFrame();
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		JPanel topPanel = new JPanel();
		
		addFrame.setLayout(new BorderLayout());		
		leftPanel.setLayout(new GridBagLayout());
		rightPanel.setLayout(new GridBagLayout());
		topPanel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JTextField last = new JTextField(15);
		JTextField first = new JTextField(15);
		JLabel ln = new JLabel("Last Name");
		JLabel fn = new JLabel("First Name");
		
		
		
		addFrame.add(topPanel,c);
		addFrame.add(leftPanel,c);
		addFrame.add(rightPanel,c);
		
		topPanel.add(ln);
		topPanel.add(fn);
		topPanel.add(last);
		topPanel.add(first);
		
		addFrame.setSize(400, 400);
		
		 
		addFrame.setLocationRelativeTo(null);
		addFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addFrame.setVisible(true); 
		System.out.print(addFrame.isVisible());
		
		
	}
	
}
	
	 