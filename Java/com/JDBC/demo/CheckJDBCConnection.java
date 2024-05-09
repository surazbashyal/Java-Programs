package com.JDBC.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class CheckJDBCConnection {
	static Connection con;
public static Connection getConnection() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/BKC","root","");
	if(con!=null)
	{
		System.out.println("Connection Successful");
	}
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	return con;
}

}
