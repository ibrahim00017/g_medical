package com.gm.models;

import java.sql.Date;

public class User {
    private int id;
    private String nom;
    private int attribut31;
    private Date dateNaissanace;
    private String email;
    private String genre;
    private String addresse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAttribut31() {
        return attribut31;
    }

    public void setAttribut31(int attribut31) {
        this.attribut31 = attribut31;
    }

    public Date getDateNaissanace() {
        return dateNaissanace;
    }

    public void setDateNaissanace(Date dateNaissanace) {
        this.dateNaissanace = dateNaissanace;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }
}
