package com.example.contactrecycleviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Contact o1 = new Contact(1, "8947483749","Ammy");
    Contact o2 = new Contact(1, "8947483749","Roman");
    Contact o3 = new Contact(1, "8947483749","Heisen");
    Contact o4 = new Contact(1, "8947483749","Star");
    Contact o5 = new Contact(1, "8947483749","Gonza");
    Contact o6 = new Contact(1, "8947483749","Thor");
    Contact o7 = new Contact(1, "8947483749","ATG");
    Contact o8 = new Contact(1, "8947483749","Mansi");
    Contact o9 = new Contact(1, "8947483749","Ammy");



    Contact [] contacts = {o1,o2,o3,o4,o5,o6,o7,o8,o9};
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad = new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}