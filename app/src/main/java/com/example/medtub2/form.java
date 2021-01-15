package com.example.medtub2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class form extends AppCompatActivity implements View.OnClickListener{

    public CardView card1, card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        card1 = (CardView) findViewById(R.id.cardsign2);
        card2 = (CardView) findViewById(R.id.cardlog2);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardsign2 :
                i = new Intent(this,sign2.class);
                startActivity(i);
                break;

            case R.id.cardlog2 :
                i = new Intent(this,log2.class);
                startActivity(i);
                break;
        }

    }
}