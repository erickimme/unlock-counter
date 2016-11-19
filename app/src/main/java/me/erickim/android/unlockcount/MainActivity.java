package me.erickim.android.unlockcount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // comment test

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UnlockCounter UC = new UnlockCounter((TextView) findViewById(R.id.display_number));
        UnlockCounter DisplayDate = new UnlockCounter((TextView) findViewById(R.id.display_date));
        UnlockCounter DisplayTimeUsed = new UnlockCounter((TextView) findViewById(R.id.display_usedTime));

        // declare & initiz
        Button centerIcon = (Button) findViewById(R.id.bt_centerIcon);  // button to count number
        Button previousDay = (Button) findViewById(R.id.bt_previous);   // button to show previous day count
        Button nextDay = (Button) findViewById(R.id.bt_next);           // button to show next day count
        Button share = (Button) findViewById(R.id.bt_share);            // button to share in facebook

        //Button listener object
        ButtonListener bl = new ButtonListener(UC);

        // center button clicked
        centerIcon.setOnClickListener(bl);
        // number displayer display number when "cetnerIcon" is clicked

        // previous button clicked
        previousDay.setOnClickListener(bl);

        // next button clicked
        nextDay.setOnClickListener(bl);

        // share button clicked
        share.setOnClickListener(bl);
        }
    }
