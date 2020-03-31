package com.capgemini.bus_booking_dao;

import java.util.TreeSet;

import com.capgemini.bus_booking_bean.Manager;

public class Manager_daoImpl implements Manager_dao {

	TreeSet<Manager> mtree = new TreeSet<Manager>();

	@Override
	public void addManager() {
		mtree.add(new Manager(1, "Dinesh", "dinesh5455@gmail.com", "09-4-1997", "979898988", "Delhi"));
		mtree.add(new Manager(2, "Pushkar", "pushkar235@gmail.com", "23-06-1999", "679898988", "Lahore"));
	}
}
