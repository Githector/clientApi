package com.cirvianum.daw.clientcirvianum.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


public class MP {

    public int idMp;
    public int numMp;
    public String nomMp;
    private List<UF> llistaUf = new ArrayList<>();;

    public int getIdMp() {
        return idMp;
    }

    public void setIdMp(int idMp) {
        this.idMp = idMp;
    }

    public int getNumMp() {
        return numMp;
    }

    public void setNumMp(int numMp) {
        this.numMp = numMp;
    }

    public String getNomMp() {
        return nomMp;
    }

    public void setNomMp(String nomMp) {
        this.nomMp = nomMp;
    }

    public List<UF> getLlistaUf() {
        return llistaUf;
    }

    public void setLlistaUf(List<UF> llistaUf) {
        this.llistaUf = llistaUf;
    }

    public void addUf(UF uf){
        this.llistaUf.add(uf);
    }
}
