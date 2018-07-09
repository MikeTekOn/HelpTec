/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opensoftware.helptec.domain;

import com.opensoftware.helptec.valueobjects.Nome;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

/**
 *
 * @author Hugo
 * @date 2/jul/2018
 */
@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Long version;

    private Nome nome;
    private String morada;
    private int telefone;

    /**
     * Constructor
     *
     * @param nome Nome cliente
     * @param morada morada client
     * @param telefone telefone cliente
     */
    public Cliente(Nome nome, String morada, int telefone) {

        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
    }

    /**
     * ORM
     */
    protected Cliente() {
        //ORM
    }

    /**
     * Get ID
     *
     * @return id
     */
    public Long Id() {
        return id;
    }

    /**
     * Get nome
     *
     * @return nome cliente
     */
    public Nome Nome() {
        return nome;
    }

    /**
     * Get morada cliente
     *
     * @return morada cliente
     */
    public String Morada() {
        return morada;
    }

    /**
     * Get telefone
     *
     * @return telefone cliente
     */
    public int Telefone() {
        return telefone;
    }

    /**
     * Change morade
     *
     * @param morada Morada atualizar
     */
    public void Morada(String morada) {
        this.morada = morada;
    }

    /**
     * Change telefone
     *
     * @param telefone telefone para atualizar
     */
    public void Telefone(int telefone) {
        this.telefone = telefone;
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.opensoftware.helptec.domain.Cliente[ id=" + id + " ]";
    }

}
