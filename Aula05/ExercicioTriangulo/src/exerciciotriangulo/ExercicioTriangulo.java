/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciotriangulo;

import exerciciotriangulo.model.Triangulo;

/**
 *
 * @author lab4aluno
 */
public class ExercicioTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Triangulo t1 = new Triangulo();
        t1.calculaArea(t1.leituraTriangulo(t1));
        
    }
    
}
