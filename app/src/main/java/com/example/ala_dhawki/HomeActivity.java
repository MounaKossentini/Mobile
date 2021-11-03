package com.example.ala_dhawki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    private ImageView stickerview;
    private ImageView stickerviewback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        stickerview = (ImageView) findViewById(R.id.imageView27);
        stickerviewback= (ImageView) findViewById(R.id.imageView31);
        stickerview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, StickerActivity.class);
                startActivity(intent);
            }
        });
        stickerviewback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, SigninActivity2.class);
                startActivity(intent);
            }
        });
    }

}