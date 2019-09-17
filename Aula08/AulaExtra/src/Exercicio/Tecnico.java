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
public class Tecnico extends Superior{

    @Override
    public float CalculaMedia(Superior notas) {
        return (notas.getN1() + notas.getN2() * 2 + notas.getN3() * 2) / 5;
    }
    
    
    
}
