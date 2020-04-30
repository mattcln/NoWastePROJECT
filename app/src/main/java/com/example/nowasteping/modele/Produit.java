package com.example.nowasteping.modele;

public class Produit {
    private String nom;
    private Integer quant;

    public Produit(String nom) {
        this.nom = nom;
        this.quant = 0;
    }

    public String getNom() {
        return nom;
    }

    public int getQuant() {
        return quant;
    }

    public void augmenterQuant(){
        quant++;
    } 
}
