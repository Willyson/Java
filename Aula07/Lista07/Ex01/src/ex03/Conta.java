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
public class Conta {
    private int numero; 
    private float limite; 
    private float saldo; 

    public Conta(int numero, float limite) {
        this.numero = numero;
        this.limite = limite;
    }

        
    
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
        if((this.getSaldo() + this.getLimite()) >= valorSacado ){
            if(getSaldo() >= valorSacado){
                this.setSaldo(this.getSaldo() - valorSacado);
            }else{
                valorSacado -= this.getSaldo();
                this.setLimite(this.getLimite() - valorSacado);
            }
           
        }else{
            System.out.println("Não possui saldo e limite sufiente para o saldo");
        }
    }
    
    public void ExibirSaldo(){
        JOptionPane.showMessageDialog(null, "Saldo -> " + this.getSaldo() + "\n Limite -> " + this.getLimite());
    }
}
