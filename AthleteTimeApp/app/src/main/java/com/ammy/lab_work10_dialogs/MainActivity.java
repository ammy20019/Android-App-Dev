package com.ammy.lab_work10_dialogs;
import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener,TimePickerDialog.OnTimeSetListener {
    Button date,s1,s2,e1,e2,submit;
    int y,m,d,y1,m1,d1;
    int hour11,minute11;
    int myday, myMonth, myYear;
    int p1starthr,p1startmin, p1endhr, p1endmin, p2starthr,p2startmin, p2endmin,p2endhr;
    TextView output,date_disp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        date=findViewById(R.id.date);
        s1=findViewById(R.id.btnstart1);
        s2=findViewById(R.id.btnstart2);
        e1=findViewById(R.id.btnend1);
        e2=findViewById(R.id.btnend2);
        submit=findViewById(R.id.submit);
        output = findViewById(R.id.output);

        date_disp = findViewById(R.id.date_disp);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar c1=Calendar.getInstance();
                y=c1.get(Calendar.YEAR);
                m=c1.get(Calendar.MONTH);
                d=c1.get(Calendar.DATE);
                DatePickerDialog  date=new DatePickerDialog(MainActivity.this,MainActivity.this,y,m,d);
                date.show();
                date_disp.setText(d+" - "+m+" - "+y);

            }
        });


        s1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this,
                        new TimePickerDialog.OnTimeSetListener() {

                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay,
                                                  int minute) {

                                p1starthr = hourOfDay;
                                p1startmin = minute;
                               // output.setText(hourOfDay + ":" + minute);
                            }
                        }, hour11, minute11, false);
                timePickerDialog.show();
            }
        });

        s2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this,
                        new TimePickerDialog.OnTimeSetListener() {

                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay,
                                                  int minute) {

                                p2starthr = hourOfDay;
                                p2startmin = minute;
                                //output.setText(hourOfDay + ":" + minute);
                            }
                        }, hour11, minute11, false);
                timePickerDialog.show();
            }
        });

        e1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this,
                        new TimePickerDialog.OnTimeSetListener() {

                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay,
                                                  int minute) {

                                p1endhr = hourOfDay;
                                p1endmin = minute;
                                //output.setText(hourOfDay + ":" + minute);
                            }
                        }, hour11, minute11, false);
                timePickerDialog.show();
            }
        });

        e2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this,
                        new TimePickerDialog.OnTimeSetListener() {

                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay,
                                                  int minute) {

                                p2endhr = hourOfDay;
                                p2endmin = minute;
                                //output.setText(hourOfDay + ":" + minute);
                            }
                        }, hour11, minute11, false);
                timePickerDialog.show();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int p1timehr = p1endhr-p1starthr;
                int p1timemin = p1endmin-p1startmin;

                int p2timehr = p2endhr-p2starthr;
                int p2timemin = p2endmin-p2startmin;

                String win =" ";
                if(p1timehr<=p2timehr){
                    if(p1timemin<p2timemin) {
                        win = "Player 1 Wins the Race";
                    }
                    else{
                        win="Player 2 Wins the Race";
                    }
                } else if(p2timehr<=p1timehr){
                    if(p2timemin<p1timemin)
                        win="Player 2 Wins the Race";
                    else
                        win="Player 1 Wins the Race";
                }
                output.setText(win);
            }
        });


    }
    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {
        myYear = year;
        myday = day;
        myMonth = month;
        Calendar c = Calendar.getInstance();
        //output.setText("Year "+myYear+ "\n" + "Month: " + myMonth + "\n" +  "Day: " +myday);

    }
    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1) {

    }
}