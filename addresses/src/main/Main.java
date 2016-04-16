/**
 * 
 */
package main;

  
import java.io.IOException;

import gui.Gui;
import tests.*;

/**
 * @author jjb24
 *
 */
public class Main {
 
	public static void main(String[] args) throws IOException {
		
	@SuppressWarnings("unused")
	Gui gui = new Gui();
	 
	testAddressObject tests =  new testAddressObject();
		 tests.readObject();
	}
}
