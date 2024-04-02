package assign1;

import java.util.Scanner;

public class assign1_3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int quantity;
		int bill=0;
		int price;
		int choice;
		do
		{	
		System.out.println("***************FOOD MENU*****************");
		System.out.println("0.Exit");
		System.out.println("1.Dosa");
		System.out.println("2.Samosa");
		System.out.println("3.Idli");
		System.out.println("4.Vada");
		System.out.println("5.Kanda Bhaji");
		System.out.println("6.TEA");
		System.out.println("7.Coffee");
		System.out.println("8.Omlet");
		System.out.println("9.Sandwitch");
		System.out.println("10.Maggie");
		System.out.println("11.Total Bill:");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		
		switch(choice)
		{
			case 0:
			{
				System.out.println("Thank you for visiting");
				break;
			}
			case 1:
			{	
				System.out.println("Price of Dosa is 30");
				
				System.out.println("Enter the Quantity: ");
				quantity=sc.nextInt();
				bill=bill+quantity*30;
				break;
		    }
			
			case 2:
			{	
				System.out.println("Price of Samosa is 20");
				
				System.out.println("Enter the Quantity: ");
				quantity=sc.nextInt();
				bill=bill+quantity*20;
				break;
		    }
			
			case 3:
			{	
				System.out.println("Price of Idli is 25");
				
				System.out.println("Enter the Quantity: ");
				quantity=sc.nextInt();
				bill=bill+quantity*25;
				break;
		    }
			
			case 4:
			{	
				System.out.println("Price of vada is 25");
				
				System.out.println("Enter the Quantity: ");
				quantity=sc.nextInt();
				bill=bill+quantity*25;
				break;
		    }
			
			case 5:
			{	
				System.out.println("Price of Kanda Bhaji is 35");
				
				System.out.println("Enter the Quantity: ");
				quantity=sc.nextInt();
				bill=bill+quantity*35;
				break;
		    }
			
			case 6:
			{	
				System.out.println("Price of Tea is 10");
				
				System.out.println("Enter the Quantity: ");
				quantity=sc.nextInt();
				bill=bill+quantity*10;
				break;
		    }
			
			case 7:
			{	
				System.out.println("Price of Coffee is 15");
				
				System.out.println("Enter the Quantity: ");
				quantity=sc.nextInt();
				bill=bill+quantity*15;
				break;
		    }
			
			case 8:
			{	
				System.out.println("Price of Omlet is 20");
				
				System.out.println("Enter the Quantity: ");
				quantity=sc.nextInt();
				bill=bill+quantity*20;
				break;
		    }
			
			case 9:
			{	
				System.out.println("Price of Sandwitch is 40");
				
				System.out.println("Enter the Quantity: ");
				quantity=sc.nextInt();
				bill=bill+quantity*40;
				break;
		    }
			
			case 10:
			{	
				System.out.println("Price of Maggie is 25");
				
				System.out.println("Enter the Quantity: ");
				quantity=sc.nextInt();
				bill=bill+quantity*25;
				break;
		    }
			
			case 11:
				System.out.println("Total bill is: "+bill);
				break;
			
		}
		
	}while(choice!=0);
}}	 

