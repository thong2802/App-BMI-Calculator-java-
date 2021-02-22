package com.example.bmicalculator;

import android.annotation.SuppressLint;
import android.app.DirectAction;
import android.content.Intent;
import android.media.TimedText;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class InformationActivity extends AppCompatActivity {
    Button calculator;
    EditText inputweight;
    EditText inputheight;



    @SuppressLint("ResourceType")
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.information_activitymain);
        Anhxa();

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   calculatorBmi();
                // nạp Class ResultActivity vào intent.
                // Đối thứ nhất là context của Activity hiện tại, đối thứ hai là tên Class chứa Activity sẽ được gọi
                Intent intent = new Intent(InformationActivity.this, ResultActivity.class );
                String weight = inputweight.getText().toString();
                String height = inputheight.getText().toString();

                float weightvalue = Float.parseFloat(weight);
                float heightvalue = Float.parseFloat(height) / 100;

                // Truyền dữ liệu giữa hai Activity ta sử dụng đối tượng Bundle để chứa các dữ liệu.
                // Các bạn hiểu Intent là người đưa thư còn Bundle là thùng chứa các lá thư

                Bundle bundle = new Bundle();
                bundle.putFloat("weight", weightvalue);
                bundle.putFloat("height", heightvalue);

                // Đưa thùng chứa Bundle cho người đưa thư Intent, trong đó GoiTin là tên của thùng chứa
                intent.putExtra("GoiTin", bundle);

                // gọi activity.
                startActivity(intent);

            }
        });

    }


    public void Anhxa(){
       calculator = (Button)findViewById(R.id.calculator);
       inputweight = (EditText)findViewById(R.id.inputweight);
       inputheight = (EditText)findViewById(R.id.inputheight);

    }
}
