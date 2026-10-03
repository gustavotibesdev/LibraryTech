package model;

public class Cliente extends Usuario {
    
    private String endereco;
    private String contato;

    public Cliente() {
    }
    
    public Cliente(String endereco, String contato, int idUsuario, String nome, String email, String senha, String permissao) {
        super(idUsuario, nome, email, senha, permissao);
        this.endereco = endereco;
        this.contato = contato;
    }
    
    public Cliente(String endereco, String contato, String nome, String email, String senha, String permissao) {
        super(nome, email, senha, permissao);
        this.endereco = endereco;
        this.contato = contato;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    
    
}
