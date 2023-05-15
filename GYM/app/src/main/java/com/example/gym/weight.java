package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class weight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        TextView button =(TextView) findViewById(R.id.next_weight);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activ2();
            }
        });

    }
    public void Activ2()
    {
        Intent intent = new Intent(this,height.class);
        startActivity(intent);
    }

}