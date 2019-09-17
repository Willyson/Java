/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio;

/**
 *
 * @author usuario.sp
 */
public class testeNotas {
    public static void main(String[] args) {
        
        Superior s = new Superior();
        
        s.setN1(10);
        s.setN2(10);
        s.setN3(10);
        
        System.out.println(s.CalculaMedia(s));
        
        
    }
}
