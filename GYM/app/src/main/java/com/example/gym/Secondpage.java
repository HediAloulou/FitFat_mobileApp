package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Secondpage extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        TextView texte_first =(TextView) findViewById(R.id.signin_text);
        TextView button = (TextView)findViewById(R.id.button_getStarted) ;
        texte_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activ2();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
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
        Intent intent = new Intent(this,Thirdpage.class);
        startActivity(intent);
    }
}