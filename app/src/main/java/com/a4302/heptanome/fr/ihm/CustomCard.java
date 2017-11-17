package com.a4302.heptanome.fr.ihm;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;

/**
 * Created by Thomas Point on 08/11/2017.
 */

public class CustomCard extends LinearLayout {

    TextView cardName;
    TextView cardDescription;
    TextView personName;

    ImageView cardImage;
    ImageView personImage;

    public CustomCard(Context context) {
        super(context);
        init(context);
    }

    public CustomCard(Context context, String cardName, String cardDescription, String personName, CardType type) {
        super(context);
        init(context);
        this.setCardName(cardName);
        this.setCardDescription(cardDescription);
        this.setPersonName(personName);
        this.setCardType(type, context);
    }

    public CustomCard(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public CustomCard(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context,attrs);
    }

    private void init(Context context){
        View.inflate(context, R.layout.card, this);
        setDescendantFocusability(FOCUS_BLOCK_DESCENDANTS);
        cardName = (TextView) findViewById(R.id.cardName);
        cardDescription = (TextView) findViewById(R.id.cardDescription);
        personName = (TextView) findViewById(R.id.personName);
        cardImage = (ImageView) findViewById(R.id.cardImage);
        personImage = (ImageView) findViewById(R.id.personImage);

        //BEGIN SWIPE LISTENENR
        //we will set here a listener who will allow the user to swipe left or swipe right
        //
        //
        //
        //END SWIPE LISTENER
    }

    private void init(Context context, AttributeSet attrs){
        View.inflate(context, R.layout.card, this);
        setDescendantFocusability(FOCUS_BLOCK_DESCENDANTS);
        cardName = (TextView) findViewById(R.id.cardName);
        cardDescription = (TextView) findViewById(R.id.cardDescription);
        personName = (TextView) findViewById(R.id.personName);
        cardImage = (ImageView) findViewById(R.id.cardImage);
        personImage = (ImageView) findViewById(R.id.personImage);

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
                    R.styleable.CustomCard,
                    0, 0);

            String cardName = "";
            String cardDescription = "";
            String personName = "";

            try {
                cardName = a.getString(R.styleable.CustomCard_cardName);
                personName = a.getString(R.styleable.CustomCard_personName);
                cardDescription = a.getString(R.styleable.CustomCard_cardDescription);
            } catch (Exception e) {
                Log.e("CustomCard", "There was an error loading attributes.");
            } finally {
                a.recycle();
            }

            setCardName(cardName);
            setCardDescription(cardDescription);
            setPersonName(personName);
        }

    }

    public void setCardName(String cardName){
        this.cardName.setText(cardName);
    }

    public void setCardDescription(String cardDescription){
        this.cardDescription.setText(cardDescription);
    }

    public void setPersonName(String PersonName){
        this.personName.setText(PersonName);
    }
    public void setCardType(CardType image, Context context){
        this.cardImage.setImageResource(getResources().getIdentifier(image.toString(),"drawable", context.getPackageName()));
    }

    public enum CardType{
        MUSIC("ic_music_note_black_24dp"),
        SCHOOL("ic_school_black_24dp"),
        INFOS("ic_info_outline_black_24dp"),
        SPORT("ic_fitness_center_black_24dp"),
        CAR("ic_directions_car_black_24dp"),
        BYCYCLES("ic_directions_bike_black_24dp"),
        TOOLS("ic_build_black_24dp"),
        PALETTE("ic_color_lens_black_24dp"),
        DRINK("ic_local_bar_black_24dp"),
        PET("ic_pets_black_24dp"),
        REMOVAL("ic_archive_black_24dp"),
        CLEANING("ic_local_laundry_service_black_24dp")
        ;

        private final String text;

        CardType(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }
    //TODO : parameterized cardImage and personImage
}


