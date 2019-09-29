/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;

/**
 *
 * @author usuario.sp
 */
public class Faturar {
    private int numeroItem;
    private String descItem;
    private float qtdeItens;
    private float precoItem;

    public Faturar(int numeroItem, String descItem, float qtdeItens, float precoItem) {
        this.numeroItem = numeroItem;
        this.descItem = descItem;
        this.precoItem = precoItem;
        
        if(qtdeItens < 0)
            this.qtdeItens = 0;
        else 
            this.qtdeItens = qtdeItens;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescItem() {
        return descItem;
    }

    public void setDescItem(String descItem) {
        this.descItem = descItem;
    }

    public float getQtdeItens() {
        return qtdeItens;
    }

    public void setQtdeItens(float qtdeItens) {
        this.qtdeItens = qtdeItens;
    }

    public float getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(float precoItem) {
        this.precoItem = precoItem;
    }
    
    
    public double getFaturarTotal(){
        return this.qtdeItens * this.precoItem;
    }   
}
