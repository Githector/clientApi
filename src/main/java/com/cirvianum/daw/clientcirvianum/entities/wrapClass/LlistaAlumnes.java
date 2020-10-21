package com.cirvianum.daw.clientcirvianum.entities.wrapClass;

import com.cirvianum.daw.clientcirvianum.entities.Alumne;

import java.util.ArrayList;
import java.util.List;

public class LlistaAlumnes {
    private List<Alumne> llistaAlumnes = new ArrayList<>();

    public List<Alumne> getLlistaAlumnes() {
        return llistaAlumnes;
    }

    public void setLlistaAlumnes(List<Alumne> llistaAlumnes) {
        this.llistaAlumnes = llistaAlumnes;
    }
}
