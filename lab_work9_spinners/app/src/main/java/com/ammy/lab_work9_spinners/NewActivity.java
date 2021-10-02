package com.ammy.lab_work9_spinners;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class NewActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);
        TextView result1 = (TextView)findViewById(R.id.disp1);
        TextView result2 = (TextView)findViewById(R.id.disp2);
        TextView result3 = (TextView)findViewById(R.id.disp3);
        Intent intent = getIntent();
        String name= (String)intent.getSerializableExtra("NAME");
        String pass = (String)intent.getSerializableExtra("PASS");
        String country = (String)intent.getSerializableExtra("COUNTRY");
        result1.setText(name);
        result2.setText(pass);
        result3.setText(country);
    }
}
