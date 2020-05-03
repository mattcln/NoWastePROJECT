package com.example.nowasteping.controleur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.nowasteping.modele.Produit;
import com.example.nowasteping.R;
import com.example.nowasteping.adapters.Panier_Item_Adapter;

import java.util.ArrayList;
import java.util.List;

public class MonPanier extends AppCompatActivity {
    List<Produit> listproduit = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_panier);
        Button btnRetour = findViewById(R.id.btnRetour);
        ListView panier_listview = findViewById(R.id.panier_listview);
        chargementArticle();
        affichageListview();

        ///RETOUR MENU
        btnRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Accueil.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }

    public void chargementArticle() {
        //List des items dans le panier (qui seront récupéré depuis le scan)
        listproduit.add(new Produit("Pâtes"));
        listproduit.add(new Produit("Viande"));
        Produit prod = new Produit("Voiture");
        prod.ajoutProduit(); //Test de l'incrémentation
        listproduit.add(prod);
        listproduit.add(new Produit("8 gros oeufs frais"));
        listproduit.add(new Produit("Machine à laver"));
        supprimerProduit("Viande");
    }

    private void affichageListview(){
        ListView panier_listview = findViewById(R.id.panier_listview);
        panier_listview.setAdapter(new Panier_Item_Adapter(this, listproduit));
    }

    public void supprimerProduit(String nomP){
        for(int i = 0; i < listproduit.size(); i++){
            if(listproduit.get(i).getNom() == nomP){
                listproduit.remove(i);
            }
        }
        affichageListview();
    }
}

