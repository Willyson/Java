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
public class ItensPedido {
    
    private int codigoPedido;
    private int codigoProduto;
    private float qtdeItens;

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public float getQtdeItens() {
        return qtdeItens;
    }

    public void setQtdeItens(float qtdeItens) {
        this.qtdeItens = qtdeItens;
    }

    public ItensPedido(int codigoPedido, int codigoProduto, float qtdeItens) {
        this.codigoPedido = codigoPedido;
        this.codigoProduto = codigoProduto;
        this.qtdeItens = qtdeItens;
    }

    public ItensPedido() {
    }

    @Override
    public String toString() {
        return "ItensPedido{" + "codigoPedido=" + codigoPedido + ", codigoProduto=" + codigoProduto + ", qtdeItens=" + qtdeItens + '}';
    }
    
    
    
}
