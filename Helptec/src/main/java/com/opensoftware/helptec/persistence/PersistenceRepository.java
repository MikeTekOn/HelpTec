/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opensoftware.helptec.persistence;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Hugo
 * @param <T>
 * @param <ID>
 * @date 2/jul/2018
 */
public class PersistenceRepository<T, ID extends Serializable> {

    private final String nameUP = "pu";
    private Class<T> entityClass;

    private EntityManager entityManager() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

        return emf.createEntityManager();
    }

    /**
     * Persiste entity on database
     *
     * @param entity entity to save
     * @return entity saved
     */
    public T save(T entity) {

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//        EntityManager e = emf.createEntityManager();
        EntityManager em = EntityManagerUtil.getEntityManager();
        if (entity == null) {
            throw new IllegalArgumentException("Data is empty");
        }

//       e.getTransaction().begin();
//       e.persist(entity);
//       e.getTransaction().commit();
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        em.close();

        return entity;
    }

    /**
     * Delete entity on database
     *
     * @param entity entity to delete
     * @return entity deleted
     */
    public T delete(T entity) {

        if (entity == null) {
            throw new IllegalArgumentException("Data is empty");
        }
        entityManager().getTransaction().begin();
        entityManager().remove(entity);
        entityManager().getTransaction().commit();

        return entity;
    }

    /**
     * Update entity database
     *
     * @param entity entity to update
     * @return entity updated
     */
    public T update(T entity) {

        if (entity == null) {
            throw new IllegalArgumentException("Data is empty");
        }

        entityManager().getTransaction().begin();
        entityManager().merge(entity);
        entityManager().getTransaction().commit();

        return entity;

    }

    /**
     * Search object by id
     *
     * @param pk id to search
     * @return object
     */
    public T findByID(ID pk) {

        return entityManager().find(entityClass, pk);

    }

    /**
     * Get all object from database
     *
     * @return list of all entity
     */
    public List<T> findAll() {

        Query query = entityManager().createNamedQuery("SELECT e FROM " + entityClass.getSimpleName() + " e");

        return query.getResultList();
    }

}
