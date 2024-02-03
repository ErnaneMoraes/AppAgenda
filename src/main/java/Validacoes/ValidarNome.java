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
public class ValidarNome {
    public static boolean validarNome(String nome) {        
        if (nome == null || nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo nome deve ser preenchido.");
            return false;
        } else if (!nome.matches("^[a-zA-Z ]*$")) {
            JOptionPane.showMessageDialog(null, "O campo nome não pode conter caracteres especiais.");
            return false;
        }  
        return true;
    }  
    
    //-----------------------------------------------------------------------------------
    
    private static JButton jbCadastrar; // Tornando o botão estático

    public ValidarNome(JButton jbCadastrar) {
        this.jbCadastrar = jbCadastrar;
    }
    
    public static boolean validarNome1(String nome) {
        if (nome == null || nome.isEmpty() || !nome.matches("^[a-zA-Z ]*$")) {
            jbCadastrar.setEnabled(false);
            return false;
        }
        jbCadastrar.setEnabled(true);
        return true;
    }
}
