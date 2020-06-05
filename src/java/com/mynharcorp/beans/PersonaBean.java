/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mynharcorp.beans;

import com.mynharcorp.dao.PersonaDao;
import com.mynharcorp.model.Persona;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Harold M Bonilla L
 */
@Named(value = "personaBean")
@SessionScoped
public class PersonaBean implements Serializable {

    Persona persona = new Persona();
    PersonaDao dao = new PersonaDao();
    List<Persona> objList;
    
    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getObjList() {
        return objList;
    }

    public void setObjList(List<Persona> objList) {
        this.objList = objList;
    }
    
    public void registrar() throws Exception{
        dao.create(this.persona);        
    }
    
    public void eliminar(Persona obj) throws Exception{
        dao.delete(obj);
    }    
    
     public String leer(Persona obj) throws Exception{
        this.persona = obj;
        return "editar";
    }     
     
    public String modificar() throws Exception{
        dao.update(this.persona);
        return "exito";
    }
    
    public void listar() throws Exception{
        this.objList = dao.getList();
    } 
        
}
