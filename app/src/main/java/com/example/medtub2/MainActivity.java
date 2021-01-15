package com.example.medtub2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public TextView card1, card2, card3, card4;
    public ImageView card5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         card1 = (TextView) findViewById(R.id.consultation);
        card2 = (TextView) findViewById(R.id.grosBouton);
        card3 = (TextView) findViewById(R.id.envoisms);
        card4 = (TextView) findViewById(R.id.envoiappel);
        card5 = (ImageView) findViewById(R.id.faireStat);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.consultation :
                i = new Intent(this,exam2.class);
                startActivity(i);
                break;

            case R.id.grosBouton :
                i = new Intent(this,form.class);
                startActivity(i);
                break;

            case R.id.envoisms :
                i = new Intent(this,sms.class);
                startActivity(i);
                break;

            case R.id.envoiappel :
                i = new Intent(this,contac2.class);
                startActivity(i);
                break;

            case R.id.faireStat :
                i = new Intent(this,stat.class);
                startActivity(i);
                break;
        }

    }
}