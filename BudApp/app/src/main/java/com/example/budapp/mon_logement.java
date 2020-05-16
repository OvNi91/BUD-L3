package com.example.budapp;

<<<<<<< HEAD
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
=======
import android.os.Bundle;
import android.view.View;
>>>>>>> ba83bfad14f7b3b8105e5e86c129c5ef18280e76
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
<<<<<<< HEAD

        Button myAccount = (Button) findViewById(R.id.button_monCompte_logement);
        myAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MyAccount.class);
                startActivity(startIntent);
            }
        });
=======
>>>>>>> ba83bfad14f7b3b8105e5e86c129c5ef18280e76
    }
}
