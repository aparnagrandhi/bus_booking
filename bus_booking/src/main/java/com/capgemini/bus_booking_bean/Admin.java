package com.capgemini.bus_booking_bean;

public class Admin {
	private int admin_id;
	private String admin_name;
	private String admin_email;

	public int getAdmin_id() {
		return admin_id;
	}

	public Admin(int admin_id, String admin_name, String admin_email) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
		this.admin_email = admin_email;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getAdmin_email() {
		return admin_email;
	}

	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
}
