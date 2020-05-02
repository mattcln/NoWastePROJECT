package com.example.nowasteping.controleur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nowasteping.R;

public class Accueil extends AppCompatActivity {

    private Button btnMonPanier;
    private Button btnAssos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        this.btnMonPanier = findViewById(R.id.btnMonPanier);
        this.btnAssos = findViewById(R.id.btnAssos);

        btnMonPanier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), MonPanier.class);
                startActivity(otherActivity);
                finish();
            }
        });

        btnAssos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Assos.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }
}
