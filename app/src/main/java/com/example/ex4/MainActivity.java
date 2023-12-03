package com.example.ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editTextText);

        ImageView firstImage = findViewById(R.id.imageView);
        ImageView secondImage = findViewById(R.id.imageView2);
        ImageView thirdImage = findViewById(R.id.imageView3);


        String googleurl="https://www.google.tn/?hl=fr";
        String androidurl="https://www.android.com/";
        String wikipediaurl="https://fr.wikipedia.org/wiki/Wikip%C3%A9dia:Accueil_principal";
        Intent i =new Intent(Intent.ACTION_VIEW);

        firstImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.setData(Uri.parse(wikipediaurl));
                startActivity(i);
            }
        });
// second image
        secondImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.setData(Uri.parse(googleurl));
                startActivity(i);

            }
        });
// third image
        thirdImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.setData(Uri.parse(androidurl));
                startActivity(i);

            }
        });
    }
}