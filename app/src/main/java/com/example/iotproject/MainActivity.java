package com.example.iotproject;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.in_training);

        ImageView imageView = findViewById(R.id.imageView);
        String mode = "pushdown"; // Change this value to "pushdown" if you want to display the "pushdown" drawable
        ProgressBar simpleProgressBar = findViewById(R.id.simpleProgressBar);
        TextView progressTextView = findViewById(R.id.progressTextView);

        int progress = 20;
        int max = 30;

        simpleProgressBar.setProgress(progress);
        simpleProgressBar.setMax(max);


        String progressText = "Set " + progress + " out of " + max;
        progressTextView.setText(progressText);


        if (mode.equals("pushup")) {
            imageView.setImageResource(R.drawable.pushup);
        } else if (mode.equals("pushdown")) {
            imageView.setImageResource(R.drawable.pushdown);
        }
    }

}