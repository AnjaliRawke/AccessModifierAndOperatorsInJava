package com.bridgelabz;

public class ArrayInAscendingOrder {
	public static void main(String[] args) {
		int b[]  ={5, 9, 8, 7, 1};
		int temp = 0;

		//Sort the array in ascending order
		for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				if(b[i] > b[j]) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		System.out.println("Elements of array  in ascending order: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}
}


