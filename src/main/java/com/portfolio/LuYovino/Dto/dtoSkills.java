
package com.portfolio.LuYovino.Dto;

import javax.validation.constraints.NotBlank;

public class dtoSkills {
    @NotBlank
    private String nombreS;
    @NotBlank
    private int descripcionS;
    
    //Constructores

    public dtoSkills() {
    }

    public dtoSkills(String nombreS, int descripcionS) {
        this.nombreS = nombreS;
        this.descripcionS = descripcionS;
    }
    
    //Getters y Setters

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
