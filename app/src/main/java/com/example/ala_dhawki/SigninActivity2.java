package com.example.ala_dhawki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.EditText;

public class SigninActivity2 extends AppCompatActivity {

    private Button connect;
    private Button signup;
    private Button signin;

    private EditText email;
    private EditText password;


    private String sEmail;
    private String sPassword;

    private SharedPreferences sp;
    public static final String SHARED_STRING="Ala_Dhawki";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        sp = getSharedPreferences(SHARED_STRING,MODE_PRIVATE);

        email = findViewById(R.id.email1);
        password = findViewById(R.id.password1);

        connect = (Button) findViewById(R.id.button3);

        sEmail = sp.getString("Email","");
        email.setText(sEmail);


        sPassword = sp.getString("Password","");
        password.setText(sPassword);

       /* sEmail = sp.getString(sEmail,"");
        email.setText(sp.getString(sEmail,""));*/
       // password.setText(sp.getString(sPassword,""));

        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SigninActivity2.this, BestSellersActivity.class);
                startActivity(intent);

                Toast.makeText(SigninActivity2.this,"User connected", Toast.LENGTH_SHORT).show();
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