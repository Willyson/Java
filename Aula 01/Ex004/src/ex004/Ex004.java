/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex004;

import java.util.Scanner;

/**
 *
 * @author lab4aluno
 */
public class Ex004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um programa que leia  uma temperatura em graus Centígrados 
                e apresente-a convertida em graus Fahrenheit.  A fórmula de conversão é: 
        //F = (9 * C + 160) / 5, onde F é a temperatura em Fahrenheit e C em graus 
                Centígrados.
        */
        
        Scanner leitor = new Scanner(System.in);
        float C, F;
        System.out.print("Digite a temperatura em Centígrados: ");
        C = leitor.nextFloat();
        
        F = (9 * C + 160) / 5;
        
        System.out.print("Temperatura em Fahrenheit: " + F + "ºF\n");
        
    }
    
}
