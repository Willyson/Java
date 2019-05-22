/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioequacao.model;

import javax.swing.JOptionPane;

/**
 *
 * @author lab4aluno
 */
public class Equacao {
    
    private float A,B,C;

    public Equacao() {
    }

    public float getA() {
        return A;
    }

    public void setA(float A) {
        this.A = A;
    }

    public float getB() {
        return B;
    }

    public void setB(float B) {
        this.B = B;
    }

    public float getC() {
        return C;
    }

    public void setC(float C) {
        this.C = C;
    }
    
    public Equacao Leitura(Equacao eq){
        
        eq.setA(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor A:")));
        eq.setB(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor B:")));
        eq.setC(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor C:")));
        
        return eq;
    }
    
    public void Calcula(Equacao eq){
        float R1 = 0, R2 = 0, D;
        
        D = (float) Math.pow(eq.getB(), 2) - 4 * (eq.getA() * eq.getC());
        System.out.println(D);
        if(D == 0){
            R1 = (float) (- eq.getB() + (Math.sqrt(D) / (2 * eq.getA())));
            JOptionPane.showMessageDialog(null,"Raízes iguais: " + R1);
        }
            
        else if(D > 0){
            R1 = (float) (- eq.getB() + (Math.sqrt(D) / (2 * eq.getA())));
            R2 = (float) (- eq.getB() - (Math.sqrt(D) / (2 * eq.getA())));
            JOptionPane.showMessageDialog(null,"Raízes diferentes \n"
                    + "\nRaiz 1: " + R1
                    + "\nRaiz 2: " + R2);
        }else
            JOptionPane.showMessageDialog(null,"Não existem raízes");
        
        
            
            
        
    }
    
}
