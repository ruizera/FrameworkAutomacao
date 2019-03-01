package br.com.bancodedados;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.sql.SQLException;

import org.testng.annotations.Test;

import br.com.ruizera.conexaobanco.ConectorPostgreSQL;

public class testePostgreSQL {
	@Test
	public void validarConexaoPostgreComSucesso() throws ClassNotFoundException, SQLException {
		ConectorPostgreSQL conectorPostgre = new ConectorPostgreSQL("postgres", "postgres",
				"jdbc:postgresql://localhost:5432/postgres?currentSchema=framework_schema", "org.postgresql.Driver");
		assertNotNull(conectorPostgre.getConnection());
	}

	@Test
	public void validarFecharConexaoPostgreComSucesso() throws ClassNotFoundException, SQLException {
		ConectorPostgreSQL conectorPostgre = new ConectorPostgreSQL("postgres", "postgres",
				"jdbc:postgresql://localhost:5432/postgres?currentSchema=framework_schema", "org.postgresql.Driver");
		conectorPostgre.getConnection();
		conectorPostgre.closeConnection();
		assertTrue(conectorPostgre.getConnection().isClosed());
	}

}
