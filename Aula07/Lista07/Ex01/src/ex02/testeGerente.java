/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario.sp
 */
public class testeGerente {
    public static void main(String [] args){
        
        Gerente g = new Gerente();
        
        float salarioAtual = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário atual do gerente"));
        
        float aumento = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de aumento"));
        
        g.setSalario(salarioAtual);
        
        g.aumentoSalario(aumento);
        
        JOptionPane.showMessageDialog(null, "Salário anterior: R$" + salarioAtual +
                "\n Salario Atual: R$" + g.getSalario());
        
    }
}
