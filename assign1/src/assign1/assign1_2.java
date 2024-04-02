package assign1;

import java.util.Scanner;

public class assign1_2 
{

	public static void main(String[] args) {
	double num1 = 0.0;
	double num2 = 0.0;
	boolean flag = false;
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number 1 : ");
	if(sc.hasNextDouble())
		if(sc.hasNextInt())
		{
			System.out.println("Entered number is not double");
			//sc.close();
		}
	
		else
		{
			num1 = sc.nextDouble();
			flag = true;
		}
		
		
		if(flag = true)
		{
	System.out.println("Enter number 2 : ");
	if(sc.hasNextDouble())
		if(sc.hasNextInt())
		{
			System.out.println("Entered number is not double");
			sc.close();
		}
	
		else
		{
			num2 = sc.nextDouble();
			double avg = (num1+num2) / 2;
			System.out.println("Average is : "+avg);
		}
		

		
		}
			
	
	}
}

