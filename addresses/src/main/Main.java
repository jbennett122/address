/**
 * 
 */
package main;

  
import java.io.IOException;

import gui.DisplayResults;
import gui.Gui;
import io.FileIO;
import tests.*;

/**
 * @author jjb24
 *
 */
public class Main {
 
	public static void main(String[] args) throws IOException {
		
	@SuppressWarnings("unused")
	Gui gui = new Gui();
	 
	//testAddressObject tests =  new testAddressObject();
	//tests.readObject();
	
	FileIO.retrieveAddress(); 
	DisplayResults.display();
	}
}
