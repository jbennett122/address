package gui;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class AddEntry extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2290156079348542031L;

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Add Button Pressed");
	
		/*		  
		 * When AddEntry button is pushed a new window 
		 * is created for address entry 
		 * Top Panel containing first/last name text fields
		 * along with labels
		 * Left Panel for address 
		 * Right Panel for email, phone numbers, social media(maybe)
		 * bottom Panel for submit cancel buttons
		 * 
		 */
		JFrame addFrame = new JFrame();
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		JPanel topPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
		
		addFrame.setLayout(new BorderLayout());		
		
		leftPanel.setLayout(new GridLayout(4,3,5,5));
		rightPanel.setLayout(new GridLayout(4,3,5,5));
		topPanel.setLayout(new GridLayout(2,2,5,5));
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		
		
		/*
		 * Text fields and labels for the name entry panel
		 */
		JTextField last = new JTextField();
		JTextField first = new JTextField();
		JLabel ln = new JLabel("Last Name");
		JLabel fn = new JLabel("First Name");
		
		topPanel.add(ln);
		topPanel.add(fn);
		topPanel.add(last);
		topPanel.add(first);
		
		/*
		 * 
		 * Submit and cancel buttons
		 * 
		 */
		JButton submit = new JButton("Submit");
		JButton cancel = new JButton("Cancel");
		
		bottomPanel.add(submit);
		bottomPanel.add(cancel);
		
		
		/*
		 * 
		 * LeftPanel containing address information
		 * 
		 */
		JLabel num = new JLabel("Address");
		JLabel city = new JLabel("City");
		JTextField numField = new JTextField(6);
		JTextField cityField = new JTextField(10);
		
		JLabel zip = new JLabel("Zip Code");
		JLabel state = new JLabel("State");
		JTextField zipField = new JTextField(5);
		JTextField stateField =  new JTextField(2);
		
		leftPanel.add(num);
		leftPanel.add(city);
		leftPanel.add(numField);
		leftPanel.add(cityField);
		
		leftPanel.add(zip);
		leftPanel.add(state);
		leftPanel.add(zipField);
		leftPanel.add(stateField);
 		
		/*
		 * 
		 * Right Panel containing phone numbers/email
		 * 
		 */
		JLabel phone = new JLabel("Phone #");
		JLabel cell = new JLabel("Cell #");
		JTextField phoneField = new JTextField(9);
		JTextField cellField = new JTextField(9);
		
		JLabel e1 = new JLabel("Email");
		JLabel e2 = new JLabel("Email");
		JTextField e1Field = new JTextField(17);
		JTextField e2Field = new JTextField(17);
		
		rightPanel.add(phone);
		rightPanel.add(e1);		
		rightPanel.add(phoneField);
		rightPanel.add(e1Field);		
		rightPanel.add(cell);
		rightPanel.add(e2);
		rightPanel.add(cellField);
		rightPanel.add(e2Field);
		
		addFrame.add(topPanel,BorderLayout.NORTH);
		addFrame.add(bottomPanel,BorderLayout.SOUTH);
		addFrame.add(leftPanel,BorderLayout.WEST);
		addFrame.add(rightPanel,BorderLayout.EAST);
		
		
		addFrame.setSize(650, 200);
		
		 
		addFrame.setLocationRelativeTo(null);
		addFrame.setVisible(true); 
		System.out.print(addFrame.isVisible());
		
		
	}
	
	
	/*
	 * 
	 * TODO
	 * add function that submits to the data base
	 * function that checks input information ie only numbers in
	 * zip codes or throw error?
	 * 
	 */
	
	
	
}
	
	 