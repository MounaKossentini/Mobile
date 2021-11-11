package com.example.ala_dhawki;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.net.Uri;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.os.Bundle;
import android.view.MenuItem;
import android.content.SharedPreferences;
import android.widget.TextView;

import com.example.ala_dhawki.Database.AppDatabase;
import com.example.ala_dhawki.Model.DataConverter;
import com.example.ala_dhawki.Model.Order;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {
    private AppDatabase databasa;

    BottomNavigationView navigationView;


    private TextView name;
    private TextView number;
    private ImageView picture;
    private TextView order;
    private TextView favoris;
    private TextView logout;

    private String sName;
    private String sPicture;

    private List<Order> orders= new ArrayList<>();



    private SharedPreferences sp;
    public static final String SHARED_STRING="Ala_Dhawki";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        databasa =AppDatabase.getAppDatabase(this);

        name =  findViewById(R.id.name);
        order =  findViewById(R.id.order);
        favoris =  findViewById(R.id.favoris);
        number =  findViewById(R.id.number);
        picture = findViewById(R.id.picture);
        logout = findViewById(R.id.logout);
        sp = getSharedPreferences(SHARED_STRING,MODE_PRIVATE);

        sName = sp.getString("Firstname","");
        name.setText(sName);

        orders = databasa.OrderInterface().getAllOrder();

        number.setText(String.valueOf(orders.size()));
       // sPicture =  sp.getString("Picture","");
        //sPicture.getBytes(StandardCharsets.UTF_8).toString();
       //  picture.setImageURI(Uri.parse(sp.getString(sPicture,"")));
order.setOnClickListener(view -> {

        Intent intent = new Intent(ProfileActivity.this, OrderActivity.class);
        startActivity(intent);
});

        favoris.setOnClickListener(view -> {

            Intent intent = new Intent(ProfileActivity.this, FaActivity.class);
            startActivity(intent);
        });


        logout.setOnClickListener(view -> {
            SharedPreferences.Editor editor = sp.edit();
            editor.clear();
            editor.commit();
            finish();


            Intent intent = new Intent(ProfileActivity.this, SigninActivity2.class);
            startActivity(intent);

            Toast.makeText(ProfileActivity.this,"Logout succssed!", Toast.LENGTH_SHORT).show();
        });








        navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setSelectedItemId(R.id.profile);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(ProfileActivity.this, BestSellersActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.favoris:
                        //fragment = new HomeActivity();
                        startActivity(new Intent(ProfileActivity.this, FaActivity.class));
                        overridePendingTransition(0,0);
                        return true;


                    case R.id.order:
                        startActivity(new Intent(ProfileActivity.this, OrderActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.profile:

                        return true;

                }
                // getSupportFragmentManager().beginTransaction().replace(R.id.body_container,fragment).commit();


                return true;
            }
        });
    }
}