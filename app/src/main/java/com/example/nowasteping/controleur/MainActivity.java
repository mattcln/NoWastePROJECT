package com.example.nowasteping.controleur;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nowasteping.R;

public class MainActivity extends AppCompatActivity {

    private TextView lblMail;
    private TextView lblMdp;
    private EditText txtMail;
    private EditText txtMdp;
    private Button btnConnect;
    private Button btnInscription;
    private ImageView imgNoWaste;
    private TextView txtWrongmdp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblMail = findViewById(R.id.lblMail);
        lblMdp = findViewById(R.id.lblMdp);
        txtMail = findViewById(R.id.txtMail);
        txtMdp = findViewById(R.id.txtMdp);
        btnConnect = findViewById(R.id.btnConnect);
        btnInscription = findViewById(R.id.btnInscription);
        imgNoWaste = findViewById(R.id.imgNoWaste);
        txtWrongmdp = findViewById(R.id.txtWrongmdp);
        txtWrongmdp.setVisibility(View.INVISIBLE);
        btnConnect.setOnClickListener(btnSeConnecterListener);
        init();

    }

    private void init() {
        txtMail.setText("");
        txtMdp.setText("");
        txtMail.requestFocus();
    }

    private View.OnClickListener btnSeConnecterListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("DEBUG", "Bouton 'Se connecter' cliqué");

            String textMail = txtMail.getText().toString();
            String textMdp = txtMdp.getText().toString();
            Log.i("DEBUG",textMail + " " + textMdp);

            if(LoginCorrect(textMail, textMdp)){
                Log.i("DEBUG","Authentification successfull");
                Intent otherActivity = new Intent(getApplicationContext(), Accueil.class);
                startActivity(otherActivity);
                finish();
            } else {
                Log.i("DEBUG","Authentification failed");
                txtWrongmdp.setVisibility(View.VISIBLE);
            }
        }
    };

    public boolean LoginCorrect (String textMail, String textMdp){
        if(textMail.equals("a") && textMdp.equals("1")){
            return true;
        } else return false;
    }
}
