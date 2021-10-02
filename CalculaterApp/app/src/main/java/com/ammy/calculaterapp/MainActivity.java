package com.ammy.calculaterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    Button btnadd,btnsub,btnequals,btnmul,btndiv,btnC;
    boolean cAddition, cSubtract, cMultiplication, cDivision;
    EditText edt;
    float mValueOne, mValueTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 =(Button) findViewById(R.id.button0);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);

        btnadd = (Button) findViewById(R.id.buttonadd);
        btnmul = (Button) findViewById(R.id.buttonmul);
        btndiv = (Button) findViewById(R.id.buttondiv);
        btnsub = (Button) findViewById(R.id.buttonsub);

        btnC = (Button) findViewById(R.id.buttonC);
        btnequals = (Button) findViewById(R.id.buttonequals);
        edt = (EditText) findViewById(R.id.edt1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText() + "0");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt == null) {
                    edt.setText("");
                } else {
                    mValueOne = Float.parseFloat(edt.getText() + "");
                    cAddition = true;
                    edt.setText(null);
                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt.getText() + "");
                cSubtract = true;
                edt.setText(null);
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt.getText() + "");
                cMultiplication = true;
                edt.setText(null);
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt.getText() + "");
                cDivision = true;
                edt.setText(null);
            }
        });

        btnequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edt.getText() + "");

                if (cAddition == true) {
                    edt.setText(mValueOne + mValueTwo + "");
                    cAddition = false;
                }

                if (cSubtract == true) {
                    edt.setText(mValueOne - mValueTwo + "");
                    cSubtract = false;
                }

                if (cMultiplication == true) {
                    edt.setText(mValueOne * mValueTwo + "");
                    cMultiplication = false;
                }

                if (cDivision == true) {
                    edt.setText(mValueOne / mValueTwo + "");
                    cDivision = false;
                }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText("");
            }
        });


    }
}