package com.projetohibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private Connection conexao;

	public boolean conectar() throws ClassNotFoundException {

		Class.forName("org.sqlite.JDBC");

		String jdbcUrl = "jdbc:sqlite:C:/Users/avaleriano/eclipse-workspace/ProjetoSQLite/src/banco_de_dados/banco_sqlite_db";
		try {

			// abre a biblioteca do sdqlite
			Class.forName("org.sqlite.JDBC");
			// url de conexão
			String url = "jdbc:sqlite:C:/Users/avaleriano/eclipse-workspace/ProjetoSQLite/src/banco_de_dados/banco_sqlite_db";
			// conectar
			this.conexao = DriverManager.getConnection(url);

		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
			return false;
		}
		return true;
	}

}
