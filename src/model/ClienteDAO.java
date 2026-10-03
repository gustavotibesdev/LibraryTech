package model;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClienteDAO {
    
    public static void cadastrarCliente(Cliente c) {
    
        try {
            
            ConexaoDB.conectaDB();
            
            String sql;
            sql = "INSERT INTO cliente(nome,email,senha,permissao,endereco,contato) VALUES (?,?,?,?,?,?);";
            
            PreparedStatement stmt = ConexaoDB.getCon().prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getSenha());
            stmt.setString(4, c.getPermissao());
            stmt.setString(5, c.getEndereco());
            stmt.setString(6, c.getContato());
                    
            stmt.execute();
            
            ConexaoDB.desconectarDB();
            
        }
        catch(SQLException sqle) {}
        
    }
    
}
