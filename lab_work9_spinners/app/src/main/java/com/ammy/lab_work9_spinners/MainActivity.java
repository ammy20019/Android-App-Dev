package com.ammy.lab_work9_spinners;


import android.content.Intent;
import android.widget.AdapterView;
import android.view.View;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

// Main Activity implements Adapter view
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Button submit;
    String country;
    EditText name,pass;
    String[] countries = { "Europe", "India",
            "Spain", "France",
            "Ireland", "Japan" };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        pass = findViewById(R.id.password);
        submit = findViewById(R.id.submit);

        Spinner spin = findViewById(R.id.countryspinner);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item, countries);


        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(ad);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NewActivity.class);
                String name1 = name.getText().toString();
                String pass1 = pass.getText().toString();
                intent.putExtra("NAME",name1);
                intent.putExtra("PASS",pass1);
                intent.putExtra("COUNTRY",country);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(), countries[i], Toast.LENGTH_LONG).show();
        country =countries[i];
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
