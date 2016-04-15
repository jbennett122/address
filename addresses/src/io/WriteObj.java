package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObj {
 
	
	

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


