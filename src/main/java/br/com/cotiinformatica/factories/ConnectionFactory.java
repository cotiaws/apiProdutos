package br.com.cotiinformatica.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	/*
	 * Método para abrir conexão com o banco de dados
	 */
	public Connection getConnection() {
		try {
						
			var host = "jdbc:postgresql://postgres:5432/apiprodutos";
			var user = "admin";
			var pass = "admin123";
			
			return DriverManager.getConnection(host, user, pass);
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
