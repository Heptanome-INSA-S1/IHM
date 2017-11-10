package com.a4302.heptanome.fr.ihm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class ConnexionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        findViewById(R.id.buttonSignUp).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConnexionActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });


        findViewById(R.id.buttonSignIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConnexionActivity.this,HomePageActivity.class);
                intent.putExtra("emailLogin",((EditText) findViewById(R.id.editTextEmail)).getText().toString());
                startActivity(intent);
            }
        });
    }

}
