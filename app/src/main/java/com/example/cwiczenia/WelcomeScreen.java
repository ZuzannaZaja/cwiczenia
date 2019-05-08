package com.example.cwiczenia;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeScreen extends AppCompatActivity {

    private TextView email;
    private Button btn_location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        email = findViewById(R.id.email);
        btn_location = findViewById(R.id.location);
        //TODO: ZADANIE 3
        //Intent intent = ...



        btn_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        //TODO: ZADANIE 1
                //Uri url = ...

            }
        });
    }
}
