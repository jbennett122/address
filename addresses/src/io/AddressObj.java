package io;

public class AddressObj {

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

}
