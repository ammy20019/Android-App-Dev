package com.ammy.labwork2_currency_converter;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button button;
    EditText input;
    RadioButton currencyradioButton;
    RadioGroup radioGroup;
    TextView converted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);

        input = findViewById(R.id.input);
        converted = findViewById(R.id.converted);
    }
    public void onclickbuttonMethod(View v){
        double b1  = Double.parseDouble(input.getText().toString());
        double dol = b1*0.014;
        double can = b1*0.017;
        double yen = b1*1.50;
        double euro= b1*0.012;

        int selectedId = radioGroup.getCheckedRadioButtonId();
        currencyradioButton = (RadioButton) findViewById(selectedId);
        if(selectedId==-1){
            Toast.makeText(MainActivity.this,"Nothing selected",
            Toast.LENGTH_SHORT).show();
        }
        else {
            if(selectedId==(R.id.radiodollar)){
                converted.setText(Double.toString(dol));
            } else if(selectedId==(R.id.radiocanada)){
                converted.setText(Double.toString(can));
            } else if(selectedId==(R.id.radioyen)){
                converted.setText(Double.toString(yen));
            } else if(selectedId==(R.id.radioeuro)){
                converted.setText(Double.toString(euro));
            }

        }
    }
}