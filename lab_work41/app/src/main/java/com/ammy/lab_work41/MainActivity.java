package com.ammy.lab_work41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView disp;
    Button fruits,groceries,vegetables;
    ArrayList<String> l_fru,l_veg, l_groc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        disp = findViewById(R.id.disp);
        fruits = findViewById(R.id.fruits);
        groceries = findViewById(R.id.groceries);
        vegetables = findViewById(R.id.vegetables);


        l_fru = new ArrayList<String>();
        l_veg = new ArrayList<String>();
        l_groc = new ArrayList<String>();

        l_fru.add("Cherry");
        l_fru.add("Apple");
        l_fru.add("Orange");
        l_fru.add("Watermelon");

        l_veg.add("Potato");
        l_veg.add("Spinach");
        l_veg.add("Tomato");
        l_veg.add("Mushroom");
        l_veg.add("Egg PLant");

        l_groc.add("Maggie");
        l_groc.add("Chips");
        l_groc.add("Wheat");
        l_groc.add("Chocolate");
        disp.setText("");
        groceries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.setText("");
                for(int i =0; i< 4;i++){
                    disp.append(l_groc.get(i).toString()+"\n");
                }
            }
        });

        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.setText("");
                for(int i =0; i< 4;i++){
                    disp.append(l_fru.get(i).toString()+"\n");
                }
            }
        });
        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.setText("");
                for(int i =0; i< 5;i++){
                    disp.append(l_veg.get(i).toString()+"\n");
                }
            }
        });


    }
}