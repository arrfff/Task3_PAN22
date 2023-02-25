package com.example.yolo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {
    Button bt1;
    EditText etEmail, etPassword;
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        etEmail = findViewById(R.id.email);
        etPassword = findViewById(R.id.password);
        bt1 = findViewById(R.id.btn1);


            bt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    email = etEmail.getText().toString().trim();
                    password = etPassword.getText().toString().trim();

                    if(email.isEmpty()){
                        etEmail.setError("Email kosong masseh");
                        etEmail.requestFocus();
                        return;
                    }

                    if(password.isEmpty()){
                        etPassword.setError("passwodnya jan lupa");
                        etPassword.requestFocus();
                        return;
                    }


                    if (email.equals("netclub") && password.equals("netclubpan2022")) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        finish();
                    }else{
                        Toast.makeText(LoginScreen.this, "email atau password salah", Toast.LENGTH_SHORT).show();
                    }
//                if(email.equal)
//                startActivity(new Intent(getApplicationContext(), MainActivity.class));
//                finish();
                }
            });
        }
    }
