package com.example.ala_dhawki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SigninActivity2 extends AppCompatActivity {

    private Button connect;
    private Button signup;
    private Button signin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        connect = (Button) findViewById(R.id.button3);

        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SigninActivity2.this, BestSellersActivity.class);
                startActivity(intent);
            }
        });

        signin = (Button) findViewById(R.id.button2);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SigninActivity2.this, SigninActivity2.class);
                startActivity(intent);
            }
        });

        signup = (Button) findViewById(R.id.button);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SigninActivity2.this, SignupActivity.class);
                startActivity(intent);
            }
        });
    }
}