package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SpringLayout;

public class LivroDAO {
    
    public static void cadastrarLivro(Livro l) {
        
        try {
            
            ConexaoDB.conectaDB();
            
            String sql;
            sql = "INSERT INTO livro(titulo,genero,autor,ano) VALUES (?,?,?,?);";
    
            Connection con = ConexaoDB.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, l.getTitulo());
            stmt.setString(2, l.getGenero());
            stmt.setString(3, l.getAutor());
            stmt.setInt(4, l.getAno());
            
            stmt.execute();
                 
            ConexaoDB.desconectarDB();
            
        }
        catch (SQLException sqle) {}
        
    }
    
    public static List<Livro> mostrarLivros() {
        
        List<Livro> livros = new ArrayList<>();
        
        try {
            ConexaoDB.conectaDB();
            
            String sql = "SELECT * FROM livro;";
            
            PreparedStatement stmt = ConexaoDB.getCon().prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                int idLivro = rs.getInt("idLivro");
                String titulo = rs.getString("titulo");
                String genero = rs.getString("genero");
                String autor = rs.getString("autor");
                int ano = rs.getInt("ano");
                
                Livro l = new Livro(idLivro,titulo,genero,autor,ano);
                livros.add(l);
            }
            
            ConexaoDB.desconectarDB();
            
            return livros;
                    
        }
        catch (SQLException sqle) {}
        
        return null;  
        
    }
    
    public static List<Livro> filtrarLivros(String autorf) {
        
        List<Livro> livros = new ArrayList<>();
        
        try {
            ConexaoDB.conectaDB();
            
            String sql = "SELECT idLivro,titulo,genero,autor,ano FROM livro WHERE autor = ?;";
            
            PreparedStatement stmt = ConexaoDB.getCon().prepareStatement(sql);
            
            stmt.setString(1, autorf);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                int idLivro = rs.getInt("idLivro");
                String titulo = rs.getString("titulo");
                String genero = rs.getString("genero");
                String autor = rs.getString("autor");
                int ano = rs.getInt("ano");
                
                Livro l = new Livro(idLivro,titulo,genero,autor,ano);
                livros.add(l);
            }
            
            ConexaoDB.desconectarDB();
            
            return livros;
                    
        }
        catch (SQLException sqle) {}
        
        return null;  
        
    }
    
    public static void excluirLivro(int id) {
        
        try {
            
            ConexaoDB.conectaDB();
            
            String sql;
            sql = "DELETE FROM livro WHERE idLivro = ?";
            
            PreparedStatement stmt = ConexaoDB.getCon().prepareStatement(sql);
            stmt.setInt(1, id);
            
            stmt.execute();
            
            ConexaoDB.desconectarDB();
            
        }
        catch (SQLException sqle) {System.out.println(sqle);}
        
    }
    
}
