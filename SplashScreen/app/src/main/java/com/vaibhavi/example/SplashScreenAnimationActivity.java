package com.vaibhavi.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenAnimationActivity extends AppCompatActivity {
    TextView txtAppName,txtAppDescription;
    ImageView imgLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView() {
        imgLogo = findViewById(R.id.imgLogo);
        txtAppName = findViewById(R.id.txtAppName);
        txtAppDescription = findViewById(R.id.txtAppDescription);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenAnimationActivity.this, SecondActivity.class);
                startActivity(intent);
                finish(); // Optional: Close the splash activity after transitioning
            }
        }, 5000); // five sec

        //Animations
        Animation topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        Animation bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        //Set animation to elements
        imgLogo.setAnimation(topAnimation);
        txtAppName.setAnimation(bottomAnimation);
        txtAppDescription.setAnimation(bottomAnimation);
    }
}
