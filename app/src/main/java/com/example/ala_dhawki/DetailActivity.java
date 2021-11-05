package com.example.ala_dhawki;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DetailActivity extends AppCompatActivity {

    private ImageView stickerview;
    BottomNavigationView navigationView;
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

        navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(DetailActivity.this, HomeActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.favoris:
                        //fragment = new HomeActivity();
                        startActivity(new Intent(DetailActivity.this, CategoryActivity.class));
                        overridePendingTransition(0,0);
                        return true;


                    case R.id.order:
                        startActivity(new Intent(DetailActivity.this, OrderActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.profile:
                        startActivity(new Intent(DetailActivity.this, ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                // getSupportFragmentManager().beginTransaction().replace(R.id.body_container,fragment).commit();


                return true;
            }
        });
    }
}