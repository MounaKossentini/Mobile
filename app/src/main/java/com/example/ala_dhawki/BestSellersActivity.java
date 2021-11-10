package com.example.ala_dhawki;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.ala_dhawki.Model.Product;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class BestSellersActivity extends AppCompatActivity {
    private List<Product> p = new ArrayList<>();
    private RecyclerView RecyclerView;
    private ImageView stickerview;
    private ImageView stickerview2;
    /* private ImageView home;
     private ImageView profile;
     private ImageView order;
 */
    BottomNavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        p.add(new Product(1,"30","Stickers",R.drawable.plan_de_travail__38,"","Ceries"));
        p.add(new Product(2,"35","Bullet",R.drawable.plan_de_travail__25,"",""));
        p.add(new Product(3,"20","weeding",R.drawable.plan_de_travail__22,"",""));
        p.add(new Product(4,"10","Stickers",R.drawable.plan_de_travail__23,"",""));
        p.add(new Product(5,"20","weeding",R.drawable.plan_de_travail__22,"",""));
        p.add(new Product(6,"10","Stickers",R.drawable.plan_de_travail__23,"",""));

        RecyclerView =  findViewById(R.id.RecycleView);
        RecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        RecyclerView.setAdapter(new Myadapter(this, p));
        stickerview = (ImageView) findViewById(R.id.imageView9);
        stickerview2 = (ImageView) findViewById(R.id.imageView5);

        stickerview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BestSellersActivity.this, CategoryActivity.class);
                startActivity(intent);
            }
        });


        stickerview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BestSellersActivity.this, CategoryActivity.class);
                startActivity(intent);
            }
        });

        // getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        navigationView = findViewById(R.id.bottom_navigation);
        // getSupportFragmentManager().beginTransaction().replace(R.id.body_container, new HomeActivity()).commit();

        navigationView.setSelectedItemId(R.id.home);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.home:
                        return true;
                    case R.id.favoris:
                        //fragment = new HomeActivity();
                        startActivity(new Intent(BestSellersActivity.this, FaActivity.class));
                        overridePendingTransition(0,0);
                        return true;


                    case R.id.order:
                        startActivity(new Intent(BestSellersActivity.this, OrderActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.profile:
                        startActivity(new Intent(BestSellersActivity.this, ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                // getSupportFragmentManager().beginTransaction().replace(R.id.body_container,fragment).commit();


                return true;
            }
        });

     /*
        home = (ImageView) findViewById(R.id.imageView37);
        profile = (ImageView) findViewById(R.id.imageView30);
        order = (ImageView) findViewById(R.id.imageView33);*/

        /*getSupportFragmentManager()
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


        });*/
    }
}

