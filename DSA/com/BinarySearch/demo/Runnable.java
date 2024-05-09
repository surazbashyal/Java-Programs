package com.BinarySearch.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Runnable {
	
	public static void main (String[] args) {
		int n,x;
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the no of array : ");
	n = sc.nextInt();
	int[] a= new int[n];
	for (int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	for (int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
	System.out.print("Enter the number to be searched");
	x=sc.nextInt();
	BinarySearch b1=new BinarySearch();
	b1.search(a, n, x);
}
}
