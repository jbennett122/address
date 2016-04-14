package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteObj {

	public static void WriteObj(AddressObj ad) {
		// TODO Auto-generated method stub

		
		}
	
	
	

	public static void write(AddressObj ad)  throws IOException {
	FileOutputStream fos = new FileOutputStream("t.tmp");
    ObjectOutputStream outputStream = new ObjectOutputStream(fos);
	
	System.err.print(1+"\n");
	
	try{
		 String buf = null;

	outputStream.writeUTF(buf+"\n");
				
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(outputStream!=null){
			try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


	}
}


