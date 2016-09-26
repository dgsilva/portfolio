package dao;

import Modelo.portfolio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Diego Bizerra
 */
public class Banco {

    private Connection conexao;
    
    public Banco()throws SQLException{
        this.conexao=CriaConexao.getConexao();
    }
    
    public void CadastrarCliente(portfolio p)throws SQLException{
        String sql="INSERT INTO portfolio(nome,endereco,email,cidade,empresa,mensagem)"+
                "values(?,?,?,?,?,?)";
        PreparedStatement stmt= this.conexao.prepareStatement(sql);
        stmt.setString(1,p.getNome());
        stmt.setString(2,p.getEndereco());
        stmt.setString(3,p.getEmail());
        stmt.setString(4,p.getCidade());
        stmt.setString(5,p.getEmpresa());
        stmt.setString(6,p.getMensagem());
        stmt.execute();
        stmt.close();
    }
    
}
