package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Student arr[] = new Student[5];
		arr[0] = new Student(3, "karan","Delhi", 60);
		arr[1] = new Student(1, "gaurav","Mumbai", 78);
		arr[2] = new Student(2, "niraj","Chennai", 95);
		arr[3] = new Student(5, "shyam","Kolkata", 75);
		arr[4] = new Student(4, "ajay", "Pune",80);
		
		System.out.println("Before Sorting -");
		for (Student stu : arr)
			System.out.println(stu);
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
		
		System.out.println("0. Exit");
		System.out.println("1.sorted on their city (asc)");
		System.out.println("2.sorted on their marks (desc)");
		System.out.println("3.sorted on their name (asc)");
		System.out.println("Enter your choice : ");
		
		choice = sc.nextInt();
		
		
		switch(choice){
		case 0:
			System.out.println("Thank you .....");
			break;
			
		case 1:
			class Stucity implements Comparator<Student>{
				public int compare(Student s1, Student s2) {
					int value = s1.city.compareTo(s2.city);
					return value;
				}
				
			}
			
			Comparator<Student> stucity = new Stucity();
			Arrays.sort(arr,stucity);
			
			System.out.println("After Sorting -");
			for (Student employee : arr)
				System.out.println(employee);
			
			break;
			
		case 2:
			class Stumark implements Comparator<Student>{
				public int compare(Student s1, Student s2) {
					int value = Double.compare(s2.marks,s1.marks);
					return value;
				}
				
			}
			
			Comparator<Student> stumark = new Stumark();
			Arrays.sort(arr,stumark);
			
			System.out.println("After Sorting -");
			for (Student employee : arr)
				System.out.println(employee);
			break;
			
		case 3:
			class Stuname implements Comparator<Student>{
				public int compare(Student s1, Student s2) {
					int value = s1.name.compareTo(s2.name);
					return value;
				}
				
			}
			
			Comparator<Student> stuname = new Stuname();
			Arrays.sort(arr,stuname);
			
			System.out.println("After Sorting -");
			for (Student employee : arr)
				System.out.println(employee);
			break;
			
		default:
			System.out.println("Wrong choice");
			break;
		
		}
		}while(choice != 0);
		
		
		
		
		
		
		
		

	}

}
