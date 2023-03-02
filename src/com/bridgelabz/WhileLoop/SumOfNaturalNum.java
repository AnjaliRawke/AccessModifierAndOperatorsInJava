package com.bridgelabz.WhileLoop;

public class SumOfNaturalNum {
	public static void main(String[] args) {
		int num=10;
		int sum=0;
		int i=0;

		while(i<=num)
		{
			sum=sum+i;
			i++;
		}

		System.out.println("The sum of first 5 natural numbers: " + sum);

	}
}
