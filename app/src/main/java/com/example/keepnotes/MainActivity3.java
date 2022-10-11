package com.example.keepnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    private ImageView view1;
    private ImageView view2;
    private ImageView view3;
    private ImageView view4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        view1=findViewById(R.id.view3);
        view2=findViewById(R.id.view8);
        view3=findViewById(R.id.view7);
        view4=findViewById(R.id.view6);


        View.OnClickListener listener = view -> {
            startActivity(new Intent(MainActivity3.this, MainActivity4.class));
            finish();
        };
        view1.setOnClickListener(listener);
        view2.setOnClickListener(listener);
        view3.setOnClickListener(listener);
        view4.setOnClickListener(listener);

    }
    }
