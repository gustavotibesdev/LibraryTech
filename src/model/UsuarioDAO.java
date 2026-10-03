package model;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
        public static Usuario autentificarUsuario(Usuario u) {
        
        try {
        
            ConexaoDB.conectaDB();
            
            String sql;
            sql = "SELECT email,nome,permissao FROM cliente WHERE email = ? AND senha = ? "
                    + "UNION SELECT email,nome,permissao FROM admin WHERE email = ? AND senha = ? "
                    + "UNION SELECT email,nome,permissao FROM vendedor WHERE email = ? AND senha = ?";
            
            PreparedStatement stmt = ConexaoDB.getCon().prepareStatement(sql);
            stmt.setString(1, u.getEmail());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, u.getEmail());
            stmt.setString(4, u.getSenha());
            stmt.setString(5, u.getEmail());
            stmt.setString(6, u.getSenha());
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                String permissao = rs.getString("permissao");
                u.setPermissao(permissao);
                
                return u;
                
            }
            
            ConexaoDB.desconectarDB();
            
        }
        catch (SQLException sqle) {System.out.println(sqle);}
            return null;
        

    }
}
