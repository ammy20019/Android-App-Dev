package com.ammy.lab_work5_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    EditText no_of_el, elements;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        no_of_el = findViewById(R.id.no_of_el);
        elements = findViewById(R.id.elements);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(no_of_el.getText().toString());
                String str = elements.getText().toString();
                int listOfElements[] = new int[n];
                StringTokenizer st = new StringTokenizer(str);
                for (int i =0; i<n;i++) {
                    listOfElements[i] = Integer.parseInt(st.nextToken().toString());
                }
                int max = 0;
                for (int i = 0; i < n; i++) {
                    if(listOfElements[i] > max)
                        max = listOfElements[i];
                }
                Intent intent = new
                        Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("MAX"," Maximum Value = "+max);
                startActivity(intent);
            }
        });
    }
}