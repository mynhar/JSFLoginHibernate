package com.mynharcorp.model;
// Generated 01/06/2020 05:14:57 PM by Hibernate Tools 4.3.1



/**
 * CamisetaId generated by hbm2java
 */
public class CamisetaId  implements java.io.Serializable {


     private int id;
     private int idMarca;

    public CamisetaId() {
    }

    public CamisetaId(int id, int idMarca) {
       this.id = id;
       this.idMarca = idMarca;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getIdMarca() {
        return this.idMarca;
    }
    
    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CamisetaId) ) return false;
		 CamisetaId castOther = ( CamisetaId ) other; 
         
		 return (this.getId()==castOther.getId())
 && (this.getIdMarca()==castOther.getIdMarca());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getId();
         result = 37 * result + this.getIdMarca();
         return result;
   }   


}


