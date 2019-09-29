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
public class testaFaturar {
    public static void main(String[] args) {
        
        Faturar f = new Faturar(1, "Item 1", 10, 3);
        
        System.out.println(f.getFaturarTotal());
        
        
        Faturar f2 = new Faturar(2, "Item 2", -10, 10);
        
        System.out.println(f2.getQtdeItens());
    }
   
}
