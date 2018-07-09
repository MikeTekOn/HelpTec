/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opensoftware.helptec.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Hugo
 * @date 2/jul/2018
 */
public class EntityManagerUtil {

    private static EntityManagerFactory factory;
    private static EntityManager em;

    public static EntityManager getEntityManager() {
        factory = Persistence.createEntityManagerFactory("pu");
        em = factory.createEntityManager();
        return em;
    }

}
