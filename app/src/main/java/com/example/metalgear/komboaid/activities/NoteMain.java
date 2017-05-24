package com.example.metalgear.komboaid.activities;

import android.app.ListActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;


import com.example.metalgear.komboaid.R;
import com.example.metalgear.komboaid.data.NoteRepo;

import java.util.ArrayList;
import java.util.HashMap;

/* This is certainly practice for using SQLite in Android Studio which will then be used
in creating a URL ToDoList application.
App dev process:
1.SQLite db example (http://instinctcoder.com/android-studio-sqlite-database-example/)
2.Pop up add item dialog boxS
3.Button for URL links
4.Checkboxes for each item
5.Delete All Checked Items button
6.List(table) manager to view lists
7.Create and delete lists function in view manager
8.Access lists lists from view manager*/

public class NoteMain extends ListActivity{
    TextView note_Id;

    public void onLoad(){
        NoteRepo repo = new NoteRepo(this);

        ArrayList<HashMap<String, String>> noteList =  repo.getNoteList();
        if(noteList.size()!=0) {
            ListView lv = getListView();
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                    note_Id = (TextView) view.findViewById(R.id.note_Id);
                    String noteId = note_Id.getText().toString();
                    Intent objIndent = new Intent(getApplicationContext(),NoteView.class); //NoteDetail.class
                    objIndent.putExtra("note_Id", Integer.parseInt( noteId));
                    startActivity(objIndent);
                }
            });
            ListAdapter adapter = new SimpleAdapter( NoteMain.this,noteList, R.layout.view_note_entry, new String[] { "id","name"}, new int[] {R.id.note_Id, R.id.note_title});
            setListAdapter(adapter);
        }else{
            Toast.makeText(this,"No Notes!",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_main);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //Loads the list of notes in the database each time the screen is loaded
        onLoad();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoteMain.this, Games.class);
                startActivity(intent);
                finish();
            }
        });

        FloatingActionButton btnAdd = (FloatingActionButton) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoteMain.this,NoteDetail.class);
                intent.putExtra("note_Id",0);
                startActivity(intent);
            }
        });
    }
}
