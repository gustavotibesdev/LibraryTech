package librarytechh;

import view.TelaLogin;
import model.ConexaoDB;

public class LibraryTechh {
    public static void main(String[] args) {
       
        ConexaoDB.conectaDB();
        
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        
    }
}
