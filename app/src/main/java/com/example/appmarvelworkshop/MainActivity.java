package com.example.appmarvelworkshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nextPg = (Button) findViewById(R.id.nextPageButton);
        TextView tv = (TextView) findViewById(R.id.nameInput);
        EditText rawHeight = (EditText) findViewById(R.id.heightInput);
        EditText rawWeight = (EditText) findViewById(R.id.weightInput);
        nextPg.setOnClickListener(v -> {
            double h = (Double.parseDouble(rawHeight.getText().toString()))/100.0;
            double w = Double.parseDouble(rawWeight.getText().toString());
            double bmi = w/(h*h);
            String userName = tv.getText().toString();
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            //Intent intent2 = new Intent(MainActivity.this, MainActivity3.class);
            intent.putExtra("message", userName);
            //intent2.putExtra("message2", "15.3");
            startActivity(intent);
            //startActivity(intent2);
        });
    }
}