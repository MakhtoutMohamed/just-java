package com.sp.GestionStock;

import java.util.Scanner;

public class Program {
    static Scanner sc = new Scanner(System.in);
    static int max_size = 10;
    static Produit[] produits = new Produit[max_size];

    static void printMenu(){
        System.out.println("-------- Gestion de Stock --------");
        System.out.println("1. Ajouter un produit");
        System.out.println("2. Modifier un produit");
        System.out.println("3. Supprimer un produit");
        System.out.println("4. Afficher la liste des produits");
        System.out.println("5. Rechercher un produit");
        System.out.println("6. Calculer la valeur totale du stock");
        System.out.println("0. Quitter");
        System.out.println("---------------------------------------");
    }

    static void ajouterProduit(Produit p) {
        for (int i = 0; i < produits.length; i++) {
            if (produits[i] == null) {
                produits[i] = p;
                System.out.println("Produit est bien ajouter");
                return;
            }
        }
        System.out.println("Error, tableau plein");
    }

    static void afficherProduits() {
        for (int i = 0; i < produits.length; i++) {
            if (produits[i] != null) {
                System.out.println(produits[i].toString());
            }
        }
        System.out.println("Tableau de produits est vide");
    }
    


    public static void main(String[] args) {
        int choix = -1;
        do {
            printMenu();
            System.out.println("Entrer Votre Choix:");
            choix = sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                    Produit p=saisieProduits();
                    ajouterProduit(p);
                    break;
                case 2:
                    System.out.println("Entrer le code de produit a modifier:");
                    int code = sc.nextInt();
                    System.out.println("Entrer le nom de produit a modifier:");
                    String nom = sc.nextLine();
                    System.out.println("Entrer le prix de produit a modifier:");
                    Double prix = sc.nextDouble();
                    System.out.println("Entrer la quantite de produit a modifier:");
                    int quantite = sc.nextInt();
                    modifierProduit(code, nom, prix, quantite);
                    break;
                case 3:
                    System.out.println("Veuillez entrer le code de produit a supprimer:");
                    code = sc.nextInt();
                    supprimerProduit(code);
                    break;
                case 4:
                    afficherProduits();
                    break;
                case 5:
                    System.out.println("Veuillez entrer le nom rechercher:");
                    String nom = sc.nextLine();
                    System.out.println("Resulta de la recherche:");
                    Produit r=rechercherProduits(nom);
                    System.out.println(r);
                    break;
                case 6:
                    double valeurTotal = calculerValeurStock();
                    System.out.println("Valeur Total: " + valeurTotal);
                    break;
                case 0:
                    break;
            }
        }while(choix != 0);
        System.out.println("Session terminee!");
    }

    static void modifierProduit(int code, String nom, Double prix, int quantite) {
        for (int i = 0; i < produits.length; i++) {
            if (produits[i] == null && produits[i].getCode() == code) {
                produits[i].setNom(nom);
                produits[i].setPrix(prix);
                produits[i].setQuantite(quantite);
                System.out.println("Produit est bien modifier");
                return;
            }
        }
        System.out.println("Error, Produit n'existe pas");
    }

    static void supprimerProduit(int code) {
        for (int i = 0; i < produits.length; i++) {
            if (produits[i] != null && produits[i].getCode() == code) {
                produits[i] = null;
                System.out.println("Produit est bien supprimer");
                return;
            }
        }
        System.out.println("Produit n'existe pas");
    }

    static double calculerValeurStock() {
        double valeurTotal = 0;
        for (int i = 0; i < produits.length; i++) {
            if (produits[i] != null) {
                //valeurTotal += produits[i].getPrix() * produits[i].getQuantite();
                valeurTotal += produits[i].getTotalStock();
            }
        }
        return valeurTotal;
    }

    static Produit rechercherProduits(String nom) {
        for (int i = 0; i < produits.length; i++) {
            if(produits[i]!=null && produits[i].getNom().equals(nom)) {
                return produits[i];
            }
        }
        System.out.println("Produit n'existe pas");
        return null;
    }

    private static Produit saisieProduits() {
        System.out.println("Saisir le code de prroduit:");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.println("Saisir le nom:");
        String nom = sc.nextLine();
        System.out.println("Saisir la quantite:");
        int quantite = sc.nextInt();
        System.out.println("Saisir le prix:");
        double prix = sc.nextDouble();
        Produit p = new Produit(code, nom, quantite, prix);
        return p;
    }
}
