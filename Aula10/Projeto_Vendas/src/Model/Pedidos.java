/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author William-Estudo
 */
public class Pedidos {
    
    private int codigoPedido;
    private int codigoCliente;
    private String dataPedido;

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Pedidos(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Pedidos() {
    }

    public Pedidos(int codigoPedido, int codigoCliente) {
        this.codigoPedido = codigoPedido;
        this.codigoCliente = codigoCliente;
    }
    
    
}
