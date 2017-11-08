package com.a4302.heptanome.fr.ihm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ConnexionActivity extends AppCompatActivity {

    private Button bSignUp;
    //private Button bSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        bSignUp = (Button) findViewById(R.id.buttonSignUp);
        bSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ConnexionActivity.this.startActivity(new Intent(ConnexionActivity.this,SignUpActivity.class));
            }
        });
        /*
        bSignIn = (Button) findViewById(R.id.buttonSignIn);
        bSignIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConnexionActivity.this,HomePageActivity.class);
                intent.putExtra("emailLogin",((EditText) findViewById(R.id.editEmail)).getText().toString());
                startActivity(intent);
            }
        });
        */


    }

}
