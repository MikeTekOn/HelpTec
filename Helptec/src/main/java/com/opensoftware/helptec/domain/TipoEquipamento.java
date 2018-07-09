/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opensoftware.helptec.domain;

import com.opensoftware.helptec.valueobjects.Nome;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author Hugo
 * @date 2/jul/2018
 */
@Entity
public class TipoEquipamento implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private Nome id;

    /**
     * Construtor
     *
     * @param nome nome tipo equipamento
     */
    public TipoEquipamento(String nome) {
        id = new Nome(nome);
    }

    
    protected TipoEquipamento(){
        
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEquipamento)) {
            return false;
        }
        TipoEquipamento other = (TipoEquipamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.opensoftware.helptec.domain.tipoequipamento.Tipo[ id=" + id + " ]";
    }

}
