package com.bridgelabz.ArrayHandling;

public class ArrayElementsAtEvenPosition {
	public static void main(String[] args) {
		int[] arr = new int[]{1, 2, 4, 3, 5};
		System.out.println("Elements of given array present on even position: ");
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.print(arr[i] + " ");
		}
	}
}
