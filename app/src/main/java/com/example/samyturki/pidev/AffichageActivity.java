package com.example.samyturki.pidev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.samyturki.pidev.AddActivity.profil;

public class AffichageActivity extends AppCompatActivity {

    TextView tvNom,tvPrenom,tvEmail,tvDate,tvTelephone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage);

        tvDate = (TextView) findViewById(R.id.tvDate);
        tvNom = (TextView) findViewById(R.id.tvNom);
        tvPrenom = (TextView) findViewById(R.id.tvPrenom);

        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvTelephone = (TextView) findViewById(R.id.tvTelephone);


//        tvDate.setText(profil.getDate_naissance());
        tvNom.setText(profil.getNom());
        tvPrenom.setText(profil.getPrenom());
        tvEmail.setText(profil.getEmail());
        tvTelephone.setText(profil.getTelephone());






    }
}
