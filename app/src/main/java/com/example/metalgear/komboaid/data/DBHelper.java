package com.example.metalgear.komboaid.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.metalgear.komboaid.models.Note;

/**
 * Created by Metal Gear on 1/24/2017.
 */

public class DBHelper extends SQLiteOpenHelper{
    //version number to upgrade database version
    //each time if you Add, Edit table, you need to change the
    //version number.
    private static final int DATABASE_VERSION = 4;

    // Database Name
    private static final String DATABASE_NAME = "crud.db";

    public DBHelper(Context context ) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //All necessary tables you like to create will create here

        String CREATE_TABLE_NOTE = "CREATE TABLE " + Note.TABLE  + "("
                + Note.KEY_ID  + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
                + Note.KEY_title + " TEXT, "
                + Note.KEY_content + " TEXT )";

        db.execSQL(CREATE_TABLE_NOTE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed, all data will be gone!!!
        db.execSQL("DROP TABLE IF EXISTS " + Note.TABLE);

        // Create tables again
        onCreate(db);

    }
}
