package com.example.nowasteping.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.nowasteping.modele.Produit;
import com.example.nowasteping.R;

import java.util.List;

public class Panier_Item_Adapter extends BaseAdapter {

    //fields
    private Context context;
    private List<Produit> produitlist;
    LayoutInflater inflater;

    public Panier_Item_Adapter(Context context, List<Produit> produitlist) {
        this.context = context;
        this.produitlist = produitlist;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return produitlist.size();
    }

    @Override
    public Produit getItem(int position) {
        return produitlist.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.panier_listview_item, null);

        // Récupérer les informations de nos produits
        Produit currentProduit = getItem(i);
        String produitNom = currentProduit.getNom();
        int produitQuant = currentProduit.getNb();

        // Les insérer dans le listview
        TextView itemNameView = view.findViewById(R.id.item_name);
        itemNameView.setText(produitNom);

        TextView itemQuantView = view.findViewById(R.id.item_quant);
        itemQuantView.setText(produitQuant + "");

        return view;
    }
}
