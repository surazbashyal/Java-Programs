package com.JDBC.insertion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.JDBC.demo.CheckJDBCConnection;

public class Insertion {
	static Connection con;
	public static void main(String[] args) {
	try {
		insert();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	} 
		
	}
	static void insert() throws SQLException {
		con=CheckJDBCConnection.getConnection();
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		long phone;
	    String address;
	    
	    System.out.println("enter id");
	    id=sc.nextInt();
	    System.out.println("enter name");
	    name=sc.next();
	    System.out.println("enter phone");
	    phone=sc.nextLong();
	    System.out.println("enter address");
	    address=sc.next();
		
		
		
		String query="insert into Student(ID,NAME,PHONE,ADDRESS)VALUES(?,?,?,?);";
		PreparedStatement stmt=con.prepareStatement(query);
		stmt.setInt(1, id);
		stmt.setString(2, name);
		stmt.setLong(3, phone);
		stmt.setString(4, address);
		int res=stmt.executeUpdate();
		if(res>0) {
			System.out.println("Successfully Inserted");
		}
		else {
			{
				System.out.println("Insertion Unsuccessful");
			}
		}
	}


}
