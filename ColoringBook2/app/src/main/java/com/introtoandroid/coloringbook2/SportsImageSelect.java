package com.introtoandroid.coloringbook2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SportsImageSelect extends AppCompatActivity {

    ImageView logo;
    ImageView mascot;
    Button backBTN;

    private int imgId;

    private int RESPONSE_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sports_image_select);

        final Intent intent = new Intent();

        logo = findViewById(R.id.cofcLogo);
        mascot = findViewById(R.id.cofcMascot);
        backBTN = findViewById(R.id.backButton);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgId = R.drawable.cofclogo;

                intent.putExtra("imgId", imgId);
                setResult(RESPONSE_CODE, intent);
                finish();
            }
        });

        mascot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgId = R.drawable.cofcmascot;

                intent.putExtra("imgId", imgId);
                setResult(RESPONSE_CODE, intent);
                finish();
            }
        });
    }
}
