/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author usuario.sp
 */
public class PessoaJuridica extends PessoaFisica {
    
    private String cnpj;
    private String nomeFantasia;
    private ArrayList<PessoaFisica> socios;

    public PessoaJuridica(String cnpj, String nomeFantasia, String idPessoa, String nomePessoa, Date DtNasc, String rg, String cpf, String genero) {
        super(idPessoa, nomePessoa, DtNasc, rg, cpf, genero);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }
    
    
    
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    
    @Override
    public String toString() {
        return "PessoaJuridica{" + "cnpj=" + cnpj + ", nomeFantasia=" + nomeFantasia + ", socios=" + socios + '}';
    }
    
    
    
}
