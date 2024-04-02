package assign1;

import java.util.Scanner;

public class assign1_1 {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter the number :");
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		String Binary  = Integer.toBinaryString(num);
		
		String Oct = Integer.toOctalString(num);
		
		String Hex = Integer.toHexString(num);
		
		System.out.println("Given number: "+num);
		System.out.println("Binary Equivalent : "+Binary);
		System.out.println("Octal Equivalent : "+Oct);
		System.out.println("Hexadecimal Equivalent : "+Hex);
 
	}

}
