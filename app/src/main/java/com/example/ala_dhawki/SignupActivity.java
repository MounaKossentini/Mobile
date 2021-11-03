package com.example.ala_dhawki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignupActivity extends AppCompatActivity {

    private Button register;
    private Button signup;
    private Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        register = (Button) findViewById(R.id.button3);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, SigninActivity2.class);
                startActivity(intent);
            }
        });

        signin = (Button) findViewById(R.id.button2);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, SigninActivity2.class);
                startActivity(intent);
            }
        });

        signup = (Button) findViewById(R.id.button);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

    }
}