package com.insertion.sort;


public class Insertion {
	int temp;
	void sort(int a[],int n){
		for(int i=1;i<n;i++) {
			temp=a[i];
			int j=i-1;
			for(j=i-1;j>=0;j--)
			{
				if(temp<a[j])
				{
					a[j+1]=a[j];
				}
			}
			System.out.print(j);
			a[j+1]=temp;
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
}