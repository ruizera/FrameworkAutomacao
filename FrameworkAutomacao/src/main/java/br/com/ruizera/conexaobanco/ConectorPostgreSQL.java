package br.com.ruizera.conexaobanco;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConectorPostgreSQL extends ConectorBanco{

	public ConectorPostgreSQL(String user, String pass, String db_url, String JDBC_Driver) {
		super(user, pass, db_url, JDBC_Driver);
	}

}