/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisvendas;

/**
 *
 * @author Usuáro
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao implements IConst {
   public static Connection getConexao(String stringDeConexao, String usuario, String senha) {
    try {
	  return DriverManager.getConnection(stringDeConexao, usuario, senha);
    } catch (SQLException e) {		
        throw new RuntimeException(e);
      } 
  }
}
