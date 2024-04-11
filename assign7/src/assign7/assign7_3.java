package assign7;

import java.util.Scanner;

public class assign7_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		
		System.out.println("Enter the String : ");
		s1 =  sc.nextLine();
		
		String s2 = s1.trim();
		
		String[] s3 = s2.split(" ");
		System.out.println(s3.length);
		
		
	}

}
