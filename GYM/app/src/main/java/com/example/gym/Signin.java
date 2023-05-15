package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Signin extends AppCompatActivity {
    EditText text ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        TextView button = (TextView) findViewById(R.id.Sign_in);
        TextView button1 = (TextView) findViewById(R.id.sign_up_button_return);
        text=(EditText)findViewById(R.id.username);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activ3();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activ2();
            }
        });
    }
    public void Activ3() {
        EditText usernameEditText = findViewById(R.id.username);
        String username = usernameEditText.getText().toString();

        // List of registered users
        List<String> registeredUsers = Arrays.asList("Hedi", "Aymen", "Nour");

        if (registeredUsers.contains(username)) {
            Intent intent = new Intent(this, Welcome.class);
            intent.putExtra("myname", username);
            startActivity(intent);
        } else {
            // User is not registered, display a message
            TextView errorTextView = findViewById(R.id.error_message);
            errorTextView.setText("This username is not registered, please sign up.");
        }
    }

    public void Activ2()
    {
        Intent intent = new Intent(this,Fourthpage.class);
        startActivity(intent);
    }
}