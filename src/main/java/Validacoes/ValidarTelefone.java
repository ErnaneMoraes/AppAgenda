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

public class ValidarTelefone {
    public static boolean validarTelefone(String telefone) {
        // Remova qualquer caractere que não seja número
        String numTelefone = telefone.replaceAll("\\s", "");
        if (numTelefone.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo telefone deve ser preenchido.");
            return false;
        } else if (numTelefone.length() != 10 && numTelefone.length() != 11) {
            JOptionPane.showMessageDialog(null, "Formato inválido. Insira um telefone no formato correto.");
            return false;
        } else if (!numTelefone.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "O telefone deve conter apenas números.");
            return false;
        }
        return true;
    }
    //----------------------------------------------------------------------
    
    private static JButton jbCadastrar; // Tornando o botão estático

    public ValidarTelefone(JButton jbCadastrar) {
        this.jbCadastrar = jbCadastrar;
    }
    
    public static boolean validarTelefone1(String telefone) {
        if (telefone == null || 
            telefone.isEmpty() ||
            !telefone.matches("\\d+") ||
            telefone.length() != 10 && telefone.length() != 11) {
            jbCadastrar.setEnabled(false);
            return false;
        }
        jbCadastrar.setEnabled(true);
        return true;
    }


    
}
