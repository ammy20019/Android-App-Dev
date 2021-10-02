package com.ammy.lab_work5_intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        TextView result = (TextView)findViewById(R.id.max_val);
        Intent intent = getIntent();
        String max = (String)intent.getSerializableExtra("MAX");
        result.setText(max);
    }
}
