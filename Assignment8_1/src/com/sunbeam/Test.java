/*Q1. Write a generic sort method for implementing selection sort algorithm with given comparator
Object as parameter. Below is reference code for selection sort do the respective changes to make it
generic using comparator
static void selectionSort(Integer [] arr) {
for(int i=0; i<arr.length-1; i++)
for(int j=i+1; j<arr.length; j++)
if(arr[i] > arr[j]) {
Integer temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}*/

package com.sunbeam;

import java.util.Comparator;

public class Test {
	
	public static<T> void selectionSort(T[] arr, Comparator<T> b) {
		for(int i=0; i<arr.length-1; i++)
			for(int j=i+1; j<arr.length; j++)
			if(b.compare(arr[i], arr[j])>0) {
			T temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			}
		
		for(T element : arr)
			System.out.println(element);
	}

	public static void main(String[] args) {
		
		Manager[] arr = new Manager[3];
		arr[0] = new Manager(1, "Rohit", 500);
		arr[1] = new Manager(2, "Yogesh", 800);
		arr[2] = new Manager(3, "Rakesh", 1000);
		
		System.out.println("before Sorting -");
		for (Manager employee : arr)
			System.out.println(employee);
		
		System.out.println("After Sorting -");
        selectionSort(arr, new Manager());
//		selectionSort(arr, (a,b)-> a.name.compareTo(b.name));
		
		
	}

}
