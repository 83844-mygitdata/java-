package com.app.fruits;

import java.util.Scanner;

public class Fruit {

	private String color;
	private double weight;
	private String name;
	private boolean isFresh = true;
	
	public Fruit() {
		super();
		
	}


	public Fruit(String color, double weight, String name) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
	}
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isFresh() {
		return isFresh;
	}


	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}


	@Override
	public String toString() {
			return ("Fruits Name : "+name+"\n"+"Fruits Color : "+color+"\n"+ "Fruits Weight : "+weight);
	}
	
	
	public String taste()
	{
		return "no specific taste";
	}
	
	public void accept(Scanner sc)
	{
		System.out.println("Enter Fruit Color : ");
		color = sc.next();
		System.out.println("Enter Fruit Weight : ");
		weight = sc.nextDouble();
		System.out.println("Enter Fruit Name : ");
		name = sc.next();
	}
	
	public void display()
	{
		System.out.println("Fruit Color : "+color);
		System.out.println("Fruit Weight : "+weight);
		System.out.println("Fruit Name : "+name);
	}
	
}
