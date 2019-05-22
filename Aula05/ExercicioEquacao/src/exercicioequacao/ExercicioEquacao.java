/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

    2ª) Criar uma Classe chamada Equacao que contenha como atributos 3 valores inteiros, A,
    B e C. Na classe definir um método para leitura dos valores, um método construtor e um,
    método para calcular as raízes da equação.
    R1 = -b+ (raiz de delta) / (2*a)
    R2 = -b-(raiz de delta) / (2*a)
    Considerar que:
    - Se delta = 0, as raízes são iguais;
    - Se delta <0, não existem raízes reais;
    - Se delta >=, existem 2 raízes diferentes
    No método principal do programa (main) , criar um objeto a partir da classe criada, solicitar
    e atribuir os valores e invocar o método que calcula as raízes a partir do objeto criado.
*/
package exercicioequacao;

import exercicioequacao.model.Equacao;

/**
 *
 * @author lab4aluno
 */
public class ExercicioEquacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Equacao e = new Equacao();
        e.Calcula(e.Leitura(e));
        
    }
    
}
