package com.example.medtub2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddMedecinActivity extends AppCompatActivity {
    EditText nom_input, prenom_input, poste_input, telephone_input, hopital_input;
    TextView ajouter_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medecin);

        nom_input = findViewById(R.id.MedecinNom);
        prenom_input = findViewById(R.id.MedecinPrenom);
        poste_input = findViewById(R.id.MedecinPoste);
        telephone_input = findViewById(R.id.MedecinTelephone);
        hopital_input = findViewById(R.id.MedecinHopital);
        ajouter_button = findViewById(R.id.ajouterMedecin);

        ajouter_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddMedecinActivity.this);
                myDB.addMedecin(nom_input.getText().toString().trim(),
                        prenom_input.getText().toString().trim(),
                        poste_input.getText().toString().trim(),
                        telephone_input.getText().toString().trim(),
                        hopital_input.getText().toString().trim());
            }
        });
    }

    public void onClick(View view) {
        MyDatabaseHelper myDB = new MyDatabaseHelper(AddMedecinActivity.this);
        myDB.addMedecin(nom_input.getText().toString().trim(),
                prenom_input.getText().toString().trim(),
                poste_input.getText().toString().trim(),
                telephone_input.getText().toString().trim(),
                hopital_input.getText().toString().trim());
    }
}