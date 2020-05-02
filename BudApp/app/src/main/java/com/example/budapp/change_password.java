package com.example.budapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class change_password extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        ImageButton retour = (ImageButton) findViewById(R.id.imageButton_retour);
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), MyAccount.class);
                startActivity(startIntent);
            }
        });

        Button valider = (Button) findViewById(R.id.button_valider);
        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText ancien_mdp = (EditText) findViewById(R.id.editText_ancien_mdp);
                EditText nouv_mdp_1 = (EditText) findViewById(R.id.editText_nv_mdp_1);
                EditText nouv_mdp_2 = (EditText) findViewById(R.id.editText_nv_mdp_2);


                System.out.println("On a validé les mots de passe");
                //Ici, on met des commandes pour vérifier que ce sont les bonnes valeurs
                // Avec la liasion SQL
            }
        });
    }
}
