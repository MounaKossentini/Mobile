package com.example.ala_dhawki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class StickerActivity extends AppCompatActivity {

    private ImageView stickerview;

    private ImageView detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stichers_page);
        stickerview = (ImageView) findViewById(R.id.imageView21);

        stickerview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StickerActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        detail = (ImageView) findViewById(R.id.imageView22);

        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StickerActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

    }
}