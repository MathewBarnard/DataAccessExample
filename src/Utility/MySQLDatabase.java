package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDatabase {

	public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	public static final String DB_URL 		= "jdbc:mysql://localhost/mydb";
	
	public static final String USER = "root";
	public static final String PASS = "netbuilder";
	
	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void closeConnection(Connection conn) {
		
		try {
			conn.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
