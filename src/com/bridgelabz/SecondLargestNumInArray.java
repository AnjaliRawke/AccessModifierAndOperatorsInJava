package com.bridgelabz;

public class SecondLargestNumInArray {
	public static void main(String[] args) {
		int temp;
		int a[] = {10, 20, 25, 100, 96, 57};


		for(int i = 0; i<a.length; i++ ){
			for(int j = i+1; j<a.length; j++){

				if(a[i]>a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("The second largest number is: "+a[a.length-2]);
	}
	}

