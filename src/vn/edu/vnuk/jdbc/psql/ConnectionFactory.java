package vn.edu.vnuk.jdbc.psql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	public Connection getConnection () {
		try { 
			return DriverManager.getConnection(
				"jdbc:postgresql://Localhost/Giang",
				"Giang",
				"1234"
				);
		}
		catch (SQLException e) { throw new RuntimeException(e);
		}
	}
}