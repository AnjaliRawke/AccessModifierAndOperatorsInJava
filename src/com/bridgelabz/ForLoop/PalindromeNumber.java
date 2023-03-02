package com.bridgelabz.ForLoop;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num = 121 , reversedNum = 0, remainder;
		int originalNum = num;
		for ( num = 121;num!=0;num/=10) {
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
		}

		if (reversedNum==originalNum) {
			System.out.println(reversedNum + " is a Palindrome Number.");
		}
		else {
			System.out.println(reversedNum + " is not a Palindrome Number.");
		}
	}
}
