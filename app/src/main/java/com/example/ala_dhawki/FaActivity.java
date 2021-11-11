package com.example.ala_dhawki;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ala_dhawki.Database.AppDatabase;
import com.example.ala_dhawki.Model.Favoris;
import com.example.ala_dhawki.Model.Product;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class FaActivity extends AppCompatActivity {
    private  AppDatabase databasa;
    BottomNavigationView navigationView;
    private RecyclerView RecyclerView;
    private List<Favoris> favorises= new ArrayList<>();


    private ImageView picture;
    private TextView name;
    private TextView price;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.favoris);
        databasa =AppDatabase.getAppDatabase(this);




       favorises = databasa.FavorisInterface().getAllfavoris();


        RecyclerView =  findViewById(R.id.RecycleView);
        RecyclerView.setLayoutManager(new GridLayoutManager(this,1));
        RecyclerView.setAdapter(new Myadapter2(this,favorises));






        //menu
        navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setSelectedItemId(R.id.favoris);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(FaActivity.this, BestSellersActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.favoris:
                        //fragment = new HomeActivity();

                              return true;

                    case R.id.order:

                        startActivity(new Intent(FaActivity.this, OrderActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.profile:
                        startActivity(new Intent(FaActivity.this, ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                // getSupportFragmentManager().beginTransaction().replace(R.id.body_container,fragment).commit();


                return true;
            }
        });
    }
}