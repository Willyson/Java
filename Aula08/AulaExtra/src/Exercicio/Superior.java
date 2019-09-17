/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio;

/**
 *
 * @author usuario.sp
 */
public class Superior {
    
    private float n1; 
    private float n2; 
    private float n3; 

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }
    
    public float CalculaMedia(Superior notas){
        return (float) (notas.getN1() * 0.35 + notas.getN2() * 0.5 + notas.getN3() * 0.15);
    }

    public Superior() {
    }

    @Override
    public String toString() {
        return "Superior{" + "n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + '}';
    }
    
    
    
    
}
