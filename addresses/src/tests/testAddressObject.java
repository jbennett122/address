package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import io.AddressObj;

public class testAddressObject {

	public void readObject() throws IOException{
	FileInputStream fis = new FileInputStream("t.tmp");
    ObjectInputStream ois = new ObjectInputStream(fis);

    
    try {
		AddressObj ad = (AddressObj) ois.readObject();
		 
		 
		 System.out.println("This is first name "+ ad.getFirst());
		 
		 
    } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    

    ois.close();
    
	}
	
	
}
