package gui;
import java.io.IOException;

import io.*;
public class DisplayResults {

	public final static void display(){
		
		
		try {
			FileIO.retrieveAddresses();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
