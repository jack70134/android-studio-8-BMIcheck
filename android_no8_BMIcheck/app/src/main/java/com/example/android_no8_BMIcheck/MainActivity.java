package com.example.android_no8_BMIcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void compute(View v){
        EditText height = (EditText)findViewById(R.id.editview1);
        EditText weight = (EditText)findViewById(R.id.editview2);
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("Height", height.getText().toString());
        bundle.putString("Weight", weight.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}