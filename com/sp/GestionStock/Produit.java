package com.sp.GestionStock;

public class Produit {
    private int code;
    private String nom;
    private int quantite;
    private double prix;

    public Produit(int code, String nom, int quantite, double prix) {
        this.code = code;
        this.nom = nom;
        this.quantite = quantite;
        this.prix = prix;
    }

    double getTotalStock() {
        return quantite * prix;
    }
//getters
    public int getCode() {
        return code;
    }
    public double getPrix() {
        return prix;
    }
    public int getQuantite() {
        return quantite;
    }
    public String getNom() {
        return nom;
    }
//setters
    public void setCode(int code) {
        this.code = code;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
@Override
public String toString() {
        return "[code=" + code + ", nom=" + nom + ", quantite=" + quantite + ", prix=" + prix + "]";
}

}
