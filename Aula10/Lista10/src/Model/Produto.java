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
    private String uniProduto;
    private float qtdeInicialProduto;
    private String dataCadProduto;
    private float qtdAtualProduto;

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

    public String getUniProduto() {
        return uniProduto;
    }

    public void setUniProduto(String uniProduto) {
        this.uniProduto = uniProduto;
    }

    public float getQtdeInicialProduto() {
        return qtdeInicialProduto;
    }

    public void setQtdeInicialProduto(float qtdeInicialProduto) {
        this.qtdeInicialProduto = qtdeInicialProduto;
    }

    public String getDataCadProduto() {
        return dataCadProduto;
    }

    public void setDataCadProduto(String dataCadProduto) {
        this.dataCadProduto = dataCadProduto;
    }

    public float getQtdAtualProduto() {
        return qtdAtualProduto;
    }

    public void setQtdAtualProduto(float qtdAtualProduto) {
        this.qtdAtualProduto = qtdAtualProduto;
    }
    
    
}
