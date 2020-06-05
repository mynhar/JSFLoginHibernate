/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mynharcorp.beans;

import com.mynharcorp.dao.UsuarioDao;
import com.mynharcorp.model.Usuario;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Harold M Bonilla L
 */
@Named(value = "usuarioBean")
@RequestScoped
public class UsuarioBean {

    UsuarioDao dao;
    Usuario usuario = new Usuario();

    /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
         dao = new UsuarioDao();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String verificarDatos() throws Exception {        
        Usuario obj;
        String resultado;

        try {

            obj = dao.verificarDatos(this.usuario);
            if (obj != null) {
                
                // Manejo de session
                // almacenar dentro del contexto de JSF, la variable...
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", obj);
                resultado = "exito";

            } else {
                resultado = "error";
            }

        } catch (Exception e) {
            throw e;
        }

        return resultado;
    }
    
    
    /**
     * Verifica el contexto,
     * y verifica si la variable esta dentro del contexto.
     * @return 
     */
    public boolean verificarSesion(){
        boolean estado;
        
        if(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario") == null){
            estado = false;
            
        }else{
            estado = true;
            
        }
    
        return estado;
    }
    
    /**
     * Entra al contexto, se obtiene la referencia
     * y se invalida la sesión
     * @return 
     */
    public String cerrarSesion(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        
        /*
        faces-redirect=true
        olvida la peticion anterior y lleva a la siguiente pagina
        
        JSF: aveses no maneja peticiones por URL. Mantiene la URL anterior.
        para evitar mantener la URL anterior se usa; ?faces-redirect=true
        */
        return "index?faces-redirect=true";
    }

}
