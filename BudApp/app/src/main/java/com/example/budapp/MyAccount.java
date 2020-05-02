package com.example.budapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Scanner;

import androidx.appcompat.app.AppCompatActivity;

public class MyAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        Scanner sc = new Scanner(System.in);
        TextView email = (TextView) findViewById(R.id.textView_mail);
        TextView mdp = (TextView) findViewById(R.id.textView_mdp_text);



        String test = new String("hugo.butery@efrei.fr");
        email.setText(test);
        mdp.setText("password");



        ImageButton change_mail = (ImageButton) findViewById(R.id.button_change_email);
        change_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), activity_change_mail.class);
                startActivity(startIntent);
            }
        });

        ImageButton change_password = (ImageButton) findViewById(R.id.imageButton_change_motDePasse);
        change_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), com.example.budapp.change_password.class);
                startActivity(startIntent);
            }
        });
    }
}
