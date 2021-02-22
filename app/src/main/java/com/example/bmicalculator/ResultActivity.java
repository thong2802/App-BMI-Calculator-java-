package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

import java.text.DecimalFormat;

public class ResultActivity extends AppCompatActivity {
    LottieAnimationView back;
    TextView textresuts;
    TextView textbmiresult;
    String calculation, Bmiresult;
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.resultbmi);
        Anhxa();
        // Lấy intent của Activity này
        Intent intent = getIntent();
        // lấy thùng chứa Bundle với tên giao dịch là "GoiTin"
        Bundle bundle = intent.getBundleExtra("GoiTin");

        // lấy giá trị
        float weightvalue = bundle.getFloat("weight");
        // lấy giá trị
        float heightvalue = bundle.getFloat("height");

        DecimalFormat df = new DecimalFormat("0.0");
        float bmi = (weightvalue / (heightvalue * heightvalue));
        String str = df.format(bmi);

        if (bmi  < 16 ) {
            Bmiresult = "You need to gain weight urgently";
        } else if (bmi < 18.5 ) {
            Bmiresult = "UnderWeight";
        } else  if (bmi >= 18.5 && bmi <= 24.9) {
            Bmiresult = "Normal";
        }else if (bmi >= 25 && bmi <= 40) {
            Bmiresult = "Overweight";
        }
        calculation = "" + str + "\n";
        textresuts.setText(calculation);
        textbmiresult.setText(Bmiresult);


        // back
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ResultActivity.this, HomeActivity.class);
                startActivity(intent1);

            }
        });


    }


    public void Anhxa() {
        back = (LottieAnimationView) findViewById(R.id.back);
        textresuts = (TextView) findViewById(R.id.resutlsbmi);
        textbmiresult = (TextView) findViewById(R.id.textbmiresult);
    }
}
