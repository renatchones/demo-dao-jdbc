package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
	
	//CONECTA COM O BANCO DE DADOS
	private static Connection conn = null;
	
	public static Connection getConnection() {
		if (conn == null) {
			try {
			Properties props = loadProperties();
			String url = props.getProperty("dburl");
			conn = DriverManager.getConnection(url, props);
			}
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		
		return conn;
		
	}
	
	
	
	//CARREGA AS INFORMAÇÕES DO ARQUIVO DB.PROPERTIES
	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}

	}
	
	//FECHA CONEXÃO COM BANCO DE DADOS
	public static void closeConnection() {
		if (conn != null) {
			
			try {
			conn.close();
			}
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		
		
	}
	
	

}
