/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author usuario.sp
 */
public class Venda {
    private int codigoPedido;
    private String nomeCliente;
    private String produtoVenda;
    private String totalVenda;

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getProdutoVenda() {
        return produtoVenda;
    }

    public void setProdutoVenda(String produtoVenda) {
        this.produtoVenda = produtoVenda;
    }

    public String getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(String totalVenda) {
        this.totalVenda = totalVenda;
    }

    public Venda() {
    }

    public Venda(int codigoPedido, String nomeCliente, String produtoVenda, String totalVenda) {
        this.codigoPedido = codigoPedido;
        this.nomeCliente = nomeCliente;
        this.produtoVenda = produtoVenda;
        this.totalVenda = totalVenda;
    }

    @Override
    public String toString() {
        return "Venda{" + "codigoPedido=" + codigoPedido + ", nomeCliente=" + nomeCliente + ", produtoVenda=" + produtoVenda + ", totalVenda=" + totalVenda + '}';
    }
    
    
    
}
