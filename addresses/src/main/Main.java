/**
 * 
 */
package main;

  
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 

import gui.Gui;
import io.FileIO;
/**
 * @author jjb24
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(1+"\n");
	//Gui gui = new Gui();
		FileIO file = new FileIO();
		
		try {
			file.openFile(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
