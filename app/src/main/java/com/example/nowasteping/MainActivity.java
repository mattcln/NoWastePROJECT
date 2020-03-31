package com.example.nowasteping;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView lbltitre;
    private TextView lblMail;
    private TextView lblMdp;
    private EditText txtMail;
    private EditText txtMdp;
    private Button btnConnect;
    private Button btnInscription;
    private ImageView imgZucc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lbltitre = findViewById(R.id.lblTitre);
        lblMail = findViewById(R.id.lblMail);
        lblMdp = findViewById(R.id.lblMdp);
        txtMail = findViewById(R.id.txtMail);
        txtMdp = findViewById(R.id.txtMdp);
        btnConnect = findViewById(R.id.btnConnect);
        btnInscription = findViewById(R.id.btnInscription);
        imgZucc = findViewById(R.id.imgZucc);

        btnConnect.setOnClickListener(btnSeConnecterListener);

    }

    private View.OnClickListener btnSeConnecterListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("DEBUG", "Bouton 'Se connecter' cliqué");
        }
    };
}
