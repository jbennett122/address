package gui;
import javax.swing.*;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.IOException;

import io.*;

public class AddEntry extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2290156079348542031L;

	public JTextField first = new JTextField();
	public JTextField last= new JTextField();
	public JTextField numField= new JTextField(6);
	public JTextField cityField = new JTextField(10);
	private JTextField zipField = new JTextField(5);
	private JTextField stateField =  new JTextField(2);
	private JTextField phoneField = new JTextField(9);
	private JTextField cellField = new JTextField(9);
	
	 	
	JButton submit = new JButton("Submit");
	JButton cancel = new JButton("Cancel");
	
	
	JTextField e1Field = new JTextField(17);
	JTextField e2Field = new JTextField(17);	
	
	
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
		 *** Text Fields moved out of constructor to be global for the 
		 *class**
		 */
		

		//first = new JTextField();
		last = new JTextField();
		numField = new JTextField(6);
		cityField = new JTextField(10);
		zipField = new JTextField(5);
		stateField =  new JTextField(2);
		phoneField = new JTextField(9);
		cellField = new JTextField(9);
		
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
		
		bottomPanel.add(submit);
		bottomPanel.add(cancel);
		submit.addActionListener(new SubmitListener());
		cancel.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						System.out.print("Cancel Button Pressed");
						 addFrame.dispose();
						
					}
									
				});
		
		/*
		 * 
		 * LeftPanel containing address information
		 * 
		 */
		JLabel num = new JLabel("Address");
		JLabel city = new JLabel("City");
		JLabel zip = new JLabel("Zip Code");
		JLabel state = new JLabel("State");
		
		
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
		JLabel e1 = new JLabel("Email");
		JLabel e2 = new JLabel("Email");
		 
		
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
	 * add class that submits to the file system (database later)
	 * function that checks input information ie only numbers in
	 * zip codes or throw error?
	 * 
	 */
	
	
	private class SubmitListener implements ActionListener{

		@SuppressWarnings("null")
		@Override
		public void actionPerformed(ActionEvent e) {
			System.err.print("Submit listener1");
			String fString = first.getText();
			
			System.err.print("Submit listener2");
			String[] strings = null;
			System.err.print("Submit listener3");
			strings[0]= fString;
			System.err.print("Submit listener4");
			
			
			AddressObj ad = new AddressObj(strings);
	 			
			
			try {
				WriteObj.write(ad);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 
			
			
	 	}
		
		
	}
	
	
}
	
	 