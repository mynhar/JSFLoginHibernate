package com.mynharcorp.model;
// Generated 01/06/2020 05:14:57 PM by Hibernate Tools 4.3.1



/**
 * Jugador generated by hbm2java
 */
public class Jugador  implements java.io.Serializable {


     private JugadorId id;
     private String nombre;

    public Jugador() {
    }

    public Jugador(JugadorId id, String nombre) {
       this.id = id;
       this.nombre = nombre;
    }
   
    public JugadorId getId() {
        return this.id;
    }
    
    public void setId(JugadorId id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}


