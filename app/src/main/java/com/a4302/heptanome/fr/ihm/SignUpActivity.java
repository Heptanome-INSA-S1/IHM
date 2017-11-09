package com.a4302.heptanome.fr.ihm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        findViewById(R.id.buttonCancel).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpActivity.this,ConnexionActivity.class));
            }
        });

        findViewById(R.id.buttonSignUpConfirm).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this,HomePageActivity.class);
                intent.putExtra("emailLogin",((EditText) findViewById(R.id.editEmail)).getText().toString());
                startActivity(intent);
            }
        });
    }
}
