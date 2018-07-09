/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opensoftware.helptec.valueobjects;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author Hugo
 * @date 9/jun/2018
 */
@Embeddable
public class Modelo implements Serializable {

    private String modelo;

    public Modelo(String modelo) {
        this.modelo = modelo;
    }

    
    //ORM
    protected Modelo(){
        
    }
    public String modelo() {
        return modelo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.modelo);
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
        final Modelo other = (Modelo) obj;
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }

}
