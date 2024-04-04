//Q1. Copy the Point2D class , along with the package from previous assignment.
//a) Create a class "TestPointArray1.java" in "tester" package for the following
//b) Accept , how many no of points to plot from user.
//c) Create suitable data structure
//Hint : Point2D[] points=new Point2D[sc.nextInt()];
//d) Prompt user for x & y co ordinates n store the data suitably
//Hint : for loop
//e) Supply Menu to user with various Options like following
//1. Display details of a specific point
//User i/p : index
//O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!)
//2) Display x, y co-ordinates of all points
//Hint : for-each
//3) User i/p : 2 indices for the points , validate the indices
//Display distance between specified points (iff they are not located at the same position)
//eg : sop("Enter index of strt point n end point");
//validation : boundary condition (0<=index<length-1)
//isEqual -- false --compute distance --display it.
//4. Exit

package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many no of points to plot from user");
		int p = sc.nextInt();
		Point2D[] points=new Point2D[p];
		
		System.out.println("Enter x and y co-ordinates : ");
		for(int i=0; i<points.length; i++) {
				points[i] = new Point2D();
				points[i].acceptPoint();
		}
		  int choice ;
		do {
						
			System.out.println("1.Display details of a specific point");
			System.out.println("2.Display x, y co-ordinates of all points");
			System.out.println("3. Validating the indices ");
			System.out.println("4. Exit");
			System.out.println("Enter choice : ");
			choice = sc.nextInt();
			switch (choice) {
			      case 1:
			    	  int index;
			    	  System.out.println("Enter index to display");
			    	  index = sc.nextInt();
			    	  if (index>points.length)
			    		  System.out.println("Invalid index , pls retry!!!!");
			    	  else
			    	  System.out.println(points[index].getDetails());
			    	  break;
			      
			      case 2:
//			    	  for(int i=0; i<points.length; i++) {
//			    		  System.out.println( points[i].getDetails());
//			    	  }
			    	  for(Point2D abc: points)
			    		  abc.getDetails();
			    	  break;
			    	  
			      case 3:
			    	  int r;
			    	  int s;
			    	  System.out.println("Enter indices strt point n end point");
			    	  r = sc.nextInt();
			    	  s = sc.nextInt();
			    	  if(r < points.length && s < points.length) {
			    		  if(points[r].isEqual(points[s]))  
			    			  System.out.println("Points are equal");
			    		  else 
				    		  System.out.println("Distance between the points : "+points[r].calculateDistance(points[s]));
			    	  }
			    	  else
			    		   System.out.println("Invalid Points!!! ");
			    	  
			    	  
			    	  break;
			      case 4:
			    	  System.out.println("Thanks for using");
			    	  
			    	break; 	
			}
			
		}while(choice !=4);
			
		
		
	}

}
