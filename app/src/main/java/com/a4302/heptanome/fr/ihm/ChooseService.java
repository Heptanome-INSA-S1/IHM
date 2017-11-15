package com.a4302.heptanome.fr.ihm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ChooseService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_service);
        HomePageActivity.createListenerBottomMenu(this);

        Intent intent = getIntent();
        String ProposeOrRequest = intent.getStringExtra("request_or_propose")+ " a service";
        ((TextView)findViewById(R.id.propose_or_request_text)).setText(ProposeOrRequest);
        findViewById(R.id.button_tools).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseService.this,ProposeToolsSharingActivity.class);
                startActivity(intent);
            }
        });
    }
}
