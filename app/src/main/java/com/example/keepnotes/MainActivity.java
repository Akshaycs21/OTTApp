package com.example.keepnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nextPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextPage=findViewById(R.id.nextPage);
        Button loginButton = findViewById(R.id.loginButton);
        nextPage.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,MainActivity2.class));
            finish();
        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(loginIntent);
            }
        });

    }
}