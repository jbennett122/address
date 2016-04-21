/**
 * 
 */
package main;

  
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import gui.DisplayResults;
import gui.Gui;
import io.AddressObj;
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
	
	 ArrayList<AddressObj> al = new ArrayList<AddressObj>();
	
	try{
	
		al = FileIO.retrieveAddresses(); 
		int i = 0;
		for(AddressObj a:al){
			System.out.print(i);
			System.out.print(a.getLast());
			
			i++;
			
		}
	}catch(FileNotFoundException | EOFException e1){
		e1.getStackTrace();	
		
		}
	
	
	
	//FileIO.retrieveAddress();
	//DisplayResults.display();
	}
}
