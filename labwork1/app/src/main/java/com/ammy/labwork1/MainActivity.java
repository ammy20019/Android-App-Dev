package com.ammy.labwork1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display_view;
    EditText num1,num2;
    Button add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display_view = findViewById(R.id.display_txt);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.subtract);
        mul = findViewById(R.id.multiply);
        div = findViewById(R.id.divide);

        //display_reg.setText("Hey, enter you reg no");

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                double sum = n1+n2;
                display_view.setText(Double.toString(sum));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                double sub = n1-n2;
                display_view.setText(Double.toString(sub));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                double mul = n1*n2;
                display_view.setText(Double.toString(mul));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                double div = n1/n2;
                display_view.setText(Double.toString(div));
            }
        });


    }
}