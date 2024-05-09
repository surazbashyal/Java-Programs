package com.insertion.sort;

import java.util.Scanner;

import com.selection.sort.Selection;

public class Runnable {
	public static void main(String[] args) {
		Insertion s1=new Insertion();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many numbers in array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the value of "+i+" num");
			a[i]=sc.nextInt();
		}
		s1.sort(a, n);
	}

}