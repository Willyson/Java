package com.example.suzan.market.modelo;

import java.io.Serializable;

public class Cliente implements Serializable {

    private Long id;
    private String nomeCliente;
    private String cpfCliente;
    private String enderecoCliente;



    @Override
    public String toString() {
        return nomeCliente + "  cpf:  "+cpfCliente+"  end:  "+enderecoCliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }


}





