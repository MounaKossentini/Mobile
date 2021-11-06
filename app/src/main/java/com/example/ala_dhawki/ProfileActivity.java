package com.example.ala_dhawki;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.net.Uri;
import android.widget.EditText;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Toast;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.content.SharedPreferences;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity {


    BottomNavigationView navigationView;


    private TextView name;
    private ImageView picture;
    private TextView logout;

    private String sName;
    private String sPicture;


    private SharedPreferences sp;
    public static final String SHARED_STRING="Ala_Dhawki";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        name =  findViewById(R.id.name);
        picture = findViewById(R.id.picture);
        logout = findViewById(R.id.logout);
        sp = getSharedPreferences(SHARED_STRING,MODE_PRIVATE);

        sName = sp.getString("Firstname","");
        name.setText(sName);


        sPicture = sp.getString("Picture","");
        picture.setImageURI(Uri.parse(sp.getString(sPicture,"")));




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
                        startActivity(new Intent(ProfileActivity.this, HomeActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.favoris:
                        //fragment = new HomeActivity();
                        startActivity(new Intent(ProfileActivity.this, CategoryActivity.class));
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