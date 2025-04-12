package com.sp.mngcontacts;

import java.util.Scanner;

public class Program {
    static Contact [] cnt = new Contact[2];

    static void ajouter(Contact c) {
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == null) {
                cnt[i] = c;
                System.out.println("mettre "+c+" dans la case: "+i);
                return;
            }
        }
    }

    static void afficherContacts() {
        System.out.println("List des contacts: ");
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] != null) {
                System.out.println(cnt[i].toString());
            }
        }
    }

    static Contact rechercher(String nom) {
        for (int i=0; i<cnt.length; i++){
            if((cnt[i]!=null) && (cnt[i].getNom().equalsIgnoreCase(nom))) {
                return cnt[i];
            }
        }
        System.out.println("contact non trouve!!");
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contact [] cnt= new Contact[2];
        String nom, prenom, telephone, email;
        System.out.println("Merci de saisir les info du contacts:");
        for (int i = 0; i < cnt.length; i++) {
            System.out.println("Contact numero "+(i+1));
            System.out.println("Nom:");
            nom = sc.nextLine();
            System.out.println("Prenom:");
            prenom = sc.nextLine();
            System.out.println("Telephone:");
            telephone = sc.nextLine();
            System.out.println("Email:");
            email = sc.nextLine();

            ajouter(new Contact(nom, prenom, telephone, email));
            //cnt[i] = new Contact(nom, prenom, telephone, email);
            //System.out.println("Contact numero "+(cnt[i]));
        }
        /*for (int i = 0; i < cnt.length; i++) {
            System.out.println(cnt[i]);
        }*/
        afficherContacts();

        System.out.println("Entrer le nom du contact a rechercher :");
        nom = sc.nextLine();
        Contact r=rechercher(nom);
        System.out.println("resulta de la recherche est :"+r);
    }
}
//1.40