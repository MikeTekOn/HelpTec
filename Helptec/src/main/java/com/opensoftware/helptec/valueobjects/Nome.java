/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opensoftware.helptec.valueobjects;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Hugo
 * @date 2/jul/2018
 */
@Embeddable
public class Nome implements Serializable{

    private String nome;

    public Nome(String nome) {
        this.nome = nome;
    }

    protected Nome() {

    }

}
