/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario.sp
 */
public class testeConta {
    public static void main(String[] args) {
        
        int numeroUsuario   = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta"));
        float limiteUsuario = Float.parseFloat(JOptionPane.showInputDialog("Digite o limite da conta"));
        
        Conta c = new Conta(numeroUsuario, limiteUsuario);
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU \n [ 1 ] Depositar \n [ 2 ] Sacar \n[ 3 ] Exibir dados \n[ 4 ] Sair "));
            
            switch(opcao){
                case 1: 
                    
                    int valorDeposito = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de deposito"));
                    c.depositar(valorDeposito);
                    
                    break;
                    
                case 2: 
                    
                    float valorSaque = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de Saque"));
                    c.Sacar(valorSaque);
                    
                    break;
                case 3: 
                    c.ExibirSaldo();
                    break;
            }
        }while(opcao != 4);
    }
}
