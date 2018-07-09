/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opensoftware.helptec.domain;

import com.opensoftware.helptec.valueobjects.Password;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Version;

/**
 *
 * @author Hugo
 * @date 2/jul/2018
 */
@Entity
public class Utilizador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Version
    private Long version;
    
    @OneToOne
    private Funcionario funcionario;
    @Embedded
    private Password password;

    /**
     * Construtor
     *
     * @param funcionario Funcionario (Username)
     * @param password password do utilizador
     */
    public Utilizador(Funcionario funcionario, Password password) {
        this.funcionario = funcionario;
        this.password = password;
    }

    //ORM
    protected Utilizador(){
        
    }
    /**
     * Get funcionario
     *
     * @return funcionario
     */
    public Funcionario funcionario() {
        return funcionario;
    }

    /**
     * Get password
     *
     * @return password
     */
    public Password password() {
        return password;
    }

    /**
     * Mudar password
     *
     * @param password password a atualizar
     */
    public void password(Password password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Utilizador other = (Utilizador) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Uti{" + "funcionario=" + funcionario + ", password=" + password + '}';
    }

}
