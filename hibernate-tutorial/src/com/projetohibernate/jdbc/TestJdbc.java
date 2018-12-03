package com.projetohibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TestJdbc {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		Conexao conn = new Conexao();
		conn.conectar();
		
	}

}
