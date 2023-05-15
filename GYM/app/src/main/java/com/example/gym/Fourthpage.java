package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Fourthpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthpage);
        TextView button =(TextView) findViewById(R.id.sign_in_return);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activ2();
            }
        });
        TextView button1 =(TextView) findViewById(R.id.sign_up_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activ3();
            }
        });
    }
    public void Activ2()
    {
        Intent intent = new Intent(this,Signin.class);
        startActivity(intent);
    }
    public void Activ3()
    {
        Intent intent = new Intent(this,Fifthpage.class);
        startActivity(intent);
    }
}