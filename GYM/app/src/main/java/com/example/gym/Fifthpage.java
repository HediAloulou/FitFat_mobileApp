package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Fifthpage extends AppCompatActivity {

    private Button womanButton;
    private Button manButton;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthpage);

        womanButton = findViewById(R.id.woman);
        manButton = findViewById(R.id.man);
        nextButton = findViewById(R.id.next_gender);

        womanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                womanButton.setBackgroundColor(getResources().getColor(R.color.red));
                manButton.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            }
        });

        manButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manButton.setBackgroundColor(getResources().getColor(R.color.red));
                womanButton.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activ2();
            }
        });
    }

    public void Activ2() {
        Intent intent = new Intent(this, weight.class);
        startActivity(intent);
    }
}