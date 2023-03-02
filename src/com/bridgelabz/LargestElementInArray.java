package com.bridgelabz;

public class LargestElementInArray {
	public static void main(String[] args) {
		int a[]= {1,2,111,412,5};
		// Finding the largest element
		int Largest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > Largest)
				Largest = a[i];
		}
		System.out.println("The Largest Element of Array is " + Largest);
	}
}
