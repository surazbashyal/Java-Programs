package StudentRecord;

import java.util.Scanner;

public class RecordStudent {
	 String name;
	 int id;
	 String address;
	 int gpa;
	RecordStudent(Scanner sc) {
		System.out.println("Enter Name");
		this.name=sc.next();
		System.out.println("Enter Address");
		this.address=sc.next();
		System.out.println("Enter Id");
		this.id=sc.nextInt();
		System.out.println("Enter GPA");
		this.gpa=sc.nextInt();
		
		
	}
	void check() {
		if(this.gpa>3.5) {
			System.out.println("Name: "+this.name+" Address: "+this.address+" GPA:"+this.gpa+" ID: "+this.id);
		}
	}
	
void display() {
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter how many students");
	num=sc.nextInt();
	RecordStudent r[]=new RecordStudent[num];
	for (int i=0;i<num;i++) {
		r[i]=new RecordStudent(sc);
	}
	for(int i=0;i<num;i++) {
		r[i].check(); 
	}
}
}
