package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView text ;
        setContentView(R.layout.activity_welcome);
        text=(TextView) findViewById(R.id.username_welcome);
        String name = getIntent().getStringExtra("myname");
        text.setText(name);
        TextView button = (TextView)findViewById(R.id.advice) ;
        TextView button2=(TextView)findViewById(R.id.chat);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activ2();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activc();
            }
        });

    }
    public void Activ2()
    {
        Intent intent = new Intent(this,Advice.class);
        startActivity(intent);
    }
    public void Activc (){
        Intent intentc =new Intent(this,ClientActivity.class);
    startActivity(intentc);
    }
}