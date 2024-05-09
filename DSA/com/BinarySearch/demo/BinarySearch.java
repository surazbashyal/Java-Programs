package com.BinarySearch.demo;

import java.util.*;

public class BinarySearch {
	
	void search(int a[],int n,int x)
	{
		int LB=0,UB=n-1;
		int mid=(LB+UB)/2;
		while(LB<=UB)
		{
			if(a[mid]==x) {
				System.out.println("Value Found in i.e."+a[mid]);
				System.exit(0);
			}
			else if(x>a[mid])
			{
				LB=mid+1;
			}
			else
			{
				UB=mid-1;
			}
		}
		System.out.println("Not Found");
	}

}
