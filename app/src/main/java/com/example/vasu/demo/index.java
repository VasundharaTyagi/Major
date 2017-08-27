package com.example.vasu.demo;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        Button btnSignUp = (Button)findViewById(R.id.signup);
        Button btnlogin = (Button)findViewById(R.id.login);

        btnSignUp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intentSignup=new Intent(index.this,MainActivity.class);
                startActivity(intentSignup);
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intentLogin=new Intent(index.this,ActivityLogin.class);
                startActivity(intentLogin);
            }
        });
    }
}
