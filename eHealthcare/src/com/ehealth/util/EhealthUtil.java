package com.ehealth.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EhealthUtil {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("while loading the Driver we get" + e.getMessage());
		}
	}
	public static Connection getMySqlConnection() throws SQLException {
		// Step 2: Establish the connection.
		final String url = "jdbc:mysql://localhost:3306/EHealthcare";
		return DriverManager.getConnection(url, "root", "Pr@tiksha123");
	}
}
