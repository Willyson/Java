/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex001;

import java.util.Scanner;

/**
 *
 * @author lab4aluno
 */
public class Ex001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Em época de pouco dinheiro, os comerciantes estão procurando aumentar 
        suas vendas oferecendo desconto.  Faça um programa que possa entrar com o 
        nome de um produto e seu  valor unitário e calcular e exibir  um novo valor
        com um desconto de 9%.
        
        */
        
        // Declaração da Scanner
        Scanner leitor = new Scanner(System.in);
        
        String nomeProduto; 
        float valorUnitarioProd, valorDescontado; 
        
        System.out.print("Digite o nome do Produto:");
        nomeProduto = leitor.next();
        
        System.out.print("Digite o valor unitário do produto " + nomeProduto + ":");
        valorUnitarioProd = leitor.nextFloat();
        
        valorDescontado = (float)(valorUnitarioProd * 0.91);


        System.out.print("DADOS DO PRODUTO \n "
                + "\nNome do produto.....: " + nomeProduto + ""
                + "\nValor unitário......: " + valorUnitarioProd
                + "\nDesconto............: 9%"
                + "\nProduto com Desconto: R$" + valorDescontado + "\n\n");
    }
    
}
