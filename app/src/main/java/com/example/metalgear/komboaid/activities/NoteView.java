package com.example.metalgear.komboaid.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.metalgear.komboaid.R;
import com.example.metalgear.komboaid.data.NoteRepo;
import com.example.metalgear.komboaid.models.Note;

public class NoteView extends AppCompatActivity {

    TextView noteTitle;
    TextView noteContent;
    private int _Note_Id=0;

   @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), NoteMain.class);
        startActivityForResult(myIntent, 0);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ////////////////////////////////////////////////////////////////////////////
        noteTitle = (TextView) findViewById(R.id.note_title_view);
        noteContent = (TextView) findViewById(R.id.note_content_view);

        _Note_Id =0;
        Intent intent = getIntent();
        _Note_Id =intent.getIntExtra("note_Id", 0);
        NoteRepo repo = new NoteRepo(this);
        Note note = new Note();
        note = repo.getNoteById(_Note_Id);

        noteTitle.setText(note.title);
        noteContent.setText(note.content);
        /////////////////////////////////////////////////////////////////////////////

        FloatingActionButton fabEdit = (FloatingActionButton) findViewById(R.id.btnEdit);
        fabEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent objIndent = new Intent(NoteView.this,NoteDetail.class);
                objIndent.putExtra("note_Id", _Note_Id);
                startActivity(objIndent);
            }
        });


    }

}
