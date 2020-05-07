package com.example.budapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class mon_logement extends AppCompatActivity {

    //Temperature de départ -> Il faudra aller chercher dans la base de donnée pour initilaiser cette valeur
    int temperature = 22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_logement);

        // Temperature affichée entre les flêches qui permettent d'ugmenter et baisser la température
        TextView tempDisplayedOnScreen = (TextView) findViewById(R.id.textView_temperature_entre_fleches);
        tempDisplayedOnScreen.setText(temperature + " °C");

        //Bouton pour baisser la température
        ImageButton down_temp = (ImageButton) findViewById(R.id.imageButton_down_temperature);
        down_temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tempDisplayedOnScreen = (TextView) findViewById(R.id.textView_temperature_entre_fleches);
                int temp = temperature;
                tempDisplayedOnScreen.setText(temp - 1 + " °C");
                temperature--;
            }
        });

        //Bouton pour augmenter la température
        ImageButton up_temp = (ImageButton) findViewById(R.id.imageButton_up_temperature);
        up_temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tempDisplayedOnScreen = (TextView) findViewById(R.id.textView_temperature_entre_fleches);
                int temp = temperature;
                tempDisplayedOnScreen.setText(temp + 1 + " °C");
                temperature++;
            }
        });

        final Switch autonome = (Switch) findViewById(R.id.switch_autonome_ou_non);
        autonome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}