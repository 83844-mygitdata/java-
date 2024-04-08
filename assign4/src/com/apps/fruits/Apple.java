package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String color, double weight, String name) {
		super(color, weight, name);
		
	}
	
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public String taste() {
		return "Sweet n sour";
	}

}
