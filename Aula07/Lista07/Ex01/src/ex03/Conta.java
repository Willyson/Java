/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

/**
 *
 * @author usuario.sp
 */
public class Conta {
    private int numero; 
    private float limite; 
    private float saldo; 

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    /*
        Ações: 
        Depositar, Sacar, Exibir Saldo
    */
    
    public void depositar(float deposito){
        setSaldo(deposito);
    }
    
    public void Sacar(float valorSacado){
        if(getSaldo() >= valorSacado){
            
        }
    }
    
}
