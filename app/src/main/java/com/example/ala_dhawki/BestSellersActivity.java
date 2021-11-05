package com.example.ala_dhawki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BestSellersActivity extends AppCompatActivity {

    private ImageView stickerview;
    private ImageView home;
    private ImageView profile;
    private ImageView order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        stickerview = (ImageView) findViewById(R.id.imageView9);
        home = (ImageView) findViewById(R.id.imageView37);
        profile = (ImageView) findViewById(R.id.imageView30);
        order = (ImageView) findViewById(R.id.imageView33);

        stickerview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BestSellersActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame, new HomeActivity())
                .commit();
        home.setOnClickListener(view -> {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame, new HomeActivity())
                    .commit();


        });

        profile.setOnClickListener(view -> {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame, new ProfileActivity())
                    .commit();


        });

        order.setOnClickListener(view -> {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame, new OrderActivity())
                    .commit();


        });
    }
}

