/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

import javax.swing.JOptionPane;

/**
 *
 * @author Will
 */
public class Lista03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        /*
        1) Um programa capaz de imprimir todos os números pares em um intervalo de
        números informador pelo usuário;
        
        */
        
        int ini = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de inicio"));
        int fin = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de término"));
        String saida = "";
        
        for(int i = ini; i <= fin; i++){
            saida += (i % 2 == 0) ? " " + i : "";
        }
        JOptionPane.showMessageDialog(null, saida);


/*
2) Um programa que imprima até o “n” termo a seqüência de Fibonacci. Série:
0,1,1,2,3,5,8,13,21.......
Por exemplo, imprimir até o 6º termo: 1, 1, 2, 3, 5, 8


*/
//        int fin = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de término"));
//        int n1 = 0, n2 = 1;
//        
//      
//        
//        for(int i = 1; i < fin; i++){
//            
//             System.out.print(n1 + " ");
//            int n3 = n1 + n2;
//            n1 = n2;
//            n2 = n3;
//            
//          
//          
//        }


//        3) Um programa capaz de imprimir todos os números primos em um intervalo de
//números informado pelo usuário;

//        int ini = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de inicio"));
//        int fin = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de término"));
//        
//        int[] vet = new int[fin];
//        
//        for(int i = 2; i < (fin); i++){
//            vet[i] = i;
//        }
//        
//        for(int i = 2; i < (fin); i++){
//            for(int x = 3; x < fin; x++){
//                if(vet[i] % vet[x] == 0){
//                    vet[i] = -1;
//                }
//            }
//        }
////        
//        
//        for(int i = 2; i < fin; i++){
//            System.out.println(vet[i]);
//        }
//        
//        

     
    }
    
 
}
