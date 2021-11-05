package com.example.ala_dhawki;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class StickerActivity extends AppCompatActivity {

    private ImageView stickerview;
    BottomNavigationView navigationView;
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
        navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(StickerActivity.this, HomeActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.favoris:
                        //fragment = new HomeActivity();
                        startActivity(new Intent(StickerActivity.this, CategoryActivity.class));
                        overridePendingTransition(0,0);
                        return true;


                    case R.id.order:
                        startActivity(new Intent(StickerActivity.this, OrderActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.profile:

                        startActivity(new Intent(StickerActivity.this, ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                // getSupportFragmentManager().beginTransaction().replace(R.id.body_container,fragment).commit();


                return true;
            }
        });
    }
}