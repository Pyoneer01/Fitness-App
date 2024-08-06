package com.example.appmarvelworkshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView caloriesTextView;
        TextView waterTextView;
        TextView stepsTextView;
        TextView exerciseTextView;
        TextView sleepTextView;

        Intent intent = getIntent();
        double bmi = intent.getDoubleExtra("bmi", 0.0);
        TextView bmiTextView = (TextView) findViewById(R.id.bmiOutput);
        bmiTextView.setText(String.valueOf(bmi));

        caloriesTextView = (TextView) findViewById(R.id.caloriesTextView);
        waterTextView = (TextView) findViewById(R.id.waterTextView);
        stepsTextView = (TextView) findViewById(R.id.stepsTextView);
        exerciseTextView = (TextView) findViewById(R.id.exerciseTextView);
        sleepTextView = (TextView) findViewById(R.id.sleepTextView);

        int calorieThreshold = 2000;
        int waterThreshold = 8;
        int stepThreshold = 8000;
        int exerciseTimeThreshold = 30;
        int sleepTimeThreshold = 7;

        int dailyCalories = 2500;
        int dailyWaterIntake = 6;
        int dailySteps = 9000;
        int exerciseTimeMinutes = 90;
        int sleepTimeHours = 6;

        if (dailyCalories > calorieThreshold) {
            caloriesTextView.setText("Calorie goal attained");
        } else {
            caloriesTextView.setText("Calorie count low");
        }

        if (dailyWaterIntake < waterThreshold) {
            waterTextView.setText("Water intake low");
        } else {
            waterTextView.setText("Water goal attained");
        }

        if (dailySteps >= stepThreshold) {
            stepsTextView.setText("Steps goal attained");
        } else {
            stepsTextView.setText("Steps count low");
        }

        if (exerciseTimeMinutes >= exerciseTimeThreshold) {
            exerciseTextView.setText("Exercise goals attained");
        } else {
            exerciseTextView.setText("Exercise time low");
        }

        if (sleepTimeHours >= sleepTimeThreshold) {
            sleepTextView.setText("Sleep goal attained");
        } else {
            sleepTextView.setText("Sleep time low");
        }
    }
}
