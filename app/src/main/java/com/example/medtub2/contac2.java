package com.example.medtub2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class contac2 extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton add_button;

    MyDatabaseHelper myDB;
    ArrayList<String> medecin_id, medecin_nom, medecin_prenom, medecin_poste, medecin_telephone, medecin_hopital;
    CustomAdapterMedecin customAdapterMedecin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contac2);

        recyclerView = findViewById(R.id.listeMedecin);
        add_button = findViewById(R.id.add_Button);

        myDB = new MyDatabaseHelper(contac2.this);
        medecin_id = new ArrayList<>();
        medecin_nom = new ArrayList<>();
        medecin_prenom = new ArrayList<>();
        medecin_poste = new ArrayList<>();
        medecin_telephone = new ArrayList<>();
        medecin_hopital = new ArrayList<>();

        storeDataInArrays();

        customAdapterMedecin = new CustomAdapterMedecin(contac2.this, medecin_id, medecin_nom,
                medecin_prenom, medecin_poste, medecin_telephone, medecin_hopital);
        recyclerView.setAdapter(customAdapterMedecin);
        recyclerView.setLayoutManager(new LinearLayoutManager(contac2.this));

    }

    public void onClick(View view) {
        Intent intent = new Intent(contac2.this, AddMedecinActivity.class);
        startActivity(intent);
    }

    void storeDataInArrays(){
        Cursor cursor = myDB.readAllData();
        if (cursor.getCount() == 0){
            Toast.makeText(this, "Pas de données.", Toast.LENGTH_SHORT).show();
        } else {
            while (cursor.moveToNext()){
                medecin_id.add(cursor.getString(0));
                medecin_nom.add(cursor.getString(1));
                medecin_prenom.add(cursor.getString(2));
                medecin_poste.add(cursor.getString(3));
                medecin_telephone.add(cursor.getString(4));
                medecin_hopital.add(cursor.getString(5));
            }
        }
    }

    public void onClick2(View view) {
    }

    public void onClick3(View view) {
    }
}