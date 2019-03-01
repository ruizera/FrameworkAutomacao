package br.com.bancodedados;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.sql.SQLException;

import org.testng.annotations.Test;

import br.com.ruizera.conexaobanco.ConectorMySQL;

public class testeMySQL {
	@Test
	public void validarConexaoMySqlComSucesso() throws ClassNotFoundException, SQLException {
		ConectorMySQL conectorMySql = new ConectorMySQL("root", "1234",
				"jdbc:mysql://127.0.0.1:3306", "com.mysql.cj.jdbc.Driver");
		assertNotNull(conectorMySql.getConnection());
	}

	@Test
	public void validarFecharConexaoMySqlComSucesso() throws ClassNotFoundException, SQLException {
		ConectorMySQL conectorMySql = new ConectorMySQL("root", "1234",
				"jdbc:mysql://127.0.0.1:3306", "com.mysql.cj.jdbc.Driver");
		conectorMySql.getConnection();
		conectorMySql.closeConnection();
		assertTrue(conectorMySql.getConnection().isClosed());
	}

}
