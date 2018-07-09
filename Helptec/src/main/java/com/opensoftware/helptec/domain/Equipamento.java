/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opensoftware.helptec.domain;

import com.opensoftware.helptec.valueobjects.Marca;
import com.opensoftware.helptec.valueobjects.Modelo;
import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;

/**
 *
 * @author Hugo
 * @date 29/abr/2018
 */
@Entity
public class Equipamento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Long version;

    @OneToOne
    private TipoEquipamento tipoEquipamento;
    @OneToMany
    private List<Reparacao> listReparacao;
    @OneToOne
    private Cliente cliente;
    @Embedded
    private Marca marca;
    @Embedded
    private Modelo modelo;

    /**
     * Constructor
     *
     * @param tipoEquipamento tipo equipamento
     * @param cliente propriatario do equipamento
     * @param marca marca do equipamento
     * @param modelo modelo do equipamento
     */
    public Equipamento(TipoEquipamento tipoEquipamento, Cliente cliente, Marca marca, Modelo modelo) {
        this.tipoEquipamento = tipoEquipamento;
        this.cliente = cliente;
        this.marca = marca;
        this.modelo = modelo;
        listReparacao = new ArrayList<>();
    }

    /**
     * ORM
     */
    protected Equipamento() {

    }

    /**
     * Get tipo equipamento
     *
     * @return tipo equipamento
     */
    public TipoEquipamento tipoEquipamento() {
        return tipoEquipamento;
    }

    /**
     * Get lista reparações
     *
     * @return lista
     */
    public List<Reparacao> listReparacao() {
        return listReparacao;
    }

    /**
     * Get Marca equipamento
     *
     * @return marca
     */
    public Marca marca() {
        return marca;
    }

    /**
     * Get modelo equipamento
     *
     * @return modelo
     */
    public Modelo modelo() {
        return modelo;
    }

    /**
     * Get cliente do equipamento
     *
     * @return cliente
     */
    public Cliente cliente() {
        return cliente;
    }

    public void adicionarReparacao(Reparacao rep) {

        this.listReparacao.add(rep);

    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Equipamento other = (Equipamento) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Equipamento{" + "tipoEquipamento=" + tipoEquipamento + ", marca=" + marca + ", modelo=" + modelo + '}';
    }

}
