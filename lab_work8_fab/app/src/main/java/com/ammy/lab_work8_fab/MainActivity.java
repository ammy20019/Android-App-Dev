package com.ammy.lab_work8_fab;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    // Make sure to use the FloatingActionButton
    // for all the FABs
    FloatingActionButton mAddFab, mAddAlarmFab, mAddPersonFab;
    TextView disp;

    // These are taken to make visible and invisible along
    // with FABs
    EditText addAlarmActionText, addPersonActionText;

    // to check whether sub FAB buttons are visible or not.
    Boolean isAllFabsVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Register all the FABs with their IDs
        // This FAB button is the Parent
        mAddFab = findViewById(R.id.add_fab);
        // FAB button
        mAddAlarmFab = findViewById(R.id.add_alarm_fab);
        mAddPersonFab = findViewById(R.id.add_person_fab);

        disp = findViewById(R.id.disp);

        // Also register the action name text, of all the FABs.
        addAlarmActionText = findViewById(R.id.add_alarm_action_text);
        addPersonActionText = findViewById(R.id.add_person_action_text);

        // Now set all the FABs and all the action name
        // texts as GONE
        mAddAlarmFab.setVisibility(View.GONE);
        mAddPersonFab.setVisibility(View.GONE);
        addAlarmActionText.setVisibility(View.GONE);
        addPersonActionText.setVisibility(View.GONE);

        // make the boolean variable as false, as all the
        // action name texts and all the sub FABs are invisible
        isAllFabsVisible = false;

        // We will make all the FABs and action name texts
        // visible only when Parent FAB button is clicked So
        // we have to handle the Parent FAB button first, by
        // using setOnClickListener you can see below
        mAddFab.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!isAllFabsVisible) {

                            // when isAllFabsVisible becomes
                            // true make all the action name
                            // texts and FABs VISIBLE.
                            mAddAlarmFab.show();
                            mAddPersonFab.show();
                            addAlarmActionText.setVisibility(View.VISIBLE);
                            addPersonActionText.setVisibility(View.VISIBLE);

                            // make the boolean variable true as
                            // we have set the sub FABs
                            // visibility to GONE
                            isAllFabsVisible = true;
                        } else {

                            // when isAllFabsVisible becomes
                            // true make all the action name
                            // texts and FABs GONE.
                            mAddAlarmFab.hide();
                            mAddPersonFab.hide();
                            addAlarmActionText.setVisibility(View.GONE);
                            addPersonActionText.setVisibility(View.GONE);

                            // make the boolean variable false
                            // as we have set the sub FABs
                            // visibility to GONE
                            isAllFabsVisible = false;
                        }
                    }
                });

        // below is the sample action to handle add person
        // FAB. Here it shows simple Toast msg. The Toast
        // will be shown only when they are visible and only
        // when user clicks on them
        mAddPersonFab.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       String str = addPersonActionText.getText().toString();
                       disp.setText(str);

                    }
                });

        // below is the sample action to handle add alarm
        // FAB. Here it shows simple Toast msg The Toast
        // will be shown only when they are visible and only
        // when user clicks on them
        mAddAlarmFab.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String str = addAlarmActionText.getText().toString();
                        disp.setText(str);
                    }
                });
    }
}
