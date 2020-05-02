package com.example.budapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class activity_change_mail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_mail);


        /** Bouton de retour qui permet de revenir aux paramètres de la personne **/
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

                EditText premier_mail = (EditText) findViewById(R.id.editText_email1);
                EditText deuxieme_mail = (EditText) findViewById(R.id.editText_email2);

                //Pour vérifier si les mails correspondent
                if (premier_mail.getText().toString().equals(deuxieme_mail.getText().toString()))
                {
                    System.out.println("Les mails sont les mêmes");
                }
                else
                {
                    System.out.println("Les mails sont différents");
                }

            }
        });
    }
}
