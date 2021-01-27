package com.example.medtub2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class log2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log2);
    }

    public void onClick(View view) {
        Toast.makeText(this, "Connexion ...", Toast.LENGTH_SHORT).show();
    }
}