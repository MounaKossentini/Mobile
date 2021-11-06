package com.example.ala_dhawki;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.EditText;

import com.github.dhaval2404.imagepicker.ImagePicker;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SignupActivity extends AppCompatActivity {


    private SharedPreferences sp;
    public static final String SHARED_STRING="Ala_Dhawki";

    private Button register;
    private Button signup;
    private Button signin;
    private ImageView upload;
    private FloatingActionButton uploadbtn;


    private String sFirstname;
    private String sLastname;
    private String sPicture;
    private String sPhone;
    private String sEmail;
    private String sPassword;


    private EditText firstname;
    private EditText lastname;
    private EditText picture;
    private EditText phone;
    private EditText email;
    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        sp = getSharedPreferences(SHARED_STRING,MODE_PRIVATE);

        register = (Button) findViewById(R.id.button3);

        firstname = (EditText) findViewById(R.id.firstname);
        lastname = (EditText) findViewById(R.id.lastname);
        email = (EditText)  findViewById(R.id.email);
        password = (EditText)  findViewById(R.id.password);
        phone = (EditText) findViewById(R.id.phone);

        upload = (ImageView) findViewById(R.id.upload);
        uploadbtn = (FloatingActionButton) findViewById(R.id.uploadbtn);



        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               sFirstname = firstname.getText().toString();
                sLastname = lastname.getText().toString();
                sEmail = email.getText().toString();
                sPassword = password.getText().toString();
                sPicture = upload.toString();
                sPhone = phone.getText().toString();


                SharedPreferences.Editor editor = sp.edit();
                editor.putString("Firstname",sFirstname);
                editor.putString("Lastname",sLastname);
                editor.putString("Email",sEmail);
                editor.putString("Password",sPassword);
                editor.putString("Picture", String.valueOf(upload));
                editor.putString("Phone",sPhone);

                editor.commit();


                Intent intent = new Intent(SignupActivity.this, SigninActivity2.class);
                startActivity(intent);

                Toast.makeText(SignupActivity.this,"User saved", Toast.LENGTH_SHORT).show();

            }
        });







        uploadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImagePicker.Companion.with(SignupActivity.this)
                        .crop()
                        .cropSquare()
                        .compress(1024)
                        .maxResultSize(511, 511)
                        .start();
            }
        });



        signin = (Button) findViewById(R.id.button);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, SigninActivity2.class);
                startActivity(intent);
            }
        });

        signup = (Button) findViewById(R.id.button2);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Uri uri = data.getData();
        upload.setImageURI(uri);
    }
}
