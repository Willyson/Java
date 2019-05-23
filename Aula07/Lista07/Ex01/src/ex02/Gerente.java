/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02;

/**
 *
 * @author usuario.sp
 */
public class Gerente {
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void aumentoSalario(float taxa){
        
        setSalario(getSalario() +  (getSalario() * taxa / 100));
    }

    @Override
    public String toString() {
        
        return "Gerente{" + "salario=" + salario + '}';
    }
    
    
}
