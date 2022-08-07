
package com.portfolio.LuYovino.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    private String nombreS;
    private int descripcionS;
    
    //Constructores

    public Skills() {
    }

    public Skills(String nombreS, int descripcionS) {
        this.nombreS = nombreS;
        this.descripcionS = descripcionS;
    }
    
    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public int getDescripcionS() {
        return descripcionS;
    }

    public void setDescripcionS(int descripcionS) {
        this.descripcionS = descripcionS;
    }
    

}