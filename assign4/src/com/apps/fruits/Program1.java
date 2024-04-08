package com.app.tester;

import java.util.Arrays;
import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;


enum menu 
{
	EXIT,MANGO,ORANGE,APPLE;
}
public class Program1 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of basket : ");
		int size = sc.nextInt();
		Fruit[]basket = new Fruit[size];
		Fruit f = null;
		int choice;
		//menu choice;
		int index = 0;
		boolean status = true;
		while(status)
		{
			System.out.println("0: Exit !!");
			System.out.println("1: Add Mango ");
			System.out.println("2: Add Orange ");
			System.out.println("3: Add Apple ");
			System.out.println("4: Display names of all fruits ");
			System.out.println("5: Display  details of all fruits ");
			System.out.println("6: Display all tates ");
			System.out.println("7: Mark a fruit as stale");
			System.out.println("8: Mark all sour fruits stale");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
			case  0:
				System.out.println("Thank you for using Fruit Basket !!!!");
				status = false;
				break;
				
			case 1:
				System.out.println("========== Add Mango =============");
				if(index<size)
				{
					System.out.println("Enter a name : ");
					String name = sc.next();
					System.out.println("Enter a weight : ");
					double weight = sc.nextDouble();
					System.out.println("Enter a color : ");
					String color = sc.next();
//					System.out.println("Is Mango fresh : ");
//					f.setFresh(sc.nextBoolean());
					f= new Mango(color,weight,name);
					basket[index] = f;
					index++;
					System.out.println("Fruit Mango added Successfully !!!");
				}
				else
					System.out.println("Basket is full !!!");
				break;
				
			case 2:
				System.out.println("=========== Add Orange ============");
				if(index <size)
				{
					System.out.println("Enter a name : ");
					String name = sc.next();
					System.out.println("Enter a weight : ");
					double weight = sc.nextDouble();
					System.out.println("Enter a color : ");
					String color = sc.next();
					f = new Orange(color,weight,name);
					basket[index] = f;
					index++;
					System.out.println("Fruit Orange added Successfully !!!");
				}else
					System.out.println("Basket is Full !!");
				
				break;
				
			case 3:
				System.out.println("============ Add Apple ============");
				if(index < size)
				{
					System.out.println("Enter a name : ");
					String name = sc.next();
					System.out.println("Enter a weight : ");
					double weight = sc.nextDouble();
					System.out.println("Enter a color : ");
					String color = sc.next();
					f = new Apple(color,weight,name);
					basket[index] = f;
					index++;
					System.out.println("Fruit Apple added Successfully !!!");
				}
				else
					System.out.println("Basket is full !!!");
				
				break;
				
			case 4:
				System.out.println("======== Names of all fruits ==========");
				for(int i = 0;i<index;i++)
				{
					System.out.println("Name of Fruits : "+basket[i].getName());
					
				}
//				
//				for(Fruit name :basket)
//				{
//					System.out.println("Name of Fruits : "+name);
//				}
				break;
				
			case 5:
				System.out.println("=========== Details of all for fruits ============");
				for(int i = 0;i<index;i++)
				{
					System.out.println(basket[i].toString());
					System.out.println("Taste of :"+basket[i].getName()+":"+basket[i].taste());
					System.out.println("Fruit is fresh : "+basket[i].isFresh());	
				}
				break;
				
			case 6:
				System.out.println("================= Tastes of all stale ============== ");
				
				if(index < size)
				{
					for(int i = 0;i<index;i++)
					{
						if(!basket[i].isFresh())
							System.out.println("Taste of "+basket[i].getName()+" : "+basket[i].taste());
					}
				}
				
				break;
				
			case 7:
				System.out.println("======================= Make fruit as stale ==============");
			
					System.out.println("Enter index to change : ");
					int count = sc.nextInt();
					
					
						if(count >= 0 && count<index)
						{
							basket[count].setFresh(false);
							System.out.println(basket[count].getName());
						}
						else
							System.out.println("Invalid Index !!");
					
				
				break;
				
			case 8:
				System.out.println("-=============== Make all sour tastes ==================");
				if(index < size)
				{
					for(int i = 0;i<index;i++)
					{
						if(basket[i].taste().equals("sour"))
							basket[i].setFresh(false);
					}
				}
				System.out.println("Sour Fruits stale !!");
				break;
				
				default :
					System.out.println("Invalid choice !!!");
					status = false;
					
			}
			
		}
	}
}
