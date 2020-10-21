package com.cirvianum.daw.clientcirvianum.entities;

import javax.persistence.*;


public class UF {


    private int idUf;
    private int numUf;
    private String nomUf;

    public int getIdUf() {
        return idUf;
    }

    public void setIdUf(int idUf) {
        this.idUf = idUf;
    }

    public int getNumUf() {
        return numUf;
    }

    public void setNumUf(int numUf) {
        this.numUf = numUf;
    }

    public String getNomUf() {
        return nomUf;
    }

    public void setNomUf(String nomUf) {
        this.nomUf = nomUf;
    }
}
