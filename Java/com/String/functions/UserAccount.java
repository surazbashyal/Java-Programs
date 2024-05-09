package com.String.functions;

import java.util.Scanner;

public class UserAccount {
	static String un;
	static String pd1,pd2;
public static void main(String[] args) {
	signUp();

}
	static void signUp()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Username");
		un=sc.next();
		
		for(int i=3;i>0;i--) {
		System.out.println("Enter Password");
		pd1=sc.next();
		System.out.println("Confirm Password");
		pd2=sc.next();
		int x= pd1.compareTo(pd2);
		int y=pd1.length();
		if(x==0 && y>=8)
		{
			System.out.println("Signup Successful");
			System.exit(0);
		}
		else
			{
				System.out.println("Signup Unsuccessful");
				System.out.println("Try again! You have "+(i-1)+" tries left");
			}
		}
		}
		
		
	}

