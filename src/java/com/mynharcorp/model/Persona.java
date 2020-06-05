package com.mynharcorp.model;
// Generated 01/06/2020 05:14:57 PM by Hibernate Tools 4.3.1



/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private int idPersona;
     private String nombre;
     private String apellido;
     private String sexo;

    public Persona() {
    }

	
    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }
    public Persona(int idPersona, String nombre) {
       this.idPersona = idPersona;
       this.nombre = nombre;
    }
   
    public int getIdPersona() {
        return this.idPersona;
    }
    
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

