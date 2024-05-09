package com.JDBC.selection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.JDBC.demo.CheckJDBCConnection;

public class Selection {
       static Connection conn;
	   public static void main(String[] args) {
	      // Open a connection
	      try {
	    	  Select();
	      }
	      	catch (Exception e) {
	      		System.out.println(e.getMessage());
	      }
	      }
	   static void Select() throws SQLException
	   {
	    	  conn=CheckJDBCConnection.getConnection();
		         Statement stmt = conn.createStatement();
		         ResultSet rs = stmt.executeQuery("Select * from Student");	      
		         while(rs.next()){
		            //Display values
		            System.out.print("ID: " + rs.getInt("ID"));
		            System.out.print(", Name: " + rs.getString("NAME"));
		            System.out.print(", Phone: " + rs.getLong("PHONE"));
		            System.out.print(", Address: " + rs.getString("ADDRESS"));
		            System.out.println("\n");
		         }
	   }
}
