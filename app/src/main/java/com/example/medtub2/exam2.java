package com.example.medtub2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class exam2 extends AppCompatActivity implements View.OnClickListener{

    public Button enreg, gps;
    public TextView consultation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam2);

        enreg = (Button) findViewById(R.id.btn_enreg_audio);
        gps = (Button) findViewById(R.id.btn_gps);
        consultation = (TextView) findViewById(R.id.consultation);

        enreg.setOnClickListener(this);
        gps.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.btn_enreg_audio:
                i = new Intent(this, son.class);
                startActivity(i);
                break;
            case R.id.btn_gps:
                i = new Intent(this, gps.class);
                startActivity(i);
                break;
        }
    }

    public void onClick2(View view) {
    }
}