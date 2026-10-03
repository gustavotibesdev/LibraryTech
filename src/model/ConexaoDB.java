package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    
    private static Connection con;
    private static final String usuario = "root";
    private static final String senha ="1234";
    private static final String url = "jdbc:mysql://localhost:3306/librarytech";;
    
    public static void conectaDB() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,usuario,senha);
        }
        catch (ClassNotFoundException cnfe){  
        }
        catch(SQLException sqle) {   
        }
        
    }
    
    public static void desconectarDB() {
        
        try {
            if (!con.isClosed() && con!=null) {
                con.close();
            }
        }
        catch (SQLException sqle) {  
        }
        
    }

    public static Connection getCon() {
        return con;
    }
   
}
