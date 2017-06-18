package io;

import java.io.Serializable;

public class AddressObj implements Serializable{

	@SuppressWarnings("unused")
	private String first;
	private String last;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String cell;
	private String email1;
	private String email2;

	public AddressObj(String[] args) {
		// TODO Auto-generated method stub
		 		
		this.first = args[0];
		this.last= args[1];
		this.address= args[2];
		this.city= args[3];
		this.state= args[4];
		this.zip= args[5];
		this.phone= args[6];
		this.cell= args[7];
		this.email1= args[8];
		this.email2= args[9];
	}
	
	public String getFirst(){
		
		return this.first;
	}
	
	public String getLast(){
		
		return this.last;
	}
	
	public String getAdd(){
		
		return this.address;
	}
	
	public String getCity(){
		
		return this.city;
	}
	
	public String getState(){
		
		return this.state;
	}
	
	public String getZip(){
		
		return this.zip;
	}
	
	public String getPhone(){
		
		return this.phone;
	}
	
	public String getCell(){
		
		return this.cell;
	}
	
	public String getE1(){
		
		return this.email1;
	}
	
	public String getE2(){
		
		return this.email2;
	}
	
	/*
	 * TODO
	 * 
	 * needs setters for the edit address button
	 *  
	 */
	public void setFirst(String first){
		
		this.first= first;
	}
	
	public void setLast(String last){
		
		this.last=last;
		
	}
	
	public void setAddress(String address){
		
		
		this.address= address;
	}
		
	public void setCity(String city){
		
		this.city = city;
	}
	
	public void setState(String state){
		
		this.state= state;
	}
	
	public void setZip(int zip){
		
			
		this.zip=String.valueOf(zip);
		
		
	}
	
}	

