package com.example.ala_dhawki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BestSellersActivity extends AppCompatActivity {

    private ImageView stickerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        stickerview = (ImageView) findViewById(R.id.imageView9);
        stickerview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BestSellersActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}