package com.ammy.lab_work_6_services;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // declaring objects of Button class
    static int c=0;
    MediaPlayer m1;
    private Button btn1, btn2, btn3, btn4 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        btn1 = (Button) findViewById( R.id.btn1 );
        btn2 = (Button) findViewById( R.id.btn2 );
        btn3 = (Button) findViewById( R.id.btn3 );
        btn4 = (Button) findViewById( R.id.btn4 );


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c!=0) {
                    onPause();
                    Toast.makeText(getApplicationContext(), "Music is On Pause", Toast.LENGTH_LONG).show();
                }m1=MediaPlayer.create(getApplicationContext(), Settings.System.DEFAULT_RINGTONE_URI);
                m1.setLooping(true);
                m1.start();
                Toast.makeText(getApplicationContext(),"Music 1 is Starting",Toast.LENGTH_LONG).show();
                c=1;
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c!=0) {
                    onPause();
                    Toast.makeText(getApplicationContext(), "Music is On Pause", Toast.LENGTH_LONG).show();
                }m1=MediaPlayer.create(getApplicationContext(),Settings.System.DEFAULT_NOTIFICATION_URI);
                m1.setLooping(true);
                m1.start();
                Toast.makeText(getApplicationContext(),"Music 2 is Playing",Toast.LENGTH_LONG).show();
                c=1;
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c!=0) {
                    onPause();
                    Toast.makeText(getApplicationContext(), "Music is On Pause", Toast.LENGTH_LONG).show();
                }m1=MediaPlayer.create(getApplicationContext(),Settings.System.CONTENT_URI);
                m1.setLooping(true);
                m1.start();
                Toast.makeText(getApplicationContext(),"Music 3 is Playing",Toast.LENGTH_LONG).show();
                c=1;
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c!=0) {
                    onPause();
                    // String s=t1.getText()+" "+c;
                    // t1.setText(s);
                    Toast.makeText(getApplicationContext(), "Music is On Pause", Toast.LENGTH_LONG).show();
                }m1= MediaPlayer.create(getApplicationContext(),Settings.System.DEFAULT_ALARM_ALERT_URI);
                m1.setLooping(true);
                m1.start();
                Toast.makeText(getApplicationContext(),"Music 4 is Playing",Toast.LENGTH_LONG).show();
                c=1;
            }
        });
    }
    @Override
    protected void onDestroy()
    {
        Toast.makeText(getApplicationContext(),"Music Service Destroyed",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
    @Override
    protected void onStart() {
        Toast.makeText(getApplicationContext(),"Music Service Started",Toast.LENGTH_LONG).show();
        super.onStart();
    }
    @Override
    protected  void onRestart()
    {
        Toast.makeText(getApplicationContext(),"Music Service Restarted", Toast.LENGTH_LONG).show();
        super.onRestart();
    }
    @Override
    protected  void onPause()
    {
        super.onPause();
        m1.stop();
    }
    @Override
    protected  void onResume()
    {
        Toast.makeText(getApplicationContext(),"Music Service is Resume",Toast.LENGTH_LONG).show();
        super.onResume();
    }
    @Override
    protected void onStop()
    {
        Toast.makeText(getApplicationContext(),"Music Service is Stopped ",Toast.LENGTH_LONG).show();
        super.onStop();
    }
}