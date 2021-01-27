package com.example.medtub2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class sign2 extends AppCompatActivity {

    Button btn_CaptureImage;
    ImageView imageDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign2);

        btn_CaptureImage = (Button) findViewById(R.id.btn_captureImage);
        imageDisplay = (ImageView) findViewById(R.id.imageCapture);

        btn_CaptureImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bitmap bitmap =(Bitmap)data.getExtras().get("data");
        imageDisplay.setImageBitmap(bitmap);
    }

    public void onClick(View view) {
        Toast.makeText(this, "Inscription ...", Toast.LENGTH_SHORT).show();
    }
}