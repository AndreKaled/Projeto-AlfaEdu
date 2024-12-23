package database;

/**
 * Andre Kaled Duarte Coutinho - 21/12/2024
 * 
 * Classe responsavel pela conexao com o Banco de dados
 * Dispoe de alguns metodos estaticos que trabalham com
 * o Banco de dados criado atualmente */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GenericDAO {
	static Connection conexao;

	public GenericDAO() {
		this.conexao = Database.getConnection();
	}

	public static Connection getConnection() {
		return conexao;
	}

	public int save(String insertSql, Object... parametros) throws SQLException {
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    int idGerado = -1;

	    try {
	        pstmt = getConnection().prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);

	        for (int i = 0; i < parametros.length; i++) {
	            pstmt.setObject(i + 1, parametros[i]);
	        }

	        pstmt.execute();

	        rs = pstmt.getGeneratedKeys();
	        if (rs.next()) {
	            idGerado = rs.getInt(1);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    } finally {
	        if (rs != null) {
	            try {
	                rs.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        if (pstmt != null) {
	            try {
	                pstmt.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	    return idGerado;
	}


	public void update(String updateSql, Object id, Object... parametros) throws SQLException {
		PreparedStatement pstmt = getConnection().prepareStatement(updateSql);

		for (int i = 0; i < parametros.length; i++) {
			pstmt.setObject(i + 1, parametros[i]);
		}
		pstmt.setObject(parametros.length + 1, id);
		pstmt.execute();
		pstmt.close();
		conexao.close();
	}

	public void delete(String deleteSql, Object... parametros) throws SQLException {
		PreparedStatement pstmt = getConnection().prepareStatement(deleteSql);

		for (int i = 0; i < parametros.length; i++) {
			pstmt.setObject(i + 1, parametros[i]);
		}

		pstmt.execute();
		pstmt.close();
		conexao.close();
	}
}