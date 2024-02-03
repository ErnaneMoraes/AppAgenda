/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validacoes;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Ernane
 */

public class ValidarEmail {

    
    public static boolean validarEmail(String email) {
        if (email == null || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo email deve ser preenchido.");
            return false;
        } else if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z.-]+\\.[A-Za-z]{2,}$")) {
            JOptionPane.showMessageDialog(null, "Formato inválido. Insira um email no formato correto.");
            return false;
        }
        return true;
    }
    
    //-----------------------------------------------------------------------------------
    
    
    private static JButton jbCadastrar; // Tornando o botão estático

    public ValidarEmail(JButton jbCadastrar) {
        this.jbCadastrar = jbCadastrar;
    }
    
    public static boolean validarEmail1(String email) {
        if (email == null || email.isEmpty() || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z.-]+\\.[A-Za-z]{2,}$")) {
            jbCadastrar.setEnabled(false);
            return false;
        }
        jbCadastrar.setEnabled(true);
        return true;
    }
    
}

