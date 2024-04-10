package assign6;

import java.util.Scanner;

public class StringLength {
	
	private String EnterString;

	public StringLength() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StringLength(String enterString) {
		super();
		EnterString = enterString;
	}
	
	
	public String getEnterString() {
		return EnterString;
	}

	public void setEnterString(String enterString) {
		EnterString = enterString;
	}

	public void AcceptString() throws ExceptionLineTooLong {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		EnterString = sc.next();
		
		if(EnterString.length() > 8)
		{
		throw new ExceptionLineTooLong("The String is too long"); 
	}
		
	}
	
//	public void Stringlen() throws ExceptionLineTooLong {
//		if(EnterString.length() > 80)
//		{
//		throw new ExceptionLineTooLong(); 
//
//		}
//	}

	public void DisplayString() {
		System.out.println("String is : "+EnterString);
		
	}
	
}
