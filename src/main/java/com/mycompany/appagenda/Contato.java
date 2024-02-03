/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appagenda;

import Validacoes.ValidarEmail;
import Validacoes.ValidarNome;
import Validacoes.ValidarTelefone;

public class Contato {
    
    private String nome, email, telefone;
    
    public Contato(String nome, String email, String telefone) {
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (ValidarNome.validarNome(nome)) {
           this.nome = nome;
        }        
}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (ValidarEmail.validarEmail(email)) {
            this.email = email;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (ValidarTelefone.validarTelefone(telefone)) {
            this.telefone = telefone.replaceAll("[^0-9]", "");
        }
    }
    
}
