package com.bridgelabz.SwitchCase;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char z = sc.next().charAt(0);
		switch (z) { // Checking Vowel Character using Switch Case
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				System.out.println(z + " is a Vowel.");
				break;

			default:
				System.out.println(z + " is a Consonant");

		}
	}
}
