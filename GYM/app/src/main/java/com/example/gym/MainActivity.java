package com.example.gym;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.gym.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView texte_first =(TextView) findViewById(R.id.signin_text);

        texte_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activ2();
            }
        });
        TextView button = (TextView) findViewById(R.id.button_getStarted);
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
        Intent intent = new Intent(this,Secondpage.class);
        startActivity(intent);
    }
}