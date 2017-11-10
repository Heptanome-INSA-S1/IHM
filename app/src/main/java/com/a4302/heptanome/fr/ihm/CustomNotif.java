package com.a4302.heptanome.fr.ihm;

import android.content.Context;
import android.content.res.TypedArray;
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

public class CustomNotif extends LinearLayout {

    TextView requestOrProposal;
    TextView personName;
    TextView date;
    TextView description;

    TextView buttonAccept;
    TextView buttonRefuse;
    TextView buttonContact;

    LinearLayout buttonsRequest;
    LinearLayout buttonsPropose;

    ImageView personImage;

    public CustomNotif(Context context) {
        super(context);
        init(context);
    }

    public CustomNotif(Context context, String requestOrProposal, String personName, String date, String description) {
        super(context);
        init(context);
        this.setRequestOrProposal(requestOrProposal);
        this.setPersonName(personName);
        this.setDate(date);
        this.setDescription(description);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ViewGroup)view.getParent().getParent().getParent().getParent()).removeAllViews();
            }
        };
        findViewById(R.id.buttonAccept).setOnClickListener(listener);
        findViewById(R.id.buttonRefuse).setOnClickListener(listener);
        findViewById(R.id.buttonContact).setOnClickListener(listener);
    }

    public CustomNotif(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public CustomNotif(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context,attrs);
    }

    private void init(Context context){
        View.inflate(context, R.layout.custom_notif, this);
        setDescendantFocusability(FOCUS_BLOCK_DESCENDANTS);
        requestOrProposal = (TextView) findViewById(R.id.request_or_proposal);
        description = (TextView) findViewById(R.id.notif_description);
        personName = (TextView) findViewById(R.id.person_name);
        date = (TextView) findViewById(R.id.date);

        personImage = (ImageView) findViewById(R.id.person_image);

        buttonAccept= (TextView)findViewById(R.id.buttonAccept);
        buttonRefuse= (TextView)findViewById(R.id.buttonRefuse);
        buttonContact= (TextView)findViewById(R.id.buttonContact);

        buttonsRequest = (LinearLayout)findViewById(R.id.layout_for_request);
        buttonsPropose = (LinearLayout)findViewById(R.id.layout_for_propose);

        //BEGIN SWIPE LISTENENR
        //we will set here a listener who will allow the user to swipe left or swipe right
        //
        //
        //
        //END SWIPE LISTENER
    }

    private void init(Context context, AttributeSet attrs){
        View.inflate(context, R.layout.custom_notif, this);
        setDescendantFocusability(FOCUS_BLOCK_DESCENDANTS);
        requestOrProposal = (TextView) findViewById(R.id.request_or_proposal);
        description = (TextView) findViewById(R.id.notif_description);
        personName = (TextView) findViewById(R.id.person_name);
        date = (TextView) findViewById(R.id.date);
        personImage = (ImageView) findViewById(R.id.person_image);

        buttonAccept= (TextView)findViewById(R.id.buttonAccept);
        buttonRefuse= (TextView)findViewById(R.id.buttonRefuse);
        buttonContact= (TextView)findViewById(R.id.buttonContact);

        buttonsRequest = (LinearLayout)findViewById(R.id.layout_for_request);
        buttonsPropose = (LinearLayout)findViewById(R.id.layout_for_propose);

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
                    R.styleable.CustomNotif,
                    0, 0);

            String requestOrProposal = "";
            String notifDescription = "";
            String personName = "";
            String date = "";

            try {
                requestOrProposal = a.getString(R.styleable.CustomNotif_request_or_proposal);
                personName = a.getString(R.styleable.CustomNotif_person_name);
                notifDescription = a.getString(R.styleable.CustomNotif_description);
                date = a.getString(R.styleable.CustomNotif_date);
            } catch (Exception e) {
                Log.e("CustomCard", "There was an error loading attributes.");
            } finally {
                a.recycle();
            }

            setRequestOrProposal(requestOrProposal);
            setDate(date);
            setPersonName(personName);
            setDescription(notifDescription);


        }

    }

    public void setRequestOrProposal(String RequestOrProposal){
        this.requestOrProposal.setText(RequestOrProposal);
        if(RequestOrProposal.equals("Request"))
            this.buttonsPropose.setVisibility(GONE);
        else if (RequestOrProposal.equals("Propose"))
            this.buttonsRequest.setVisibility(GONE);
    }

    public void setDate(String date){
        this.date.setText(date);
    }

    public void setPersonName(String PersonName){
        this.personName.setText(PersonName);
    }

    public void setDescription(String description){
        this.description.setText(description);
    }

    //TODO : parameterized cardImage and personImage


}
