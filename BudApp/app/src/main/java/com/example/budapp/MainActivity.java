package com.example.budapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mon_compte = (Button) findViewById(R.id.button_myAccount);
        mon_compte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MyAccount.class);
                startActivity(startIntent);
            }
        });

        Button insc = (Button) findViewById(R.id.button_formulaire);
        insc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),inscription_formulaire.class);
                startActivity(startIntent);
            }
        });

        Button logement = (Button) findViewById(R.id.button_monLogement);
        logement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),mon_logement.class);
                startActivity(startIntent);
            }
        });
    }
}
