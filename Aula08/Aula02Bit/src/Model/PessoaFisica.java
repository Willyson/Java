/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author usuario.sp
 */
public class PessoaFisica extends Pessoa {
    
    private String rg; 
    private String cpf; 
    private String genero;

    
    
    public PessoaFisica(String idPessoa, String nomePessoa, Date DtNasc, String rg, String cpf, String genero) {
        super(idPessoa, nomePessoa, DtNasc);
        this.rg = rg;
        this.cpf = cpf;
        this.genero = genero;
    }
    
    
}
