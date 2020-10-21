package com.cirvianum.daw.clientcirvianum.entities;

public class Alumne {

    private int idAlumne;
    private String nom;
    private String cognoms;
    private String mail;
    private String urlPhoto;

    public int getIdAlumne() {
        return idAlumne;
    }

    public void setIdAlumne(int idAlumne) {
        this.idAlumne = idAlumne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }
}
