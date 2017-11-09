package com.a4302.heptanome.fr.ihm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by lrouquette on 08/11/2017.
 */

public class HomePageActivity extends AppCompatActivity {
    private LinearLayout ChooseProposeOrrequest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        setContentView(R.layout.home_page);

        ChooseProposeOrrequest=(LinearLayout)findViewById(R.id.choose_purpose_or_request);
        findViewById(R.id.floatingActionButton).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ChooseProposeOrrequest.setVisibility(View.VISIBLE);
                }
            }
        );
        findViewById(R.id.cancel_request_button).setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   ChooseProposeOrrequest.setVisibility(View.GONE);
               }
           }
        );
    }

}
