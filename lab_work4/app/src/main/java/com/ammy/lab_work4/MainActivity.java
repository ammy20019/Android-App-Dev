package com.ammy.lab_work4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText pass,user;
    TextView display;

    ArrayList<String> validUsers;
    ArrayList<String> validPasswords;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        user = findViewById(R.id.editText);
        pass = findViewById(R.id.editText2);
        display = findViewById(R.id.disp);

        validUsers = new ArrayList();
        validPasswords = new ArrayList();

        validUsers.add("user1");
        validUsers.add("user2");
        validUsers.add("user3");
        validUsers.add("user4");
        validUsers.add("user5");

        validPasswords.add("password1");
        validPasswords.add("password2");
        validPasswords.add("password3");
        validPasswords.add("password4");
        validPasswords.add("password5");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String username = user.getText().toString();
//                String password = pass.getText().toString();
                String str = null;
                for( int i =0 ; i<5;i++){
                    if(Objects.equals(user.getText().toString(), validUsers.get(i).toString()) && Objects.equals(pass.getText().toString(),validPasswords.get(i).toString()))
                    {
                        str= "Welcome! User";
                        break;
                    }else
                    {
                        str= "Incorrect Details";
                    }
                }
                display.setText(str.toString());

            }
        });
    }
}