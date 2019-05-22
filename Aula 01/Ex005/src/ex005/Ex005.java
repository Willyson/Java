/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex005;

import java.util.Scanner;

/**
 *
 * @author lab4aluno
 */
public class Ex005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Calcular  e apresentar o valor do volume de uma lata de óleo, 
        utilizando a fórmula:
        VOLUME = 3.14159 * R2 * ALTURA
         */ 
        
        Scanner leitor = new Scanner(System.in);
        
        float altura, raio;
        
        System.out.print("Digite a altura da lata: ");
        altura = leitor.nextFloat();
        System.out.print("Digite o raio da lata: ");
        raio = leitor.nextFloat();
        
        System.out.printf("VOLUME = %.2f", (Math.PI * Math.pow(raio, 2) * altura ));

    }
    
}
