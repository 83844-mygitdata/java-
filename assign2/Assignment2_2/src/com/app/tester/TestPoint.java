package com.app.tester;

import com.app.geometry.Point2D;
public class TestPoint {

	public static void main(String[] args) {
//		Point2D p4 = new Point2D(4,5);
//		Point2D p3 = new Point2D(6,7);
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		
		p1.acceptPoint();
		System.out.println(p1.getDetails());
		p2.acceptPoint();
		System.out.println(p2.getDetails());
		
		if(p1.isEqual(p2))
			System.out.println("Points are located at same position");
		
		else
			System.out.println("Points are located at different position");
		
		System.out.println("Distance between points is :"+ p1.calculateDistance(p2));
		
		
		}

}
