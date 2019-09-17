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
public class AulaTeste {
    public static void main(String[] args) {
        Date novaData = new Date();
        
        ArrayList<PessoaFisica> donos = new ArrayList<PessoaFisica>();
        
        PessoaFisica dono = new PessoaFisica("1", "Nome", novaData, "1234", "4651888", "Omi");
        
        donos.add(dono);
        
        //Pessoa Juridica 
        
        PessoaJuridica empresa = new PessoaJuridica("12343323445", "Blito Gomes", dono);
        
    }
}
