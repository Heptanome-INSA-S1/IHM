package com.a4302.heptanome.fr.ihm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        findViewById(R.id.buttonModifyProfil).setOnClickListener(new View.OnClickListener() {
                                                               @Override
                                                               public void onClick(View view) {
                       Intent intent = new Intent(ProfilActivity.this,HomePageActivity.class);
                       startActivity(intent);
                   }
               }
        );
    }
}
