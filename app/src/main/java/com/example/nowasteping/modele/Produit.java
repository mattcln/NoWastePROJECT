package com.example.nowasteping.modele;

public class Produit {
    String nom;
    int nb;

    public Produit(String nom) {
        this.nom = nom;
        this.nb = 1;
    }

    public String getNom() {
        return nom;
    }

    public int getNb() {
        return nb;
    }

    public void ajoutProduit(){
        nb++;
    }
}
