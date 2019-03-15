package br.com.ruizera.conexaobanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class ConectorBanco {
	String JDBC_DRIVER;
	// org.postgresql.Driver
	String DB_URL;
	// jdbc:postgresql://localhost:5432/postgres?currentSchema=framework_schema
	String USER;
	String PASS;
	Connection conn = null;
	Statement stmt = null;

	public ConectorBanco(String user, String pass, String db_url, String JDBC_Driver) {
		this.JDBC_DRIVER = JDBC_Driver;
		this.USER = user;
		this.PASS = pass;
		this.DB_URL = db_url;
	}

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		if (conn == null) {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		}
		return conn;
	}

	public void closeConnection() throws SQLException {
		conn.close();
	}
}
