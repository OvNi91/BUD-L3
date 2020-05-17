package com.example.budapp;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.budapp.MainActivity;
import com.example.budapp.R;
import com.example.budapp.mon_logement;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_login extends Fragment {


    public fragment_login() {
        // Required empty  public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View myFragmentView = inflater.inflate(R.layout.fragment_login, container, false);
        Button log = (Button) myFragmentView.findViewById(R.id.btn_login);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText username = (EditText) myFragmentView.findViewById(R.id.et_email);
                EditText password = (EditText) myFragmentView.findViewById(R.id.et_password);
                Intent intent = new Intent(myFragmentView.getContext().getApplicationContext(), mon_logement.class);
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    startActivity(intent);
                    System.out.println("connecction successfull");
                    //correcct password
                } else {
                    System.out.println("ERROR 404");
                    //wrong password
                }
            }
        });
        // Inflate the layout for this fragment
        return myFragmentView;
    }
}
