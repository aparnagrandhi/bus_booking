package com.capgemini.bus_booking_bean;

public class Customer {
	private int cust_id;
	private String cust_name;
	private String cust_dob;
	private String cust_email;
	private String cust_address;

	public Customer(int cust_id, String cust_name, String cust_dob, String cust_email, String cust_address,
			String cust_phno) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_dob = cust_dob;
		this.cust_email = cust_email;
		this.cust_address = cust_address;
		this.cust_phno = cust_phno;
	}

	private String cust_phno;

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_dob() {
		return cust_dob;
	}

	public void setCust_dob(String cust_dob) {
		this.cust_dob = cust_dob;
	}

	public String getCust_email() {
		return cust_email;
	}

	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public String getCust_phno() {
		return cust_phno;
	}

	public void setCust_phno(String cust_phno) {
		this.cust_phno = cust_phno;
	}

}
