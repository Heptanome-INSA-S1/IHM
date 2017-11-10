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
    private LinearLayout ChooseProposeOrRequest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        setContentView(R.layout.home_page);

        ChooseProposeOrRequest =(LinearLayout)findViewById(R.id.choose_propose_or_request);
        findViewById(R.id.floatingActionButton).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(ChooseProposeOrRequest.getVisibility()==View.VISIBLE)
                        ChooseProposeOrRequest.setVisibility(View.GONE);
                    else
                        ChooseProposeOrRequest.setVisibility(View.VISIBLE);
                }
            }
        );
        findViewById(R.id.cancel_request_button).setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   ChooseProposeOrRequest.setVisibility(View.GONE);
               }
           }
        );

        findViewById(R.id.propose_request_button).setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     Intent intent = new Intent(HomePageActivity.this,ChooseService.class);
                     intent.putExtra("request_or_propose","Propose");
                     startActivity(intent);
                 }
             }
        );
        findViewById(R.id.request_request_button).setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     Intent intent = new Intent(HomePageActivity.this,ChooseService.class);
                     intent.putExtra("request_or_propose","Request");
                     startActivity(intent);
                 }
             }
        );
    }

}
