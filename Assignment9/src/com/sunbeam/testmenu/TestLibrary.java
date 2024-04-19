package com.sunbeam.testmenu;
import com.sunbeam.entity.*;
import java.util.Scanner;
import com.sunbeam.entity.Category;
import com.sunbeam.lib.Library;

public class TestLibrary {

	public static void main(String[] args) {
		Library library = new Library();
		
		int choice;
		do {
			System.out.println("0.EXIT");
			System.out.println("1.Add book to the Library");
			System.out.println("2.Display all the books in Library");
			System.out.println("3.Books sorted by category");
			System.out.println("4.Book sorted by author name");
			System.out.println("5.Find book by ISBN Id ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				System.out.println("THANK YOU");
			break;
			case 1:
				System.out.print("Enter ISBN code of the book - ");
				String isbn = sc.next();
				System.out.print("Enter name of the book - ");
				String bookName = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter category - FICTION,HISTORY,BIOGRAPHY,THRILLER,SCIENCE");
				Category category = Category.valueOf(sc.nextLine().toUpperCase());
				System.out.print("Enter price of the book - ");
				double price = sc.nextDouble();
				System.out.print("Enter auther name - ");
				String authorName = sc.nextLine();
				sc.nextLine();
				System.out.print("Enter quantity of copies - ");
				int quantity = sc.nextInt();
				Book book = new Book(isbn, bookName, category, price, authorName, quantity);
				library.addBook(book);
			break;
			case 2:
				library.displayBooks();
			break;
			case 3:
				library.sortByCategory();
			break;
			case 4:
				library.sortByAuthor();
			break;
			case 5:
				System.out.print("Enter ISBN id of the book you want - ");
				sc.nextLine();
				String isbnID = sc.nextLine();
				library.findBook(isbnID);

			break;
			default:
				System.out.println("Enter valid choice");
			break;	
			}
		}while(choice != 0);
	}
    

}
