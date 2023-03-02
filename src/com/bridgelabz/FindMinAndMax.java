package com.bridgelabz;

import java.util.Scanner;

public class FindMinAndMax {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value: ");
		int a=sc.nextInt();
		System.out.println("enter value: ");
		int b=sc.nextInt();
		System.out.println("enter value: ");
		int c=sc.nextInt();
		System.out.println("Enter Operation Number: ");
		int d;
		int operation=sc.nextInt();
		switch(operation)
		{
			case 1 : d=a+b*c;
				System.out.println("The result is:"+d);
				break;
			case 2 : d=c+a/b;
				System.out.println("The result is:"+d);
				break;
			case 3 : d=a%b+c;
				System.out.println("The result is:"+d);
				break;
			case 4 : d=a*b+c;
				System.out.println("The result is:"+d);
				break;
			case 5 : if(a>b && a>c)
			{
				System.out.println("a is max");
			}
			else if(b>c && b>a)
			{
				System.out.println("b is max");
			}
			else
			{
				System.out.println("c is max");
			}
				break;
			case 6 : if(a<b && a<c)
			{
				System.out.println("a is min");
			}
			else if(b<c && b<a)
			{
				System.out.println("b is min");
			}
			else
			{
				System.out.println("c is min");
			}
				break;
			default: System.out.println("enter valid number");
		}
	}
}
