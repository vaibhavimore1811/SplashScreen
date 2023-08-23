package com.vaibhavi.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenGradientBackgroundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_gradient_background);
        initView();
    }
    private void initView() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenGradientBackgroundActivity.this, SecondActivity.class);
                startActivity(intent);
                finish(); // Optional: Close the splash activity after transitioning
            }
        }, 5000); // five sec


    }
}
