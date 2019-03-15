package br.com.bancodedados;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.sql.SQLException;

import org.testng.annotations.Test;

import br.com.ruizera.conexaobanco.ConectorH2;
import br.com.ruizera.conexaobanco.ConectorPostgreSQL;

public class testeH2 {
	@Test
	public void validarConexaoH2ComSucesso() throws ClassNotFoundException, SQLException {
		ConectorH2 conectorH2 = new ConectorH2("sa", "", "jdbc:h2:tcp://localhost/~/test", "org.h2.Driver");
		assertNotNull(conectorH2.getConnection());
	}

	@Test
	public void validarFecharConexaoH2ComSucesso() throws ClassNotFoundException, SQLException {
		ConectorH2 conectorH2 = new ConectorH2("sa", "", "jdbc:h2:tcp://localhost/~/test", "org.h2.Driver");
		conectorH2.getConnection();
		conectorH2.closeConnection();
		assertTrue(conectorH2.getConnection().isClosed());
	}

}
