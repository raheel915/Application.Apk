    package com.example.a1stappllication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnlogin,Btnsignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casting binding
        btnlogin=(Button) findViewById(R.id. Loginbtn);
        Btnsignup=(Button) findViewById(R.id. Signupbtn);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity .this, dashboard.class);
                startActivity(intent);


            }
        });

        Btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity .this, Signup.class);
                startActivity(intent);
            }
        });

        }

    }
