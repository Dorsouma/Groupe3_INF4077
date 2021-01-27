package com.example.medtub2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class exam2 extends AppCompatActivity implements View.OnClickListener{

    public RadioButton oui1, oui2, oui3, oui4, oui5, oui6, oui7;
    public int nombreOui = 0; //Entier qui compte le nombre de Oui

    public Button enreg, gps;
    public TextView consultation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam2);

        oui1 = (RadioButton) findViewById(R.id.oui1);
        oui2 = (RadioButton) findViewById(R.id.oui2);
        oui3 = (RadioButton) findViewById(R.id.oui3);
        oui4 = (RadioButton) findViewById(R.id.oui4);
        oui5 = (RadioButton) findViewById(R.id.oui5);
        oui6 = (RadioButton) findViewById(R.id.oui6);
        oui7 = (RadioButton) findViewById(R.id.oui7);

        enreg = (Button) findViewById(R.id.btn_enreg_audio);
        gps = (Button) findViewById(R.id.btn_gps);
        consultation = (TextView) findViewById(R.id.consultation);


        enreg.setOnClickListener(this);
        gps.setOnClickListener(this);
        consultation.setOnClickListener(this);
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

            case R.id.consultation:
                if (nombreOui >= 5)
                {Toast.makeText(this, "Vous ferez mieux de voir un medecin !!!", Toast.LENGTH_LONG).show();}
                else if (5 > nombreOui && nombreOui >= 3)
                {Toast.makeText(this, "Aucune alerte, soyez tout de même prudent(e) !!", Toast.LENGTH_LONG).show();}
                else if (3 > nombreOui && nombreOui >= 0)
                {Toast.makeText(this, "Tout semble aller bien, prenez soin de vous !!", Toast.LENGTH_LONG).show();}
                else {Toast.makeText(this, "Consultation non effectuée..", Toast.LENGTH_LONG).show();}
        }
    }

    public void onClickRadio(View viewRadio) {
        boolean checked = ((RadioButton) viewRadio).isChecked();

        switch (viewRadio.getId()){
            case R.id.oui1:
                if (checked) nombreOui ++;
                break;
            case R.id.oui2:
                if (checked) nombreOui ++;
                break;
            case R.id.oui3:
                if (checked) nombreOui ++;
                break;
            case R.id.oui4:
                if (checked) nombreOui ++;
                break;
            case R.id.oui5:
                if (checked) nombreOui ++;
                break;
            case R.id.oui6:
                if (checked) nombreOui ++;
                break;
            case R.id.oui7:
                if (checked) nombreOui ++;
                break;
        }
    }
}