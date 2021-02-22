package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;

import java.lang.annotation.Annotation;

public class MainActivity extends AppCompatActivity {
    Button letsgo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        letsgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
    public void anhxa(){
        letsgo = (Button) findViewById(R.id.letsgo);
    }
}