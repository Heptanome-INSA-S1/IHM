package com.a4302.heptanome.fr.ihm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        HomePageActivity.createListenerBottomMenu(this);

        LinearLayout layout = (LinearLayout)findViewById(R.id.layout_for_event);
        CustomEvent event1 = new CustomEvent(this,"TASK: DONE","Guitar Lesson","14h30","At INSA LYON","5");
        CustomEvent event2 = new CustomEvent(this,"TASK: FAILED","Running meeting","17h","At parc tête d'or","6");

        layout.addView(event1);
        layout.addView(event2);
    }
}
