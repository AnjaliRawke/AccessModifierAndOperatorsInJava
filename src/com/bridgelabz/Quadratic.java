package com.bridgelabz;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter value:");
			int a=sc.nextInt();
			System.out.println("Enter value:");
			int b=sc.nextInt();
			System.out.println("Enter value:");
			int c=sc.nextInt();
			double d=(b*b-4.0*a*c);
			//double sqrtval=Math.abs(d);
			//double sqrt=Math.sqrt(sqrtval);
			if(d>0)
			{
				double r1=b+Math.sqrt(d)/(2*a);
				double r2=-b-Math.sqrt(d)/(2*a);
				System.out.println("The roots are: " + r1 + "and" + r2);
			}
			else
			{
				System.out.println("Roots are imaginary");

			}
		}
	}

