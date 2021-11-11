package com.example.ala_dhawki;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.ala_dhawki.Database.AppDatabase;
import com.example.ala_dhawki.Model.Checkout;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CheckoutActivity extends AppCompatActivity {
   private ImageView checkout;
    private AppDatabase databasa;
    private EditText email;
    private EditText phone;
    private EditText card;
    private EditText code;
    private EditText date;
    private EditText city;

    BottomNavigationView navigationView;

    private String sEmail;
    private String sPhone;

    private SharedPreferences sp;
    public static final String SHARED_STRING="Ala_Dhawki";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        databasa = AppDatabase.getAppDatabase(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkout);

        sp = getSharedPreferences(SHARED_STRING, MODE_PRIVATE);

        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        card = findViewById(R.id.card);
        code = findViewById(R.id.code);
        city = findViewById(R.id.city);

        checkout = findViewById(R.id.checkout);

        sEmail = sp.getString("Email", "");
        email.setText(sEmail);


        sPhone = sp.getString("Phone", "");
        phone.setText(sPhone);

        checkout.setOnClickListener(view -> {
            databasa.ChechoutInterface().addCheckout(new Checkout(email.getText().toString(), Integer.parseInt(phone.getText().toString()), Integer.parseInt(card.getText().toString()), city.getText().toString(), Integer.parseInt(code.getText().toString())));

            Toast.makeText(CheckoutActivity.this, "Call you soon", Toast.LENGTH_SHORT).show();
        });


        navigationView = findViewById(R.id.bottom_navigation);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(CheckoutActivity.this, BestSellersActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.favoris:
                        //fragment = new HomeActivity();
                        startActivity(new Intent(CheckoutActivity.this, FaActivity.class));
                        overridePendingTransition(0, 0);
                        return true;


                    case R.id.order:
                        startActivity(new Intent(CheckoutActivity.this, OrderActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.profile:
                        startActivity(new Intent(CheckoutActivity.this, ProfileActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                }
                // getSupportFragmentManager().beginTransaction().replace(R.id.body_container,fragment).commit();


                return true;
            }
        });
    }
}