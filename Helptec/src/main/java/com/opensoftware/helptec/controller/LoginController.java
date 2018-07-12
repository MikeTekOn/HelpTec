/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opensoftware.helptec.controller;

import com.opensoftware.helptec.domain.Funcionario;
import com.opensoftware.helptec.domain.Utilizador;
import com.opensoftware.helptec.repository.UtilizadorRepository;
import com.opensoftware.helptec.valueobjects.Nome;
import com.opensoftware.helptec.valueobjects.Password;
import javax.swing.JOptionPane;

/**
 *
 * @author Hugo
 * @date 12/jul/2018
 */
public class LoginController {

    private UtilizadorRepository rep;

    public LoginController() {

        rep = new UtilizadorRepository();
    }

    public void login(String user, String password) {

        if (user.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException("Username ou password vazias");
        }

        boolean test = rep.searchUserForLogin(new Utilizador(new Funcionario(user), new Password(password)));

        if (!test) {
            throw new IllegalArgumentException("Utilizador nao existe");
        }
    }

}
