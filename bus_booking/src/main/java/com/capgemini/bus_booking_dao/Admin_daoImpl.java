package com.capgemini.bus_booking_dao;

import java.util.TreeSet;

import com.capgemini.bus_booking_bean.Admin;

public class Admin_daoImpl implements Admin_dao {

	TreeSet<Admin> atree = new TreeSet<Admin>();

	@Override
	public void addAdmin() {
		atree.add(new Admin(100, "Ramesh", "ramesh@gmail.com"));
		atree.add(new Admin(101, "Karan", "karan@gmail.com"));

	}
}
