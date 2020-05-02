package com.example.nowasteping.controleur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.nowasteping.modele.Produit;
import com.example.nowasteping.R;
import com.example.nowasteping.adapters.Panier_Item_Adapter;

import java.util.ArrayList;
import java.util.List;

public class MonPanier extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_panier);
        chargementArticle();
    }

    public void chargementArticle(){


        //List des items dans le panier (qui seront récupéré depuis le scan)
        List<Produit> listproduit = new ArrayList<>();
        listproduit.add(new Produit("Pâtes"));
        listproduit.add(new Produit("Viande"));
        Produit prod = new Produit("Voiture");
        prod.ajoutProduit();
        listproduit.add(prod);
        listproduit.add(new Produit("8 gros oeufs frais"));
        listproduit.add(new Produit("Machine à laver"));

        //Récupérer la listview & affichage
        ListView panier_listview = findViewById(R.id.panier_listview);
        panier_listview.setAdapter(new Panier_Item_Adapter(this, listproduit));
    }
}
