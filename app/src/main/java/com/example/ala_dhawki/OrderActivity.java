package com.example.ala_dhawki;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ala_dhawki.Database.AppDatabase;
import com.example.ala_dhawki.Model.Favoris;
import com.example.ala_dhawki.Model.Order;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class OrderActivity extends AppCompatActivity {
    private AppDatabase databasa;
    BottomNavigationView navigationView;
    private RecyclerView RecyclerView;
    private TextView totale;
    private List<Order> orders= new ArrayList<>();
    private ImageView checkout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);
        databasa =AppDatabase.getAppDatabase(this);
        totale = findViewById(R.id.totale);
        checkout = findViewById(R.id.checkout);


        totale.setText(String.valueOf(databasa.OrderInterface().CalculTotale()));

        orders = databasa.OrderInterface().getAllOrder();
        /*orders.add(new  Order(1,"",10,R.drawable.plan_de_travail__31,""));
        orders.add(new  Order(2,"",20,R.drawable.plan_de_travail__31,""));*/

        RecyclerView =  findViewById(R.id.RecyclerView);
        RecyclerView.setLayoutManager(new GridLayoutManager(this,1));
        RecyclerView.setAdapter(new Myadapter3(this,orders));

        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OrderActivity.this, CheckoutActivity.class);
                startActivity(intent);
            }
        });




        //menu
        navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setSelectedItemId(R.id.order);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(OrderActivity.this, BestSellersActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.favoris:
                        //fragment = new HomeActivity();
                        startActivity(new Intent(OrderActivity.this, FaActivity.class));
                        overridePendingTransition(0,0);
                        return true;


                    case R.id.order:

                        return true;

                    case R.id.profile:
                        startActivity(new Intent(OrderActivity.this, ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                // getSupportFragmentManager().beginTransaction().replace(R.id.body_container,fragment).commit();


                return true;
            }
        });
    }
}