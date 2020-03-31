package com.capgemini.bus_booking_dao;

import java.util.TreeSet;
import com.capgemini.bus_booking_bean.Employee;

public class Employee_daoImpl implements Employee_dao {

	TreeSet<Employee> etree = new TreeSet<Employee>();

	@Override
	public void addEmployee() {
		etree.add(new Employee(1, "Tina", "tina23@gmail.com", "03-02-1989", "Villaspur"));
		etree.add(new Employee(2, "Aparna", "aparna067@gmail.com", "09-06-1997", "Karanataka"));

	}

}
