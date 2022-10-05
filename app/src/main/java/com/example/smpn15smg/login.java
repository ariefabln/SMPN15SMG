package com.example.smpn15smg;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btnLogin;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText username = (EditText) findViewById(R.id.username);
        EditText Password = (EditText) findViewById(R.id.password);

        btnLogin = (Button)findViewById(R.id.btnlogin);

        btnLogin.setOnClickListener(v -> {

                Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                        Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(login.this, MainActivity.class);
                login.this.startActivity(intent);
                finish();

            });
}
}