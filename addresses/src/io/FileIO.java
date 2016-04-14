package io;

import java.nio.file.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIO {
	public static void openFile(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner inputStream = null;
		PrintWriter outputStream = null;
		
		System.out.print(1+"\n");
		try{
			
			inputStream = new Scanner(new BufferedReader(new FileReader("test1.txt")));
			outputStream = new PrintWriter(new FileWriter("test2.txt",true));
			
			int endChecker;
			String buf = null;
			while(inputStream.hasNext()){
				System.out.print(inputStream);
				buf= inputStream.next();
				outputStream.write(buf+"\n");
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(inputStream!=null){
				inputStream.close();
			}
			if(outputStream!=null){
				outputStream.close();
			}
			
		}
	}
		
		
		
}


