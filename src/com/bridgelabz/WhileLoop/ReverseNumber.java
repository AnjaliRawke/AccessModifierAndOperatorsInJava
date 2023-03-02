package com.bridgelabz.WhileLoop;

public class ReverseNumber {
	public static void main(String[] args) {
		int number = 4321, reverse = 0;
		while(number != 0)
		{
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number/10;

		}
		System.out.println("The Reverse Of Given Numer is: " +reverse);
	}
}
