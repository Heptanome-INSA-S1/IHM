package com.a4302.heptanome.fr.ihm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ConnexionActivity extends AppCompatActivity {

    private Button bSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_filter_bar);

        bSignIn = (Button) findViewById(R.id.buttonSignIn);
        bSignIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_sign_in);
            }
        });


    }

}
