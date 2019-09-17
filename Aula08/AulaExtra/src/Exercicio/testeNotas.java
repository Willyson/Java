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
        s.setN2(3);
        s.setN3(8);
        
        System.out.println(s.CalculaMedia(s));
        
        
        Tecnico t = new Tecnico();
        
        t.setN1(10);
        t.setN2(3);
        t.setN3(8);
        
        System.out.println(t.CalculaMedia(t));
        
    }
}
