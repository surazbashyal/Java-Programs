package com.JDBC.Delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.JDBC.demo.CheckJDBCConnection;

public class Deletee {
	static Connection con;
	public static void main(String[] args) {
		try {
			Delete();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}
	static void Delete() throws SQLException{
		con=CheckJDBCConnection.getConnection();
		Scanner sc =new Scanner(System.in);
		String query="Delete from Student where id=?";
		System.out.println("Enter ID to be Deleted");
		int id=sc.nextInt();
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, id);
		int res=pstmt.executeUpdate();
		if(res>0) {
			System.out.println("Successfully Deleted");
		}
		else {
			{
				System.out.println("Deletion Unsuccessful");
			}
		}
		
		
	}
}
