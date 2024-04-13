package assign8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Student {
	private int rollno;
	private String name;
	private String city;
	private double marks;

	Scanner sc = new Scanner(System.in);

	public Student() {

	}

	public Student(int rollno, String name, String city, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public double getMarks() {
		return marks;
	}

	void acceptData() {
		System.out.println("Enter the rollno : ");
		rollno = sc.nextInt();
		System.out.println("Enter the name : ");
		name = sc.next();
		System.out.println("Enter the city : ");
		city = sc.next();
		System.out.println("Enter the marks : ");
		marks = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

}
