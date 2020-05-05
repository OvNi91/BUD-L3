package com.example.budapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class inscription_formulaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription_formulaire);

        Button valider = (Button) findViewById(R.id.button_valider_inscription);
        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Champs concernant le mail de l'utilisateur
                EditText email1 = (EditText) findViewById(R.id.editText_email1_inscription);
                EditText email2 = (EditText) findViewById(R.id.editText_email2_inscription);

                //Champs concernant le mot de passe de l'utilisateur
                EditText password1 = (EditText) findViewById(R.id.editText_password1_inscription);
                EditText password2 = (EditText) findViewById(R.id.editText_password2_inscription);

                //Maintenant plus qu'à vérifier les infos
            }
        });


    }
}
