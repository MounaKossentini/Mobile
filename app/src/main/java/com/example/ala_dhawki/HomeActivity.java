package com.example.ala_dhawki;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends  AppCompatActivity  {


  private ImageView stickerview;
    private ImageView stickerviewback;
    BottomNavigationView navigationView;
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
        navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(HomeActivity.this, HomeActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.favoris:
                        //fragment = new HomeActivity();
                        startActivity(new Intent(HomeActivity.this, CategoryActivity.class));
                        overridePendingTransition(0,0);
                        return true;


                    case R.id.order:
                        startActivity(new Intent(HomeActivity.this, OrderActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.profile:
                        startActivity(new Intent(HomeActivity.this, ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                // getSupportFragmentManager().beginTransaction().replace(R.id.body_container,fragment).commit();


                return true;
            }
        });
    }

}