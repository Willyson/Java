/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario.sp
 */
public class testaFuncionario {
    
    public static void main(String [] args){
        Funcionario f = new Funcionario();
        
        String nome = JOptionPane.showInputDialog("Digite o nome do funcionario");
        int salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o salário do funcionário"));
        
        f.setNomeFun(nome);
        f.setSalFun(salario);
        
        JOptionPane.showMessageDialog(null, "Nome -> " + f.getNomeFun() + "\n"
                + "Salário -> " + f.getSalFun());
        
        float novoSalario = Float.parseFloat(JOptionPane.showInputDialog("Digite a porcentagem de aumento"));
        
        f.aumentaSalario(novoSalario);
        
        
        JOptionPane.showMessageDialog(null, f.toString());
        
    }
    
}
