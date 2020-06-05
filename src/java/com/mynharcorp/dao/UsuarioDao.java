/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mynharcorp.dao;

import com.mynharcorp.model.Usuario;
import com.mynharcorp.util.HibernateUtil;
import javax.faces.context.FacesContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Harold M Bonilla L
 */
public class UsuarioDao {
    
    
    Session session = null;

    public UsuarioDao() {
        //this.session = HibernateUtil.buildSessionFactory().getCurrentSession();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        this.session = sessionFactory.openSession();
    }
    
    
    public Usuario verificarDatos(Usuario usuario) throws Exception {
        Usuario obj = null;
        
        try{
            this.session.beginTransaction();
            String hql = "from Usuario where nombre = '"+ usuario.getNombre() +"' and clave = '" + usuario.getClave()+"'";
            Query query = session.createQuery(hql);
            
            if(!query.list().isEmpty()){
                obj = (Usuario) query.list().get(0);
            }
        
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw e;
        }
        
        return obj;
    }    
    
}
