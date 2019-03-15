package br.com.ruizera.conexaobanco;

public class ConectorH2 extends ConectorBanco{

	public ConectorH2(String user, String pass, String db_url, String JDBC_Driver) {
		super(user, pass, db_url, JDBC_Driver);
	}

}
