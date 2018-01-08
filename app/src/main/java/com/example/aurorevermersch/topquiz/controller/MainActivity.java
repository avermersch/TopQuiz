package com.example.aurorevermersch.topquiz.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.aurorevermersch.topquiz.R;

public class MainActivity extends AppCompatActivity {

    //Déclaration des variables
    private TextView mGreetingText;
    private EditText mNameInput;
    private Button mPlayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Référencement des éléments graphiques dans la méthode onCreate
        mGreetingText = (TextView) findViewById(R.id.activity_main_greeting_txt);
        mNameInput = (EditText) findViewById(R.id.activity_main_name_input);
        mPlayButton = (Button) findViewById(R.id.activity_main_play_btn);

        //Désactivation du bouton de démarrage tant que l'utilisateur n'a pas saisi son prénom
        mPlayButton.setEnabled(false);

        mNameInput.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override

            //L'utilisateur saisie son texte
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //si au moins une lettre est saisie alors le bouton s'active
                mPlayButton.setEnabled(s.toString().length() != 0);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //Détecte que l'utilisateur a cliqué sur le bouton(implémentation du listener)
        mPlayButton.setOnClickListener(new View.OnClickListener(){

            @Override

            // Lire le click de l'utilisateur
            public void onClick(View v) {

                //Lancement d'une nouvelle activité
                Intent gameActivity = new Intent(MainActivity.this, GameActivity.class);
                startActivity(gameActivity);

            }

        });
    }
}
