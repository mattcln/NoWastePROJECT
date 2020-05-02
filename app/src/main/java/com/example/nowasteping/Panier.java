package com.example.nowasteping.vue;

import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nowasteping.R;
import com.example.nowasteping.adapters.Panier_Item_Adapter;
import com.example.nowasteping.modele.Produit;

import java.util.ArrayList;
import java.util.List;

public class Panier extends AppCompatActivity {
    public void chargementArticle(){


        //List des items dans le panier (qui seront récupéré depuis le scan)
        List<Produit> listproduit = new ArrayList<>();
        listproduit.add(new Produit("Pâtes"));
        listproduit.add(new Produit("Viande"));
        listproduit.add(new Produit("8 gros oeufs frais"));
        listproduit.add(new Produit("Machine à laver"));

        //Récupérer la listview & affichage
        ListView panier_listview = findViewById(R.id.panier_listview);
        panier_listview.setAdapter(new Panier_Item_Adapter(this, listproduit));
    }

}
