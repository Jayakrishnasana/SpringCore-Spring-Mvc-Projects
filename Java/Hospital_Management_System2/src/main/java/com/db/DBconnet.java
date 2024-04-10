package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnet {
	private static Connection conn;
	
	public static Connection getcon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital2","root","root");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
		
	}
	

}
