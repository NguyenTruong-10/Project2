package com.team1.qlhv.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static Connection getConnection(){
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlhs","root","");
			return connection;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args){
		Connection connection = getConnection();
		System.out.println(connection.toString());
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
