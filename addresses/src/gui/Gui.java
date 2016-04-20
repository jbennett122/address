package gui;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Gui {

	public Gui(){
	
	final boolean shouldFill = false; 
	final boolean shouldWeightX = true;
	final boolean RIGHT_TO_LEFT = false;
			
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	frame.setLayout(new FlowLayout());
	panel.setLayout(new GridBagLayout());		
	
	GridBagConstraints c = new GridBagConstraints();
		
	/*
	 * 
	 * First panel containing program icon and search bar
	 * 
	 * 
	 */
	
	/*
	 * Icon read and reformat
	 */
	ImageIcon ves = null;
	ves = new ImageIcon("src/images/ves.jpg");
	Image image = ves.getImage();
	Image resized = image.getScaledInstance(370, 200, Image.SCALE_AREA_AVERAGING);
	ImageIcon vesIcon = new ImageIcon(resized);
	JLabel vesL = new JLabel(vesIcon);
		
	if(shouldWeightX){
		c.weightx= 0.1;
			}
	/*
	 * Icon formating in panel and implementation
	 */
	c.fill=GridBagConstraints.NONE;
	c.anchor=GridBagConstraints.PAGE_START;
	c.gridx=0;
	c.gridy=0;
	c.gridheight=1;
	c.gridwidth=10;
	c.weighty = .99;
	panel.add(vesL,c);
	
	
	/*
	 *Search bar implementation  
	 */
	JTextField search = new JTextField();
	c.fill= GridBagConstraints.HORIZONTAL;
	c.anchor= GridBagConstraints.PAGE_START;
	c.gridx=0;
	c.gridy=3;
	c.weightx=0.8;
	c.gridwidth=3;
	c.insets = new Insets(10,0,10,0);
	panel.add(search,c);
			
	
	/*
	 * Second panel containing search results.
	 * Results are contained in a Plain text component 
	 * using the constructor public JTextArea(Document doc)
	 */
	JPanel p2 = new JPanel();
	p2.setLayout(new GridLayout());
	//Will eventually import a document with results or pull from a database?
	JTextArea results = new JTextArea("this is where results will be", 10,40); 
	p2.add(results);
	
	
	
	/*
	 * Third panel with buttons for adding, deleting and editing entries
	 * into the address book.
	 * When add is selected an eventlistener on the button will create a new popup
	 * that will have multiple fields, along with save and cancel buttons
	 * To delete an entry select a line(eventually multiple) in the results box
	 * To edit entry select from results, a prefilled in add component will appear
	 */
	JPanel p3 = new JPanel();
	p3.setLayout(new FlowLayout());
	
	//Action listener created and added to button
	JButton add = new JButton("Add");
	AddEntry addE = new AddEntry();
	add.addActionListener(addE);
	p3.add(add);
	
	//Action listener created and added to button
	JButton delete = new JButton("Delete");
	DeleteEntry del = new DeleteEntry();
	delete.addActionListener(del);
	p3.add(delete);
	
	//Action listener created and added to button
	JButton edit = new JButton("Edit");
	EditEntry edd = new EditEntry();
	edit.addActionListener(edd);
	p3.add(edit);
	 	
	
	frame.setSize(500, 500);
			
	frame.add(panel);
	frame.add(p2);
	frame.add(p3);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true); 
	System.out.print(frame.isVisible());
}

}
