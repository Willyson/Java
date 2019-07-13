/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import DAO.daoUsuario;
import Model.Usuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author William-Estudo
 */
public class ClasseTeste {
    public static void main(String[] args) throws SQLException {
        
        daoUsuario daoUser = new daoUsuario();
        
        /* Valida login */
        
        
        Usuario u = new Usuario("adm", "1234");
        
        JOptionPane.showMessageDialog(null, "Seja Bem-vindo " + daoUser.ValidaLogin(u).getNomeUsuario());
        
        
  
        
        
        
    }
}
