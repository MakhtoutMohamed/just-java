package com.sp.application;

public class Produit {
    private String nom;
    private double prix;
    private int qte;

    Produit(String nom, double prix, int qte){
        this.nom = nom;
        this.prix = prix;
        this.qte = qte;
    }

    //getters
    public String getNom() {
        return nom;
    }
    public double getPrix() {
        return prix;
    }
    public int getQte() {
        return qte;
    }

    //setters
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void setQte(int qte) {
        this.qte = qte;
    }

@Override
public String toString() {
        return "nom: " + nom + ", prix: " + prix + ", qte: " + qte;
}
}
