/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opensoftware.helptec.domain;

import com.opensoftware.helptec.valueobjects.Data;
import com.opensoftware.helptec.valueobjects.Relatorio;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Hugo
 * @date 2/jul/2018
 */
@Entity
public class Reparacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Embedded
    private Data dataReparacao;
    @Embedded
    private Relatorio relatorio;
    @OneToOne
    private Funcionario funcionario;

    /**
     * Constructor
     *
     * @param dataReparacao data da reparação
     * @param relatorio relatorio da reparação
     * @param funcionario funcionario que reparou
     */
    public Reparacao(Data dataReparacao, Relatorio relatorio, Funcionario funcionario) {
        this.dataReparacao = dataReparacao;
        this.relatorio = relatorio;
        this.funcionario = funcionario;
    }

    /**
     * ORM
     */
    protected Reparacao() {
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
     * Get data Reparação
     *
     * @return data reparação
     */
    public Data dataReparacao() {
        return dataReparacao;
    }

    /**
     * Get relatorio
     *
     * @return relatorio
     */
    public Relatorio relatorio() {
        return relatorio;
    }

    /**
     * Get funcionario da reparação
     *
     * @return funcionario
     */
    public Funcionario funcionario() {
        return funcionario;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final Reparacao other = (Reparacao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reparacao{" + "dataReparacao=" + dataReparacao + ", relatorio=" + relatorio + ", funcionario=" + funcionario + '}';
    }

}
