package com.example.smpn15smg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText username = (EditText) findViewById(R.id.username);
        EditText email = (EditText) findViewById(R.id.email);
        EditText NumberPhone = (EditText) findViewById(R.id.number);
        EditText Password = (EditText) findViewById(R.id.password);
        EditText password_confirmation = (EditText) findViewById(R.id.pw_confirm);

        Button btnregister = (Button) findViewById(R.id.btnregister);
        Button btnLogin = (Button)findViewById(R.id.btnlogin);

        btnLogin.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "LOGIN",
                    Toast.LENGTH_SHORT).show();

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username1 = username.getText().toString();
                Toast.makeText(register.this, "Username is"+username1, Toast.LENGTH_SHORT).show();
            }
        });

        });
    }
    }
