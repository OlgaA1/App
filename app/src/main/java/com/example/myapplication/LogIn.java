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
    public TextView Info;
    public int counter;
    ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.SignUp);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitycreate_account();
            }
        });

        usernameText = findViewById(R.id.usernameText);
        passwordText = findViewById(R.id.passwordText);
        LogIn = findViewById(R.id.LogIn);
        Info= findViewById(R.id.Info);
        Info.setText("Number of attempts remaining: 5");
        int counter = 5;

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(usernameText.getText().toString(),passwordText.getText().toString());
            }
        });

    }

    public void openActivitycreate_account(){
        Intent intent = new Intent(this, Main_Account.class);
        startActivity(intent);
    }
    
    public void validate (String usernameText, String passwordText){
        if( (usernameText.equals("Bob_cooper")) && (passwordText.equals("computer123")) ) {
            Intent intent = new Intent(LogIn.this, function.class);
            startActivity(intent);
        }else{
            counter--;

            Info.setText("Number of attempts remaining:"+ String.valueOf(counter));


            if (counter == 0){
                LogIn.setEnabled(false);
            }


        }
    }
}

