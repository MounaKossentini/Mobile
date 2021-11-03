package com.example.ala_dhawki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    private ImageView stickerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        stickerview = (ImageView) findViewById(R.id.imageView19);

        stickerview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, BestSellersActivity.class);
                startActivity(intent);
            }
        });
    }
}