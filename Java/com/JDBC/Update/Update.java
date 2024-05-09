package com.JDBC.Update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.JDBC.demo.CheckJDBCConnection;

public class Update {
	static Connection con;
	public static void main(String[] args) {
		try {
			Updatee();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}
	static void Updatee() throws SQLException{
		con=CheckJDBCConnection.getConnection();
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter What do you want to update:\n 1.Name \n 2:Phone \n 3.Address \n");
		x=sc.nextInt();
		if(x==1) {
			String query  = "update  Student SET NAME = ? WHERE id = ?";
			System.out.println("Enter Name to be updated");
			String name=sc.next();
			System.out.println("Enter ID to be updated from");
			int id=sc.nextInt();
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			int res=pstmt.executeUpdate();
			if(res>0) {
				System.out.println("Name Successfully Updated");
			}
			else {
				{
					System.out.println("Update Unsuccessful");
				}
			}
		}
		else if(x==2) {
		String query  = "update  Student SET PHONE = ? WHERE id = ?";
		System.out.println("Enter Phone to be updated");
		String phone=sc.next();
		System.out.println("Enter ID to be updated from");
		int id=sc.nextInt();
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1, phone);
		pstmt.setInt(2, id);
		int res=pstmt.executeUpdate();
		if(res>0) {
			System.out.println("Phone Successfully Updated");
		}
		else {
			{
				System.out.println("Update Unsuccessful");
			}
		}
	}
		else if(x==3) {
			String query  = "update  Student SET ADDRESS = ? WHERE id = ?";
			System.out.println("Enter Address to be updated");
			String address=sc.next();
			System.out.println("Enter ID to be updated from");
			int id=sc.nextInt();
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, address);
			pstmt.setInt(2, id);
			int res=pstmt.executeUpdate();
			if(res>0) {
				System.out.println("Address Successfully Updated");
			}
			else {
				{
					System.out.println("Update Unsuccessful");
				}
			}
		}
}
}
