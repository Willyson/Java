/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import javax.swing.JOptionPane;

/**
 *
 * @author Will
 */
public class Lista02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1º) Ler um valor e informar se ele é ou não múltiplo de 3
        */
//        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
//        
//        String saida = (valor % 3 == 0) ? "É multiplo de 3" : "Não é multiplo de 3";
//        
//        JOptionPane.showMessageDialog(null, saida);

        /*
        2º) Ler três números e mostrá-los em ordem crescente.
        */
        
//        int[] valor = new int[3];
//        
//        for(int i = 0; i < 3; i++){
//            valor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+ (i+1) +"º valor"));
//        }
//        
//        if(valor[0] < valor[1] && valor[0] < valor[2]){
//     
//            if(valor[1] < valor[2])JOptionPane.showMessageDialog(null,valor[0] + " " + valor[1] + " " + valor[2]);
//            else JOptionPane.showMessageDialog(null, valor[0] + " " + valor[2] + " " + valor[1]);
//            
//        }
//        else if(valor[1] < valor[0] && valor[1] < valor[2]){
//            if(valor[0] < valor[2]) JOptionPane.showMessageDialog(null, valor[1] + " " + valor[0] + " " + valor[2]);
//            else JOptionPane.showMessageDialog(null, valor[1] + " " + valor[2] + " " + valor[0]);
//        }
//        else if(valor[2] < valor[0] && valor[2] < valor[1]){
//            if(valor[0] < valor[1]) JOptionPane.showMessageDialog(null, valor[2] + " " + valor[0] + " " + valor[1]);
//            else JOptionPane.showMessageDialog(null, valor[2] + " " + valor[1] + " " + valor[0]);
//        }
//        else{
//            JOptionPane.showMessageDialog(null,"Valores iguais");
//        }

/*
3º) Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o
valor da compra for menor que R$20,00; caso contrário, o lucro será de 30%. Entrar
com o valor do produto e imprimir o valor da venda.
*/
//        float valorP = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da compra"));
//        
//        float valorTotal = (float) ((valorP > 20) ? (valorP + (valorP*0.3)) : (valorP + (valorP*0.45)));
//        
//        JOptionPane.showMessageDialog(null,"Valor de venda: R$"+valorTotal);



/*
4º) Ler a idade de uma pessoa e informar a sua classe eleitoral:
Não-eleitor (abaixo de 16 anos)
Eleitor obrigatório (entre 18 e 65 anos)
Eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)
*/

//    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
//    
//    if(idade >= 16 && idade < 18 || idade > 65) JOptionPane.showMessageDialog(null,"Eleitor Facultativo");
//    else if(idade >= 18 && idade <= 65)JOptionPane.showMessageDialog(null,"Eleitor obrigatório");
//    else JOptionPane.showMessageDialog(null,"Não eleitor");
//    
//

/*
5º) Depois da liberação do governo para as mensalidades dos planos de saúde, as
pessoas começaram a fazer pesquisas para descobrir um bom plano, não muito caro.
Um vendedor de um plano de saúde apresentou a tabela a seguir. Criar um programa
que entre com o nome e a idade de uma pessoa e mostre o valor que ela deverá pagar.
Até 10 anos – R$ 30,00
Acima de 10 até 29 anos – R$ 60,00
Acima de 29 até 45 anos – R$ 120,00
Acima de 45 até 59 anos – R$ 150,00
Acima de 59 até 65 anos – R$ 250,00
Maior que 65 anos – R$ 400,00

*/
//
//        String nome = JOptionPane.showInputDialog("Digite o nome");
//        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
//        if(idade < 10) JOptionPane.showMessageDialog(null,"O plano para "+ nome +" será de R$30,00");
//        else if(idade >= 10 && idade < 29) JOptionPane.showMessageDialog(null,"O plano para "+ nome + " será de R$60,00");
//        else if(idade >= 29 && idade < 45) JOptionPane.showMessageDialog(null,"O plano para "+ nome +" será de R$120,00");
//        else if(idade >= 45 && idade < 59) JOptionPane.showMessageDialog(null,"O plano para "+ nome +" será de R$150,00");
//        else if(idade >= 59 && idade < 65) JOptionPane.showMessageDialog(null,"O plano para "+ nome +" será de R$250,00");
//        else JOptionPane.showMessageDialog(null,"O plano para "+ nome +" será de R$400,00");
//        
//        

    }
    
}
