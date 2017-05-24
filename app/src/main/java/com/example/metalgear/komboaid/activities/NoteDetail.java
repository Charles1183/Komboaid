package com.example.metalgear.komboaid.activities;

import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.metalgear.komboaid.R;
import com.example.metalgear.komboaid.data.NoteRepo;
import com.example.metalgear.komboaid.models.Note;

public class NoteDetail extends AppCompatActivity {

    Button btnSave , btnDelete, btnCancel;
    EditText editNoteTitle;
    EditText editNoteContent;
    private boolean saved = false;
    private int _Note_Id=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_detail);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        editNoteTitle = (EditText) findViewById(R.id.editNoteTitle);
        editNoteContent = (EditText) findViewById(R.id.editNoteContent);

        _Note_Id =0;
        Intent intent = getIntent();
        _Note_Id =intent.getIntExtra("note_Id", 0);
        NoteRepo repo = new NoteRepo(this);
        Note note = new Note();
        note = repo.getNoteById(_Note_Id);

        editNoteTitle.setText(note.title);
        editNoteContent.setText(note.content);

        btnSave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                NoteRepo repo = new NoteRepo(NoteDetail.this);
                Note note = new Note();
                note.content = editNoteContent.getText().toString();
                note.title = editNoteTitle.getText().toString();
                note.note_ID = _Note_Id;
                saved = true;

                if (_Note_Id == 0) {
                    _Note_Id = repo.insert(note);

                    Toast.makeText(NoteDetail.this, "Note Saved", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(NoteDetail.this, NoteMain.class);
                    startActivity(intent);
                    finish();

                } else {

                    repo.update(note);
                    Toast.makeText(NoteDetail.this, "Note Updated", Toast.LENGTH_LONG).show();

                    Intent objIndent = new Intent(NoteDetail.this,NoteView.class);
                    objIndent.putExtra("note_Id", _Note_Id);
                    startActivity(objIndent);
                }
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                NoteRepo repo = new NoteRepo(NoteDetail.this);
                repo.delete(_Note_Id);
                Toast.makeText(NoteDetail.this, "Note Deleted", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(NoteDetail.this, NoteMain.class);
                startActivity(intent);
                finish();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoteDetail.this, NoteMain.class);
                startActivity(intent);
                finish();

                    /*Intent objIndent = new Intent(NoteDetail.this, NoteView.class);
                    objIndent.putExtra("note_Id", _Note_Id);
                    startActivity(objIndent);*/
            }
        });
    }
}
