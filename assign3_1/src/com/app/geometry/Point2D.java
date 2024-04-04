package com.app.geometry;

import java.util.Scanner;


public class Point2D {
	private int x;
	private int y;
	
	Scanner sc = new Scanner(System.in);
	
	public Point2D() {
		x = 0;
		y = 0;
	}
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
    public String getDetails() {
    	String result;
    	result = "("+x+","+y+")";
    	return result;
    }
    
    public boolean isEqual(Point2D p2) {
    	if(this.x==p2.x && this.y == p2.y)
    		return true;
    	else
    		return false;
    	
    }
    public double calculateDistance(Point2D p2) {
    	return Math.sqrt(Math.pow(this.x - p2.x, 2) + Math.pow(this.y - p2.y, 2));
    }
    
    public void acceptPoint() {
    System.out.println("Enter x and y coordinate - ");
     x = sc.nextInt();
     y = sc.nextInt();
    
    }
    public void displayDetails() {
    	System.out.println();
    }
}   

