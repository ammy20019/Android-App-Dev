package com.ammy.lab_work7_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button blinkBTN, rotateBTN, fadeBTN, moveBTN, slideBTN, zoomBTN, stopBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageview);
        blinkBTN = findViewById(R.id.BTNblink);
        rotateBTN = findViewById(R.id.BTNrotate);
        fadeBTN = findViewById(R.id.BTNfade);
        moveBTN = findViewById(R.id.BTNmove);
        slideBTN = findViewById(R.id.BTNslide);
        zoomBTN = findViewById(R.id.BTNzoom);
        stopBTN = findViewById(R.id.BTNstop);

        Intent intent = new Intent(getApplicationContext(), NewActivity.class);

        blinkBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // To add blink animation
                //Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_animation);
                //imageView.startAnimation(animation);
                intent.putExtra("ARG",1);
                startActivity(intent);

            }
        });

        rotateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // To add rotate animation
                //Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_animation);
                //imageView.startAnimation(animation);
                intent.putExtra("ARG",2);
                startActivity(intent);
            }
        });
        fadeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("ARG",3);
                startActivity(intent);
            }
        });
        moveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("ARG",4);
                startActivity(intent);
            }
        });
        slideBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("ARG",5);
                startActivity(intent);
            }
        });
        zoomBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("ARG",6);
                startActivity(intent);
            }
        });
        stopBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // To stop the animation going on imageview
                imageView.clearAnimation();
            }
        });
    }
}
