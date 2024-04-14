package com.sunbeam;

import java.util.Comparator;

public class Manager implements Comparator<Manager>{
	int id;
	String name;
	double salary;
	
	public Manager() {
		
	}

	public Manager(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compare(Manager o1, Manager o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
	
	
	
	
	
	
	

}
