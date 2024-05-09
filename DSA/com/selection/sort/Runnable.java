package com.selection.sort;

import java.util.Scanner;

public class Runnable {

	
	public static void main(String[] args) {
		Selection s1=new Selection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many numbers in array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the value of"+i+"num");
			a[i]=sc.nextInt();
		}
		s1.sort(a, n);
		
	}

}
