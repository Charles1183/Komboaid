package com.example.metalgear.komboaid.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.metalgear.komboaid.R;

public class Games extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button notesButton = (Button) findViewById(R.id.notes_button);
        final Button sf5Button = (Button) findViewById(R.id.sf5_button);


        notesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Games.this, NoteMain.class);
                startActivity(intent);
                finish();
            }
        });
        sf5Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Games.this, StreetFighterV.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
