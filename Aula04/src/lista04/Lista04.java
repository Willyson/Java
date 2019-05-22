/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04;

import javax.swing.JOptionPane;

/**
 *
 * @author lab4aluno
 */
public class Lista04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para dobrar"));
//        JOptionPane.showMessageDialog(null,"O dobro de "+ valor + " é " + dobra(valor));
        
//        float[] notas = new float[4];
//        for(int i = 0; i < 4; i++){
//            notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Nota "+ (i+1)));
//        }
//        JOptionPane.showMessageDialog(null,"A média aritmética será " + mediaAritmetica(notas[0], notas[1],notas[2],notas[3]));
//        
        
//          float valor1 = Float.parseFloat(JOptionPane.showInputDialog("Digite primeiro valor"));
//          float valor2 = Float.parseFloat(JOptionPane.showInputDialog("Digite segundo valor"));
//        
//          JOptionPane.showMessageDialog(null, "O produto será " + produto(valor1, valor2));
          
          
//        float grau = Float.parseFloat(JOptionPane.showInputDialog("Graus"));
//        JOptionPane.showMessageDialog(null,grau + " correspondem a "+radianos(grau) +  " radianos.");
            
//          float num1 = Float.parseFloat(JOptionPane.showInputDialog("Número 1"));
//          float num2 = Float.parseFloat(JOptionPane.showInputDialog("Número 2"));
//          maiorNum(num1, num2);
//          
          
//           int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um mês"));
//           mes(mes);
        

             
//            int val = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
//            JOptionPane.showMessageDialog(null,fatorial(val));


        
           int val = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
           String saida = "";
           if(primo(val))
               saida = val + " é primo";
           else
               saida = val + " não é primo";
           
           JOptionPane.showMessageDialog(null,saida);
           
           




        
    }

    
    
    /*
        1)Criar um progrma que permita a entrada de um número inteiro e retorne  o seu dobro através de um metódo
    */
    private static int dobra(int v){
        return v + 1;
        //return v * 2;
    }
    
    /*
        2) Criar um programa que receba 4 notas e calcule a média aritmética, através de um método
    */
    
    private static float mediaAritmetica(float n1, float n2, float n3, float n4){
        return ((n1+n2+n3+n4)/4);
    }
    
    /*
        3)Criar um programa que receba 2 valores e calcue o produto através de um método que retorne valores
    */
   
    private static float produto(float v1, float v2){
        return v1*v2;
    }
    
    /*
        4)Criar um program que receba um grau e o vonverta para radianos através de um método
    */
    private static float radianos(float grau){
        return (float)(grau * Math.PI /180);
    }
    
    
    /*
        5)Criar um programa que mostre qual o maior valor entre dois números, utilizando um 
        método do tipo void 
    */
    
    private static void maiorNum(float num1, float num2){
        String  saida = (num1 >= num2) ? ""+ num1 : ""+ num2;
        JOptionPane.showMessageDialog(null,saida);
    } 
    
    /*
        6)Criar um programa que receba um número que corresponda a um mês do 1º trimestre
         e escreva o mês correspondente; caso o usuário digite o número fora do intervalo deverá 
         aparecer inválido, mas utilizando um método do tipo void.
    */
    
    private static void mes(int mes){
        String[] meses = new String[12];
        
        meses[0] = "Janeiro";
        meses[1] = "Fevereiro";
        meses[2] = "Março";
        meses[3] = "Abril";
        meses[4] = "Maio";
        meses[5] = "Junho";
        meses[6] = "Julho";
        meses[7] = "Agosto";
        meses[8] = "Setembro";
        meses[9] = "Outubro";
        meses[10] = "Novembro";
        meses[11] = "Dezembro";
        
        JOptionPane.showMessageDialog(null, "Mês : "+ meses[mes-1]);
        
    }
    
    /*
        7)Criar um programa que retorne o fatorial de um número, usando um método que 
        receba um valor e retorne o fatorial desse valor
    */
    
    private static int fatorial(int val){
        
             for(int i = val - 1; i > 0; i--){
                 val *= i;
             }
        return val;
    }
    
    
    /*
        8)Criar um programa que verifique se um número é primo ou não, através de um 
           método. Número primo é divisível somente por 1 e por ele mesmo.
    */
    
    private static boolean primo(int val){
        //2 [3] 4 5 6 7 8 9 10 11 12 [13]
        int negativo = 1;
       for(int i = 2; i < val; i++){
            if(val % i != 0){
                negativo++;
            }
        }
        return negativo == val - 1 || val == 2;
    }
    
}
