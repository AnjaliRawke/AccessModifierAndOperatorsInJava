package com.bridgelabz;

import java.util.Scanner;

public class IfElseSingleDigitNum {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		if (number == 0) {
			System.out.println("The given number in word1 : Zero");
		} else if (number == 1) {
			System.out.println("The given number in word : One");
		} else if (number == 2) {
			System.out.println("The given number in word : Two");
		} else if (number == 3) {
			System.out.println("The given number in word: Three");
		} else if (number == 4) {
			System.out.println("The given number in word : Four");
		} else if (number == 5) {
			System.out.println("The given number in word : Five");
		} else if (number == 6) {
			System.out.println("The given number in word : Six");
		} else if (number == 7) {
			System.out.println("The given number in word : Seven");
		} else if (number == 8) {
			System.out.println("The given number in word : Eight");
		} else if (number == 9) {
			System.out.println("The given number in word : Nine");
		} else {
			System.out.println("not a single digit number");
		}
	}
}
