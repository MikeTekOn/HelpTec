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
public class Relatorio implements Serializable{

    
    private String relatorio;

    public Relatorio(String relatorio) {
        this.relatorio = relatorio;
    }
    
    
    protected Relatorio(){
        
    }

    public String relatorio() {
        return relatorio;
    }

    public void relatorio(String relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.relatorio);
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
        final Relatorio other = (Relatorio) obj;
        if (!Objects.equals(this.relatorio, other.relatorio)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
