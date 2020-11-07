package com.example.android_no8_BMIcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        answer();
    }
    public void goback(View v){
        finish();
    }
    private void answer(){
        double height;
        double weight;
        double bmi ;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null){
            DecimalFormat nf = new DecimalFormat("0.00");
            height = Double.parseDouble(bundle.getString("Height")) / 100;
            weight = Double.parseDouble(bundle.getString("Weight"));
            bmi = weight / (height * height);
            TextView bmic = (TextView)findViewById(R.id.BMIvalue);
            bmic.setText(nf.format(bmi));
            TextView result = (TextView)findViewById(R.id.Answer);
            if (bmi < 18){
                result.setText("異常(體重過輕)");
            }
            else if (bmi > 24){
                result.setText("異常(體重過重)");
            }
            else
                result.setText("正常(體重正常)");
        }
    }
}