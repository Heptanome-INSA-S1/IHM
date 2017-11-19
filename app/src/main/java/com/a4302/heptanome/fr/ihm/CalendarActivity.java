package com.a4302.heptanome.fr.ihm;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        HomePageActivity.createListenerBottomMenu(this);

        LinearLayout layout = (LinearLayout)findViewById(R.id.layout_for_event);

        layout.addView(createDay(this,"Monday, 21th November"));

        CustomEvent event1 = new CustomEvent(this, CustomCard.CardType.MUSIC,"TASK: DONE","Guitar Lesson","14h30","At INSA LYON","5");
        CustomEvent event2 = new CustomEvent(this, CustomCard.CardType.SPORT, "TASK: FAILED","Running meeting","17h","At parc tête d'or","6");

        layout.addView(event1);
        layout.addView(event2);

        layout.addView(createDay(this,"Wednesday, 22th November"));

        CustomEvent event3 = new CustomEvent(this, CustomCard.CardType.MUSIC,"TASK: DONE","Guitar Lesson","14h30","At INSA LYON","5");
        CustomEvent event4 = new CustomEvent(this, CustomCard.CardType.SPORT, "TASK: FAILED","Running meeting","17h","At parc tête d'or","6");
        CustomEvent event5 = new CustomEvent(this, CustomCard.CardType.SPORT, "REQUEST: PENDING","Running meeting","17h","At parc tête d'or","6");

        layout.addView(event5);
        //layout.addView(event3);
        //layout.addView(event4);
    }

    public TextView createDay(Context context, String day){

        TextView t = new TextView(context);
        t.setText(day);
        t.setTextSize(20);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(0,10,0,0);
        t.setLayoutParams(params);
        return t;
    }
}
