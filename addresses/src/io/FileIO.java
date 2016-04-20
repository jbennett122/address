package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class FileIO extends ObjectOutputStream{
	
 protected FileIO(OutputStream out) throws IOException {
	    super(out);
	  }

	  @Override
	  protected void writeStreamHeader() throws IOException {
	    // do not write a header, but reset:
	    // this line added after another question
	    // showed a problem with the original
	    reset();
	  }


 
public static AddressObj retrieveAddress() throws IOException{
	
 AddressObj ad = null;
	 
	 FileInputStream fis = new FileInputStream("t.tmp");
	    ObjectInputStream ois = new ObjectInputStream(fis);

	    
	    try {
			  ad = (AddressObj) ois.readObject();
			 			 
			 System.out.println("This is name "+ ad.getFirst() + ad.getLast());
			 			 
	    } catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    ois.close();
	return ad;
	
}
 
public static ArrayList<AddressObj> retrieveAddresses() throws IOException{
	 
	 
	 ArrayList<AddressObj> al = new ArrayList<AddressObj>();
	 boolean cont = true;
	 
	 FileInputStream fis = new FileInputStream("t.tmp");
	    
System.err.println("retrieve adddresses");
try {
	ObjectInputStream ois = new ObjectInputStream(fis);
    while(cont){
    	AddressObj ad=null;
        try {
        	ad = (AddressObj) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
          if(ad != null)
             al.add(ad);
          else
             cont = false;
       }
} catch (FileNotFoundException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
} catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}

return al;
	    
}

 public static void storeAddress(AddressObj address){
	
	 AddressObj ad = address;
	 
	 try {
			FileOutputStream fOutputStream = new FileOutputStream("t.tmp",true);
			ObjectOutputStream output = new ObjectOutputStream(fOutputStream);
	    
			output.writeObject(ad);
			output.close();
	    
	    } catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	 	 
 	}

 
 
 }


