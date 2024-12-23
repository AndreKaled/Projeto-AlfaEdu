package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Database {
    private static final String URL_MYSQL = "jdbc:mysql://localhost:3306/teste";
	
	private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		
	private static final String USER = "root";
	
	private static final String PASS = "root";

	public static Connection getConnection() {
		System.out.println("Conectando ao Banco de Dados");
		try {
			Class.forName(DRIVER_CLASS);
			return DriverManager.getConnection(URL_MYSQL, USER, PASS);
		} catch (ClassNotFoundException e) {
		    JOptionPane.showMessageDialog(null, "Driver JDBC não encontrado!");
		    e.printStackTrace(); // Certifique-se de que o driver está no classpath
		} catch (SQLException e) {
		    JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + e.getMessage());
		    e.printStackTrace(); // Mostre detalhes do erro
		}
		return null;
	}
}
