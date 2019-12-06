package com.example.suzan.market.modelo;

import java.io.Serializable;

public class Produtos implements Serializable {

    private Long id;
    private String nomeProduto;
    private String valorProduto;


    @Override
    public String toString() {
        return nomeProduto+ "                "+valorProduto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(String valorProduto) {
        this.valorProduto = valorProduto;
    }
}
