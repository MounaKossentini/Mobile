package com.example.ala_dhawki;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ala_dhawki.Database.AppDatabase;
import com.example.ala_dhawki.Model.Favoris;
import com.example.ala_dhawki.Model.Order;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

public class DetailsDabdoub extends AppCompatActivity {
    private List<Favoris> favorises ;
    private List<Order> orders ;
    private ImageView stickerview;
    private  AppDatabase databasa;
    private ImageView favoris;
    private ImageView order;
    private ImageView test;
    private ImageView picture;
    private TextView price;
    private TextView description;
    private TextView name;
    private Favoris f;
    private Order o;


    BottomNavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail2);

        picture = findViewById(R.id.picture);
        name = findViewById(R.id.name);
        price = findViewById(R.id.price);
        description = findViewById(R.id.description);
/*
        name.setText(getIntent().getStringExtra("name"));
        price.setText(getIntent().getStringExtra("price"));
        picture.setBackgroundResource(getIntent().getIntExtra("picture",0));


*/
        order = (ImageView) findViewById(R.id.order);
        favoris = (ImageView) findViewById(R.id.favoris);

        databasa =AppDatabase.getAppDatabase(this);


        favoris.setOnClickListener(view -> {

            f= new Favoris(2,price.getText().toString(),R.drawable.groupe_1940,description.getText().toString(),name.getText().toString());
            databasa.FavorisInterface().addFavoris(f);
            Toast.makeText(DetailsDabdoub.this,"favoris saved", Toast.LENGTH_SHORT).show();
        });



        order.setOnClickListener(view -> {

            databasa.OrderInterface().addOrder( new Order(name.getText().toString(),Integer.parseInt(price.getText().toString()),R.drawable.groupe_1940,description.getText().toString()));
            /*orders.add(new  Order(1,"",10,R.drawable.plan_de_travail__31,""));*/
            Toast.makeText(DetailsDabdoub.this,"product saved", Toast.LENGTH_SHORT).show();
        });








        //menu
        navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(DetailsDabdoub.this, BestSellersActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.favoris:
                        //fragment = new HomeActivity();
                        startActivity(new Intent(DetailsDabdoub.this, FaActivity.class));
                        overridePendingTransition(0,0);
                        return true;


                    case R.id.order:
                        startActivity(new Intent(DetailsDabdoub.this, OrderActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.profile:
                        startActivity(new Intent(DetailsDabdoub.this, ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                // getSupportFragmentManager().beginTransaction().replace(R.id.body_container,fragment).commit();


                return true;
            }
        });
    }
}