/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opensoftware.helptec.domain;

import com.opensoftware.helptec.valueobjects.Data;
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
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Long version;

    @OneToOne
    private Especialidade especialidade;
    @Embedded
    private Data dataNascimento;
    private String name;
    private String morada;
    private int tlf;

    public Funcionario(Especialidade especialidade, Data dataNascimento, String name, String morada, int tlf) {
        this.especialidade = especialidade;
        this.dataNascimento = dataNascimento;
        this.name = name;
        this.morada = morada;
        this.tlf = tlf;
    }

    public Funcionario(String name) {
        this.name = name;
    }

    /**
     *
     */
    protected Funcionario() {
        //orm
    }

    /**
     * get name of worker
     *
     * @return Name of worker
     */
    public String name() {
        return name;
    }

    /**
     * Get Especialidade
     *
     * @return Especialidade
     */
    public Especialidade especialidade() {
        return especialidade;
    }

    /**
     * Get morada
     *
     * @return morada funcionario
     */
    public String morada() {
        return morada;
    }

    /**
     * Get data nascimento
     *
     * @return data nascimento funcionario
     */
    public Data dataNascimento() {
        return dataNascimento;
    }

    /**
     * Get numero telefone
     *
     * @return telefone do funcionario
     */
    public int tlf() {
        return tlf;
    }

    /**
     * Mudar especialidade
     *
     * @param especialidade especialidade a atualizar
     */
    public void especialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * Mudar morada
     *
     * @param morada Morada a mudar
     */
    public void morada(String morada) {
        this.morada = morada;
    }

    /**
     * Mudar telefone
     *
     * @param tlf telefone a atualizar
     */
    public void tlf(int tlf) {
        this.tlf = tlf;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Func{" + "especialidade=" + especialidade + ", dataNascimento=" + dataNascimento + ", morada=" + morada + ", tlf=" + tlf + '}';
    }

}
