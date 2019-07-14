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
public class Cliente {
    
    private int codigoCliente;
    private String nomeCliente;
    private String enderecoCliente;
    private String bairroCliente;
    private String cidadeCliente;
    private String cepCliente;
    private String ufCliente;
    private String emailCliente;
    private String foneCliente;
    private String celularCliente;

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }

    public String getUfCliente() {
        return ufCliente;
    }

    public void setUfCliente(String ufCliente) {
        this.ufCliente = ufCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getFoneCliente() {
        return foneCliente;
    }

    public void setFoneCliente(String foneCliente) {
        this.foneCliente = foneCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public Cliente(String nomeCliente, String enderecoCliente, String bairroCliente, String cidadeCliente, String cepCliente, String ufCliente, String emailCliente, String foneCliente, String celularCliente) {
        
        this.nomeCliente = nomeCliente;
        this.enderecoCliente = enderecoCliente;
        this.bairroCliente = bairroCliente;
        this.cidadeCliente = cidadeCliente;
        this.cepCliente = cepCliente;
        this.ufCliente = ufCliente;
        this.emailCliente = emailCliente;
        this.foneCliente = foneCliente;
        this.celularCliente = celularCliente;
    }

    public Cliente() {
    }

    public Cliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
    

    @Override
    public String toString() {
        return "Cliente{" + "codigoCliente=" + codigoCliente + ", nomeCliente=" + nomeCliente + ", enderecoCliente=" + enderecoCliente + ", bairroCliente=" + bairroCliente + ", cidadeCliente=" + cidadeCliente + ", cepCliente=" + cepCliente + ", ufCliente=" + ufCliente + ", emailCliente=" + emailCliente + ", foneCliente=" + foneCliente + ", celularCliente=" + celularCliente + '}';
    }
    
    
    
 
   
    
    
}
