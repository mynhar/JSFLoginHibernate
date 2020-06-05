/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mynharcorp.util;

import com.mynharcorp.model.Jugador;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Harold M Bonilla L
 */
public class JugadorHelper {
    
      Session session = null;

    public JugadorHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    
    public List getList(){
    List<Jugador> objList = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Jugador");
        objList = (List<Jugador>) q.list();

    } catch (Exception e) {
        e.printStackTrace();
    }
    return objList;
    }
    
    
    public Jugador getFilmByID(int Id){

    Jugador obj = null;

    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Jugador jug where jug.Id=" + Id);
        obj = (Jugador) q.uniqueResult();
    } catch (Exception e) {
        e.printStackTrace();
    }

    return obj;
}
    
}
