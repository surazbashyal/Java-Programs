package com.selection.sort;

public class Selection {
	int min,temp;
void sort(int a[],int n)
{
	for(int i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	for(int i=0;i<n-1;i++) {
		min=i;
		for(int j=i+1;j<n;j++) {
			if(a[min]>a[j])
			{
				min=j;
			}
		}
		if(min!=i)
		{
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println();
		for(int x=0;x<n;x++)
		{
			System.out.print(a[x]+" ");
		}
	}
	
}
}
