package assign8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Student s = new Student();
		int index = 0;
		Student arr[] = new Student[3];
		// Student s = null;

		int choice;
		do {
			System.out.println("0 . Exit ");
			System.out.println("1 . Add Student ");
			System.out.println("2 . Display Student ");
			System.out.println("3 . Sort by city asc ");
			System.out.println("4 . Sort by marks desc ");
			System.out.println("5 . Sort by name desc ");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println(" Exited :P");
				break;

			case 1:
				System.out.println("Enter Student Data : ");

				if (index < 3) {
					arr[index] = new Student();
					arr[index].acceptData();

					index++;
				}

				break;

			case 2:
				System.out.println("Data Is :");
				for (int i = 0; i < 3; i++) {
					System.out.println(arr[i]);
				}
				break;

			case 3:

				class StudentNameComparator implements Comparator<Student> {

					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.getCity().compareTo(o2.getCity());
						return value;
					}

				}

				Comparator<Student> StudentCity = new StudentNameComparator();

				Arrays.sort(arr, StudentCity);

				for (Student student : arr) {
					System.out.println(student);

				}

				break;

			case 4:
				class StudentMarksComparator implements Comparator<Student> {

					@Override
					public int compare(Student o1, Student o2) {
						int value = Double.compare(o1.getMarks(), o2.getMarks());
						return value;
					}

				}

				Comparator<Student> StudentMarks = new StudentMarksComparator();

				Arrays.sort(arr, StudentMarks);

				for (Student student : arr) {
					System.out.println(student);

				}

				break;

			case 5:
				class StudentNameComparator implements Comparator<Student> {

					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.getName().compareTo(o2.getName());
						return value;
					}

				}

				Comparator<Student> StudentName = new StudentNameComparator();

				Arrays.sort(arr, StudentName);

				for (Student student : arr) {
					System.out.println(student);

				}

				break;

			default:
				System.out.println("Invalid choice !!! ");
				break;
			}

		} while (choice != 0);

	}

}
