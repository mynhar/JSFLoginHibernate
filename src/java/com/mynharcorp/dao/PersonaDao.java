/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mynharcorp.dao;

import com.mynharcorp.model.Persona;
import com.mynharcorp.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

/**
 *
 * @author Harold M Bonilla L
 */
public class PersonaDao {

    private Session session;
    private Transaction transaction;

    public PersonaDao() {
    }

    /**
     *
     * @param obj
     * @throws Exception
     */
    public void create(Persona obj) throws Exception {
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            this.session.save(obj);
            this.transaction.commit();

        } catch (Exception ex) {
            this.transaction.rollback();
            throw ex;
        } finally {
            this.session.close();
        }
    }

    /**
     *
     * @param obj
     * @throws Exception
     */
    public void update(Persona obj) throws Exception {
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            this.session.update(obj);
            this.transaction.commit();

        } catch (Exception ex) {
            this.transaction.rollback();
            throw ex;
        } finally {
            this.session.close();
        }
    }

    /**
     *
     * @param obj
     * @throws Exception
     */
    public void delete(Persona obj) throws Exception {
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            this.session.delete(obj);
            this.transaction.commit();

        } catch (Exception ex) {
            this.transaction.rollback();
            throw ex;
        } finally {
            this.session.close();
        }
    }

    /**
     *
     * @return @throws Exception
     */
    public List<Persona> getList() throws Exception {
        List<Persona> objList = null;
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = this.session.createCriteria(Persona.class);
            criteria.addOrder(Order.asc("apellido"));
            objList = criteria.list();

        } catch (Exception ex) {
            throw ex;
        }

        return objList;
    }
    
}
