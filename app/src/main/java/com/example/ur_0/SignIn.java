package com.example.ur_0;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        TextView signup = (TextView)findViewById(R.id.signup);
        signup.setTextColor(Color.rgb(0,255,125));
        signup.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        Button signin_2 = (Button)findViewById(R.id.signin_2);
        signin_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignIn.this,MyAccount.class);
                startActivity(intent);
            }
        });
    }
}
