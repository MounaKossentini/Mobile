package com.example.ala_dhawki;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CategoryActivity extends AppCompatActivity {

    BottomNavigationView navigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setSelectedItemId(R.id.favoris);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(CategoryActivity.this, HomeActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.favoris:
                        //fragment = new HomeActivity();
                        startActivity(new Intent(CategoryActivity.this, CategoryActivity.class));
                        overridePendingTransition(0,0);
                        return true;


                    case R.id.order:
                        startActivity(new Intent(CategoryActivity.this, OrderActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.profile:
                        startActivity(new Intent(CategoryActivity.this, ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                // getSupportFragmentManager().beginTransaction().replace(R.id.body_container,fragment).commit();


                return true;
            }
        });
    }

}