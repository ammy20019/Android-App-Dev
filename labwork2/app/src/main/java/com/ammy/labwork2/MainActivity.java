package com.ammy.labwork2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText bluetooth,wifi, uno, total;
    Button submit, clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bluetooth = findViewById(R.id.bluetooth);
        wifi= findViewById(R.id.wifi);
        uno = findViewById(R.id.uno);
        total = findViewById(R.id.total);

        clear = findViewById(R.id.clear);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double b1 = Double.parseDouble(bluetooth.getText().toString());
                double b2 = Double.parseDouble(wifi.getText().toString());
                double b3 = Double.parseDouble(uno.getText().toString());
                double c1 = b1*500;
                double c2 = b2*250;
                double c3 = b3*200;
                double t1 = c1+c2+c3;
                total.setText(Double.toString(t1));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bluetooth.getText().clear();
                wifi.getText().clear();
                uno.getText().clear();
                total.getText().clear();
            }
        });
    }
}