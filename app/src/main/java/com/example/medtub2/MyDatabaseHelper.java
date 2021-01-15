package com.example.medtub2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    private Context context;
    private static final String DATABASE_NAME = "ListeMedecins.db";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "MesMedecins";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_NOM = "nom_medecin";
    private static final String COLUMN_PRENOM = "prenom_medecin";
    private static final String COLUMN_POSTE = "poste_medecin";
    private static final String COLUMN_TELEPHONE = "telephone_medecin";
    private static final String COLUMN_HOPITAL = "hopital_medecin";
    // private static final String COLUMN_PHOTO = "photo_medecin";


    public MyDatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME +
                " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NOM + " TEXT, " +
                COLUMN_PRENOM + " TEXT, " +
                COLUMN_POSTE + " TEXT, " +
                COLUMN_TELEPHONE + " TEXT, " +
                COLUMN_HOPITAL + " TEXT);";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }

    void addMedecin(String nom, String prenom, String poste, String telephone, String hopital) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_NOM, nom);
        cv.put(COLUMN_PRENOM, prenom);
        cv.put(COLUMN_POSTE, poste);
        cv.put(COLUMN_TELEPHONE, telephone);
        cv.put(COLUMN_HOPITAL, hopital);
        long result = db.insert(TABLE_NAME, null, cv);
        if(result == -1) {
            Toast.makeText(context, "Echec de l'ajout", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Ajout réussi", Toast.LENGTH_SHORT).show();
        }
    }

    Cursor readAllData(){
        String query = "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = null;
        if (db != null){
           cursor = db.rawQuery(query, null);
        }
        return cursor;
    }
}
