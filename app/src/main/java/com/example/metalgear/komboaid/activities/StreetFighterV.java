package com.example.metalgear.komboaid.activities;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.metalgear.komboaid.R;
import com.example.metalgear.komboaid.fragments.SfvCharactersFragment;
import com.example.metalgear.komboaid.fragments.SfvTierListFragment;

public class StreetFighterV extends AppCompatActivity{


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), Games.class);
        startActivityForResult(myIntent, 0);
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_street_fighter_v);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Intent intent = new Intent(StreetFighterV.this, Games.class);
                startActivity(intent);
                finish();
            }
        });

        final TextView tableTitle = (TextView)findViewById(R.id.table_title);
        tableTitle.setBackgroundColor(Color.DKGRAY);
        tableTitle.setTextColor(Color.WHITE);
        tableTitle.setTypeface(Typeface.SANS_SERIF);
        tableTitle.setTextSize(16);
        tableTitle.setPadding(10,10,15,10);
        tableTitle.setGravity(Gravity.CENTER);

        final Button tierButton = (Button) findViewById(R.id.tier_button);
        final Button matchUpButton = (Button) findViewById(R.id.match_up_button);



        tierButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                SfvTierListFragment sfvTierListFragment = new SfvTierListFragment();
                fragmentTransaction.replace(R.id.table_content, sfvTierListFragment);
                fragmentTransaction.commit();

                //loadedTable = "Street Fighter V Tier List";

                tableTitle.setText("Street Fighter V Tier List");


            }
        });

        matchUpButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                SfvCharactersFragment sfvCharactersFragment = new SfvCharactersFragment();
                fragmentTransaction.replace(R.id.table_content, sfvCharactersFragment);
                fragmentTransaction.commit();

                //loadedTable = "Street Fighter V Tier List";
                //tableTitle.setBackgroundColor(Color.DKGRAY);
                //tableTitle.setTextColor(Color.WHITE);
                // tableTitle.setTypeface(Typeface.SANS_SERIF);
                //tableTitle.setTextSize(16);
                // tableTitle.setPadding(10,10,15,10);
                // tableTitle.setGravity(Gravity.CENTER);
                tableTitle.setText("Match-up Data By Character");


            }
        });

    }

}
