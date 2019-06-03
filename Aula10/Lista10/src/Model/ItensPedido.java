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
    
    private int codigoItens;
    private int codigoProduto;
    private float qtdeItens;

    public int getCodigoItens() {
        return codigoItens;
    }

    public void setCodigoItens(int codigoItens) {
        this.codigoItens = codigoItens;
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
    
    
}
