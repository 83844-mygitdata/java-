/*Q1. (Credit Limit Calculator)
Develop a Java application that determines whether any of several department-store customers has
exceeded the credit limit on a charge account.
For each customer,the following facts are available:
a) account number
b) pending balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning
balance+ charges – credits), display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
program should display the message "Credit limit exceeded".
For eg -
Allowed Credit = 50000
total items charged = 25000
total all credit applied in this month = 10000
pending balance at the begining of the month = 5000
new balance for next month = 5000+25000-10000 => 20000 < Allowed Limit*/

package optional1;

import java.util.Scanner;

public class optional1_1 {

	private final int accno;
	private int beginingbalance;
	private int totalitems;
	private int totalcredits;
	private int creditlimit;
	private static int generate_accno;
	private int new_balance ;

	public optional1_1() {

	}

	public optional1_1(int accno, int beginingbalance, int totalitems, int totalcredits, int creditlimit, int new_balance) {
		super();
		this.beginingbalance = beginingbalance;
		this.totalitems = totalitems;
		this.totalcredits = totalcredits;
		this.creditlimit = creditlimit;
		this.new_balance = new_balance;
	}

	static {
		generate_accno = 100;
	}

	{
		accno = ++generate_accno;
	}

	void acceptData() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the pending balance at the beginning of the month : ");
		beginingbalance = sc.nextInt();

		System.out.println("Enter the total of all items charged by the customer this month : ");
		totalitems = sc.nextInt();

		System.out.println("Enter the total of all credits applied to the customer’s account this month : ");
		totalcredits = sc.nextInt();

		System.out.println("Enter the Credit Limit : ");
		creditlimit = sc.nextInt();

	}

	public int newBalance() {
	   return this.new_balance = (beginingbalance + totalitems - totalcredits);
	}
	
	void creditLimit() {
		if (new_balance < creditlimit)
			System.out.println("Credit limit exceeded");
	}

	

	void displayData() {
		System.out.println("Account Number :" + accno);
		System.out.println("Credit Limit : " + creditlimit);
		System.out.println("Total items charged : " + totalitems);
		System.out.println("Total all credit applied in this month : " + totalcredits);
		System.out.println("Pending balance at the begining of the month : " + beginingbalance);
		System.out.println("New balance for next month : ");
		System.out.println(newBalance());
	}

}
