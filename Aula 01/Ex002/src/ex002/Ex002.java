/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex002;

import java.util.Scanner;

/**
 *
 * @author lab4aluno
 */
public class Ex002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Para vários tributos, a base de cálculo é o salário mínimo.  
        Fazer um programa que leia o valor do salário mínimo e o valor do salário
        de uma pessoa.  Calcular e mostrar quantos salaries mínimos ela ganha.
        
        */
        
        Scanner leitor = new Scanner(System.in);
        
        float salarioMin, valorSalario, qtdSalario;
        
        System.out.print("Digite o valor do salário minimo: ");
        salarioMin = leitor.nextFloat();
        
        System.out.print("Digite o valor do salário: ");
        valorSalario = leitor.nextFloat();
        
        System.out.printf("Quantidade de salários minimos: %f \n", (valorSalario/salarioMin));
        
    }
    
}
