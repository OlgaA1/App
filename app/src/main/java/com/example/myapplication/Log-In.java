package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class LogIn extends AppCompatActivity {
    public EditText usernameText;
    public EditText  passwordText;
    public Button LogIn;
    public Button SignIn;
    public TextView Info;
    public int counter;
    ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameText = findViewById(R.id.usernameText);
        passwordText = findViewById(R.id.passwordText);
        SignIn = findViewById(R.id.SignUp);
        LogIn = findViewById(R.id.LogIn);
        Info= findViewById(R.id.Info);
        Info.setText("No of attempts remaining: 5");
        int counter = 5;

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(usernameText.getText().toString(),passwordText.getText().toString());
            }
        });

    }
    public void validate (String usernameText, String passwordText){
        if((usernameText=="Bob_cooper")&& (passwordText=="computer123")) {
            Intent intent = new Intent(LogIn.this, SecondActivity.class);
            startActivity(intent);
        }else{
            counter--;

            Info.setText("No of attempts remaining:"+ String.valueOf(counter));


            if (counter == 0){
                LogIn.setEnabled(false);
            }


        }
    }
}

