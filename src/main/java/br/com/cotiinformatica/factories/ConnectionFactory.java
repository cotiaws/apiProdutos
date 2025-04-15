package br.com.cotiinformatica.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	/*
	 * Método para abrir conexão com o banco de dados
	 */
	public Connection getConnection() {
		try {
						
			var host = "jdbc:postgresql://servercoti.postgres.database.azure.com:5432/apiprodutos";
			var user = "useraula";
			var pass = "Coti@2025";
			
			return DriverManager.getConnection(host, user, pass);
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
