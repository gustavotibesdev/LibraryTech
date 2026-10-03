    package model;

public class Venda {
    private int idVenda;
    private int idLivro;
    private int idCliente;
    private int idVendedor;
    private String data;
    private double valor;
    private String status;

    public Venda() {
    }

    public Venda(int idVenda, int idLivro, int idCliente, int idVendedor, String data, double valor, String status) {
        this.idVenda = idVenda;
        this.idLivro = idLivro;
        this.idCliente = idCliente;
        this.idVendedor = idVendedor;
        this.data = data;
        this.valor = valor;
        this.status = status;
    }

    public int getIdVenda() {
        return idVenda;
    }
    
    public int getIdLivro() {
        return idLivro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public String getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public void setVenda(int idVenda) {
        this.idVenda = idVenda;
    }
    
    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
