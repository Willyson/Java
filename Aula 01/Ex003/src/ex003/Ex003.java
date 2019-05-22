/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex003;

import java.util.Scanner;

/**
 *
 * @author lab4aluno
 */
public class Ex003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um programa que leia dois valores e informe a média 
          entre eles. (use float comotipo de dado).
         */
        Scanner leitor = new Scanner(System.in);
        
        float v1, v2; 
        System.out.print("Digite o 1º valor: ");
        v1 = leitor.nextFloat();
        System.out.print("Digite o 2º valor: ");
        v2 = leitor.nextFloat();
        
        System.out.printf("A média é : %.2f \n", (v1+v2)/2);
        
    }
    
}
