package com.a4302.heptanome.fr.ihm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    private Button bCancel;
    //private Button bSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        bCancel = (Button) findViewById(R.id.buttonCancel);
        bCancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpActivity.this,ConnexionActivity.class));
            }
        });
        /*
        bSignUp = (Button) findViewById(R.id.buttonSignUpConfirm);
        bSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this,HomePageActivity.class);
                intent.putExtra("emailLogin",((EditText) findViewById(R.id.editEmail)).getText().toString());
                startActivity(intent);
            }
        });
        */
    }
}
