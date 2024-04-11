package assign7;

import java.util.Scanner;

public class assign7_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1 ;
		System.out.println("Enter the string : ");
		s1 = sc.nextLine();
		
		
		
		StringBuilder s2 = new StringBuilder(s1).reverse();
		
		if (s1.equals(s2.toString()))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
		
	}

}






/*import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		String tr = str.trim();
		
//		String[] ans = tr.split("\\s+");
//		OR
		
		String[] ans = tr.split(" ");
		System.out.println(ans.length);
	}
}*/


















