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
    
    private int codigoPedito;
    private int codigoCliente;
    private String dataPedido;

    public int getCodigoPedito() {
        return codigoPedito;
    }

    public void setCodigoPedito(int codigoPedito) {
        this.codigoPedito = codigoPedito;
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

    public Pedidos(int codigoPedito, int codigoCliente) {
        this.codigoPedito = codigoPedito;
        this.codigoCliente = codigoCliente;
    }
    
    
}
