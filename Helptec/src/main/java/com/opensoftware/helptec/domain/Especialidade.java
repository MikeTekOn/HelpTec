/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opensoftware.helptec.domain;

import com.opensoftware.helptec.valueobjects.Nome;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author Hugo
 * @date 2/jul/2018
 */
@Entity
public class Especialidade implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private Nome especialidade;

    /**
     * Constructor
     *
     * @param especialidade especialidade funcionario
     */
    public Especialidade(String especialidade) {
        this.especialidade = new Nome(especialidade);
    }
    
    //ORM
    protected Especialidade(){
        
    }
    /**
     * Get especialidade
     *
     * @return espacialidade funcionario
     */
    public Nome especialidade() {
        return especialidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.especialidade);
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
        final Especialidade other = (Especialidade) obj;
        if (!Objects.equals(this.especialidade, other.especialidade)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Especialidade{" + "especialidade=" + especialidade + '}';
    }

}
