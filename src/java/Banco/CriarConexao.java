package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriarConexao {

    public static Connection getConexao() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Conectando ao Banco com Sucesso");
            return DriverManager.getConnection("jdbc:postgresql:portfoliobd", "postgres", "123456");

        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }

}
