package com.sp.mngcontacts;

public class Contact {
    private String nom;
    private String prenom;
    private String telephone;
    private String email;

    public Contact(String nom, String prenom, String telephone, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
    }
//getters
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getTelephone() {
        return telephone;
    }
    public String getEmail() {
        return email;
    }
//setters
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
@Override
public String toString() {
        return "(" + nom + "," + prenom + "," + telephone + "," + email + ")";
}
}
