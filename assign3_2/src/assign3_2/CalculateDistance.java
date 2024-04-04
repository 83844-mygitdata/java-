package assign3_2;

import java.util.Scanner;

public class CalculateDistance {

	private double miles;
	private double costgasoline;
	private double average;
	private double parkingfees;
	private double toll;
	double totalcost;


	public CalculateDistance() {

	}

	public CalculateDistance(double miles, double costgasoline, double average, double parkingfees, double toll) {
		super();
		this.miles = miles;
		this.costgasoline = costgasoline;
		this.average = average;
		this.parkingfees = parkingfees;
		this.toll = toll;
	}

	public double getMiles() {
		return miles;
	}

	public double getCostgasoline() {
		return costgasoline;
	}

	public double getAverage() {
		return average;
	}

	public double getParkingfees() {
		return parkingfees;
	}

	public double getToll() {
		return toll;
	}


	public void acceptData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the miles : ");
		miles = sc.nextDouble();
		
		System.out.println("Enter the Cost of gasoline : ");
		costgasoline = sc.nextDouble();
		
		System.out.println("Enter the Average : ");
		average = sc.nextDouble();
		
		System.out.println("Enter the Parking fees : ");
		parkingfees = sc.nextDouble();
		
		System.out.println("Enter the Toll per day : ");
		toll = sc.nextDouble();
		
	}
	
	
	public void CalculateData()
	
	{
				totalcost = (miles/average)* costgasoline + parkingfees + toll;
				System.out.println("The total cost per day is : "+totalcost);

	}
	
}
