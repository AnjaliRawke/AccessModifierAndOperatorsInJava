package com.bridgelabz;

import java.util.Scanner;

public class DisplayUnitTenAndMore {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner( System.in );
		int number= sc.nextInt();

		if(number==1) {
			System.out.println("unit");
		}
		else if(number==10) {
			System.out.println("tenth");
		}
		else if(number==100) {
			System.out.println("hundredth");
		}
		else if(number==1000) {
			System.out.println("thousandth");
		}
		else if(number==10000) {
			System.out.println("ten thousandth");
		}
		else
			System.out.println("Not the required number");
	}

}
