/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opensoftware.helptec.repository;

import com.opensoftware.helptec.domain.Utilizador;
import com.opensoftware.helptec.persistence.PersistenceRepository;
import javax.persistence.Query;

/**
 *
 * @author Hugo
 * @date 9/jul/2018
 */
public class UtilizadorRepository extends PersistenceRepository<Utilizador, Long> {

    /**
     * Search user for login
     * @param user User to make login
     * @return true if user exist
     */
    public boolean searchUserForLogin(Utilizador user) {

        Query q = this.entityManager().createQuery("SELECT e.funcionario, e.password FROM Utilizador e, Funcionario f WHERE f.name = :func and e.password = :pass");
        q.setParameter("func", user.funcionario().name());
        q.setParameter("pass", user.password());

        return q.getResultList().size() == 1;
    }

}
