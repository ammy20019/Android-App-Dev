package com.ammy.lab_work7_animation;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
public class NewActivity extends AppCompatActivity {
    ImageView imageView;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);
        imageView = findViewById(R.id.imageview);

        int n =0;

        Intent intent = getIntent();
        int arg = (int)intent.getSerializableExtra("ARG");

        if(arg ==1){
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_animation);
            imageView.startAnimation(animation);
        } else if(arg ==2){
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_animation);
            imageView.startAnimation(animation);
        } else if(arg ==3){
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_animation);
            imageView.startAnimation(animation);
        } else if(arg ==4){
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_animation);
            imageView.startAnimation(animation);
        } else if(arg ==5){
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_animation);
            imageView.startAnimation(animation);
        } else if(arg ==6){
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_animation);
            imageView.startAnimation(animation);
        }

    }
}
