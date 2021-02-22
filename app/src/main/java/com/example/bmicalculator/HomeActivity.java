package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class HomeActivity extends AppCompatActivity {
    LottieAnimationView maleavatar;
    LottieAnimationView femaleavatar;
    LottieAnimationView otheravatar;
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.homeactivitymain);

        Anhxa();

        maleavatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(HomeActivity.this, InformationActivity.class);
                startActivity(intent);
            }
        });


        femaleavatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(HomeActivity.this, InformationActivity.class);
                startActivity(intent);
            }
        });

        otheravatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, InformationActivity.class);
                startActivity(intent);
            }
        });
    }
    public void Anhxa(){
        maleavatar = (LottieAnimationView) findViewById(R.id.maleavatar);
        femaleavatar = (LottieAnimationView) findViewById(R.id.Female_avatar);
        otheravatar = (LottieAnimationView) findViewById(R.id.othersavatar);
    }
}
