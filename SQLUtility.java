package com.xworkz.jdbc.practical;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class SQLUtility {
		
		public static Connection createConnection() {
					try {
		Connection connection = DriverManager.getConnection(SQLConstants.url, SQLConstants.username,SQLConstants.password);
							return connection;
			    } 
			catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}

		public static void closeConnection(Connection connection) {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}