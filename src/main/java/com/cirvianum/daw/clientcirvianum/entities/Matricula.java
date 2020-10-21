package com.cirvianum.daw.clientcirvianum.entities;

import javax.persistence.*;
import java.util.List;


public class Matricula {

    private int idMatricula;
    private Alumne alumne;
    private List<UF> llistaUfsMatriculades;

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Alumne getAlumne() {
        return alumne;
    }

    public void setAlumne(Alumne alumne) {
        this.alumne = alumne;
    }

    public List<UF> getLlistaUfsMatriculades() {
        return llistaUfsMatriculades;
    }

    public void setLlistaUfsMatriculades(List<UF> llistaUfsMatriculades) {
        this.llistaUfsMatriculades = llistaUfsMatriculades;
    }

    public void addUfMatriculada(UF uf){
        llistaUfsMatriculades.add(uf);
    }
}
