package com.capgemini.bus_booking_dao;

import java.util.TreeSet;

import com.capgemini.bus_booking_bean.Customer;

public class CustomerdaoImpl implements Customer_dao {

	TreeSet<Customer> ctree = new TreeSet<Customer>();

	@Override
	public void addCustomer() {
		ctree.add(new Customer(1, "Dinesh", "30-06-1998", "dinesh@gmail.com", "Delhi", "8920677718"));
		ctree.add(new Customer(2, "Pushkar", "06-08-1998", "pushkar67@gmail.com", "Jaipur", "689089885"));
		ctree.add(new Customer(3, "Raman", "02-03-1995", "raman34#2@gmail.com", "Srilanka", "8957754768"));
		ctree.add(new Customer(4, "Devender", "12-08-1996", "dk056@gmail.com", "Gorakpur", "786557878"));
	}

}
