package model;

public class Livro {
    private int idLivro;
    private String titulo;
    private String genero;
    private String autor;
    private int ano;

    public Livro() {
    }

    public Livro(int idLivro, String titulo, String genero, String autor, int ano) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.ano = ano;
    }
    
    public Livro(String titulo, String genero, String autor, int ano) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.ano = ano;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
      
}
