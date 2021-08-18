package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String arr[] = {"Buggati","Chevrolet","Lamborghini","Mustang","Bentley","Audi R8"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        //using built in array adapter
//        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
//        listView.setAdapter(ad);

        //using our custom adapter
        AmmyAdapter ad = new AmmyAdapter(this,R.layout.my_ammy_layout,arr );
        listView.setAdapter(ad);
    }
}