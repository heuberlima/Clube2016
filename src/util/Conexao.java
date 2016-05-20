/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

/**
 *
 * @author Heuber
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static Connection conexao;

    public static Connection getConexao() {
        
        try {
            if (conexao == null || conexao.isClosed()) {
                conexao = conectar();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        return conexao;
    }
    
    private static Connection conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost/clubeueg2016", "postgres", "123456");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado no CLASSPATH");
            return null;
        } catch (SQLException e) {
            System.out.println("Erro na conexao com o banco verifique a url, o usuário e a senha");
            return null;
        }
        
    }

}

