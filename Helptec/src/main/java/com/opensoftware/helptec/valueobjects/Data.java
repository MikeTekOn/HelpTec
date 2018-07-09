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
 * @date 29/abr/2018
 */
@Embeddable
public class Data implements Serializable {

    private String data;

    /**
     *
     * @param date
     */
    public Data(String date) {
        this.data = date;
    }

    /**
     * ORM
     */
    protected Data() {
        //ORM
    }

    /**
     * Get data
     *
     * @return data
     */
    public String data() {
        return data;
    }

   

}
