/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author William-Estudo
 * 
 */

public class Produto {
    private int codigoProduto; 
    private String descProduto;
    private float precoProduto;
    private float qtde;
    private String dataCadProduto;

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    
  

    public String getDataCadProduto() {
        return dataCadProduto;
    }

    public void setDataCadProduto(String dataCadProduto) {
        this.dataCadProduto = dataCadProduto;
    }

    public Produto(String descProduto, float precoProduto, float qtde) {
        this.descProduto = descProduto;
        this.precoProduto = precoProduto;
        this.qtde = qtde;
    }

    public Produto(int codigoProduto, String descProduto, float precoProduto, float qtde) {
        this.codigoProduto = codigoProduto;
        this.descProduto = descProduto;
        this.precoProduto = precoProduto;
        this.qtde = qtde;
    }

    public Produto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
    
    
    
    
}
