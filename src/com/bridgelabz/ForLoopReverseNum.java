package com.bridgelabz;

public class ForLoopReverseNum {
	public static void main(String[] args) {
		int reverse = 0;
		for(int i = -2345;i!=0;i=i/10)
		{
			int remainder = i % 10; //1
			reverse = reverse * 10 + remainder; //0*10+1
		}
		System.out.println("The Reverse Of i is: " +reverse);
	}
}

