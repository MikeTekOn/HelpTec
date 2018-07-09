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
public class Marca implements Serializable {
    
    
    private String nomeMarca;

    public Marca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }
    
    //ORM
    protected Marca(){
        
    }

    public String nomeMarca() {
        return nomeMarca;
    }

    public void nomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.nomeMarca);
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
        final Marca other = (Marca) obj;
        if (!Objects.equals(this.nomeMarca, other.nomeMarca)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
