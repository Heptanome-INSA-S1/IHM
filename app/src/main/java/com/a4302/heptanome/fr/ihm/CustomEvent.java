package com.a4302.heptanome.fr.ihm;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Thomas Point on 08/11/2017.
 */

public class CustomEvent extends LinearLayout {

    TextView state;
    TextView title;
    TextView dateAndTime;
    TextView location;
    TextView userMoney;
    ImageView eventImage;

    public CustomEvent(Context context) {
        super(context);
        init(context);
    }

    public CustomEvent(Context context, CustomCard.CardType cardType, String state, String title, String dateAndTime, String location, String userMoney) {
        super(context);
        init(context);
        this.setState(state);
        this.setDateAndTime(dateAndTime);
        this.setLocation(location);
        this.setTitle(title);
        this.setUserMoney(userMoney);
        this.setEventType(cardType,context);
    }

    public CustomEvent(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public CustomEvent(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context,attrs);
    }

    private void init(Context context){
        View.inflate(context, R.layout.custom_event, this);
        setDescendantFocusability(FOCUS_BLOCK_DESCENDANTS);
        state = (TextView) findViewById(R.id.state);
        dateAndTime = (TextView) findViewById(R.id.dateAndTime);
        location = (TextView) findViewById(R.id.location);
        title = (TextView) findViewById(R.id.title);
        userMoney = (TextView) findViewById(R.id.userMoney);
        eventImage = (ImageView) findViewById(R.id.eventImage);
        //BEGIN SWIPE LISTENENR
        //we will set here a listener who will allow the user to swipe left or swipe right
        //
        //
        //
        //END SWIPE LISTENER
    }

    private void init(Context context, AttributeSet attrs){
        View.inflate(context, R.layout.custom_event, this);
        setDescendantFocusability(FOCUS_BLOCK_DESCENDANTS);
        state = (TextView) findViewById(R.id.state);
        dateAndTime = (TextView) findViewById(R.id.dateAndTime);
        location = (TextView) findViewById(R.id.location);
        title = (TextView) findViewById(R.id.title);
        userMoney = (TextView) findViewById(R.id.userMoney);
        eventImage = (ImageView) findViewById(R.id.eventImage);

        //BEGIN SWIPE LISTENENR
        //we will set here a listener who will allow the user to swipe left or swipe right
        //
        //
        //
        //END SWIPE LISTENER

        //Parse and assign custom attributes
        if (attrs != null) {
            TypedArray a = context.getTheme().obtainStyledAttributes(
                    attrs,
                    R.styleable.CustomEvent,
                    0, 0);

            String state = "";
            String dateAndTime = "";
            String location = "";
            String title = "";
            String userMoney = "";

            try {
                state = a.getString(R.styleable.CustomEvent_state);
                dateAndTime = a.getString(R.styleable.CustomEvent_dateAndTime);
                location = a.getString(R.styleable.CustomEvent_location);
                title = a.getString(R.styleable.CustomEvent_title);
                userMoney = a.getString(R.styleable.CustomEvent_userMoney);
            } catch (Exception e) {
                Log.e("CustomCard", "There was an error loading attributes.");
            } finally {
                a.recycle();
            }

            setState(state);
            setDateAndTime(dateAndTime);
            setLocation(location);
            setTitle(title);
            setUserMoney(userMoney);


        }

    }

    public void setState(String state){
        this.state.setText(state);
        String color = "gray";
        switch (state){
            case "TASK: DONE":
                color="green";
                break;
            case "TASK: FAILED":
                color="red";
                break;
            case "TASK: TODO":
                color="yellow";
                break;
            case "REQUEST: CLOSED":
                color="BLUE";
                break;
            case "REQUEST: PENDING":
                color="yellow";
                break;
        }
        this.state.setBackgroundColor(Color.parseColor(color));
    }
    public void setEventType(CustomCard.CardType image, Context context){
        this.eventImage.setImageResource(getResources().getIdentifier(image.toString(),"drawable", context.getPackageName()));
    }


    public void setDateAndTime(String dateAndTime){
        this.dateAndTime.setText(dateAndTime);
    }

    public void setLocation(String location){
        this.location.setText(location);
    }

    public void setTitle(String title){
        this.title.setText(title);
    }
    public void setUserMoney(String userMoney){
        this.userMoney.setText(userMoney);
    }

    //TODO : parameterized cardImage and personImage


}
