package model;

public class Vendedores extends Usuario {
    private String categoria;
    private boolean possuiLoja;
    private String contato;

    public Vendedores(String categoria, boolean possuiLoja, String contato, int idUsuario, String nome, String email, String senha, String permissao) {
        super(idUsuario, nome, email, senha, permissao);
        this.categoria = categoria;
        this.possuiLoja = possuiLoja;
        this.contato = contato;
    }

    public Vendedores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void removerLivro() {};
    public void cadastrarLivro() {};
    public void atualizarLoja() {};
    
}
