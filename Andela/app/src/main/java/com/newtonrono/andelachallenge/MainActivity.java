package com.newtonrono.andelachallenge;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button about, profile;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressDialog=new ProgressDialog(MainActivity.this);
        about=(Button)findViewById(R.id.about);
        profile=(Button)findViewById(R.id.profile);

        about.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                progressDialog.setMessage("Loading...");
                progressDialog.show();

                Intent intent = new Intent(MainActivity.this,AboutActivity.class);
                progressDialog.dismiss();
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                progressDialog.setMessage("Loading...");
                progressDialog.show();

                Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                progressDialog.dismiss();
                startActivity(intent);
            }
        });


    }
}
