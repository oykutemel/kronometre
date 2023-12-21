package com.example.kronometre;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Chronometer chronometer;
    private Button startButton, stopButton, resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chronometer = findViewById(R.id.chronometer);
        startButton = findViewById(R.id.startButton);
        stopButton = findViewById(R.id.stopButton);
        resetButton = findViewById(R.id.resetButton);
    }

    public void startChronometer(View view) {
        chronometer.setBase(SystemClock.elapsedRealtime());
        chronometer.start();
        startButton.setEnabled(false);
        stopButton.setEnabled(true);
    }

    public void stopChronometer(View view) {
        chronometer.stop();
        startButton.setEnabled(true);
        stopButton.setEnabled(false);
    }

    public void resetChronometer(View view) {
        chronometer.stop();
        chronometer.setBase(SystemClock.elapsedRealtime());
        startButton.setEnabled(true);
        stopButton.setEnabled(false);
    }
}