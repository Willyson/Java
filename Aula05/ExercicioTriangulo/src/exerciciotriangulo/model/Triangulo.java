/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciotriangulo.model;

import javax.swing.JOptionPane;

/**
 *1ª) Criar uma Classe chamada Triangulo que contenha como atributos a base e altura de um
        triângulo. Na classe definir um método para leitura da base e altura, um método construtor
        e um método para Calcular a área do triângulo (Area=Base * Altura)/2.
        No método principal do programa (main) , criar um objeto a partir da classe criada, solicitar
        e atribuir os valores da base e altura e invocar o método que calcula a área a partir do objeto
        criado.

 * @author lab4aluno
 */
public class Triangulo {
    
    private float base;
    private float altura;
    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Triangulo() {
    }

    
    
    public Triangulo leituraTriangulo(Triangulo t){
        
        float base = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da base"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de altura"));
        
        t.setBase(base);
        t.setAltura(altura);
        
        return t;
    }
    
    public void calculaArea(Triangulo t){
        //(Area=Base * Altura)/2.
        
        float area = (t.getBase() * t.getAltura()) /2 ;
        JOptionPane.showMessageDialog(null, "A área do triângulo é : " + area);
        
    }
    
}
