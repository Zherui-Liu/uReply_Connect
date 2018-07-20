package com.example.ur_0;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final TextView signup = (TextView)findViewById(R.id.signup);
        signup.setTextColor(Color.rgb(0,255,125));
        signup.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        Button signin = (Button)findViewById(R.id.signin);
        signin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(login.this, SignIn.class);
                startActivity(intent);
            }
        });


    }
}
