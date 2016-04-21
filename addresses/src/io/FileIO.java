package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileIO {
	
 protected FileIO() throws IOException {
	    super();
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
	 int i =0;
	 FileInputStream fis = new FileInputStream("t.tmp");
	    
System.err.println("retrieve adddresses");
try {
	ObjectInputStream ois = new ObjectInputStream(fis);
    while(cont){
    	
    	AddressObj ad=null;
    	System.err.println(i);
        try {
        	ad = (AddressObj) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
          if(ad != null){
        	 
        	  al.add(ad);
        	  i++;
        	  System.err.println(i);
          }
             
          else{
        	  cont = false;
          }
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

 public static void storeAddress(AddressObj address) throws IOException{
	
	 AddressObj ad = address;
	 boolean exist = false;
	 AppendingObjectOutputStream output = null;
	 
	File f = new File("t.tmp");
	 
	 exist = f.exists();
	 try {
				 
		  
		if(!exist)				
		 {FileOutputStream fOutputStream = new FileOutputStream("t.tmp");
			 System.err.print(exist);
			 output = (AppendingObjectOutputStream) new ObjectOutputStream(fOutputStream);

			output.writeObject(ad);
			
		 
		 }else {
			 FileOutputStream fOutputStream = new FileOutputStream("t.tmp",true);
			 System.err.print(exist);
			  output = new AppendingObjectOutputStream(fOutputStream);
			 	output.reset();
				output.writeObject(ad);
				
		 
		 }
			
		 
	    } catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	 output.close();	 
 	}

 
 
 }


