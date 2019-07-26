package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    public EditText Username;
    public EditText Password;
    public Button LogIn;
    public Button SignIn;
    public TextView Info;
    public int counter;
    Info.setText("No of attempts remaining: 5");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usernameText = findViewById(R.id.usernameText);
        final EditText passwordText = findViewById(R.id.passwordText);
        Button SignUp = findViewById(R.id.SignUp);
        Button LogIn = findViewById(R.id.LogIn);
        TextView Info= findViewById(R.id.Info)
        int counter = 5;

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(usernameText.getText().toString(),passwordText.getText().toString());
            }
        });

    }
    public void validate (String usernameText, String passwordText){
        if((usernameText=="Bob_cooper")&& (passwordText=="Bcomputer123")) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }else{
            counter--;

            Info.setText("No of attempts remaining:"+ String.valueOf(counter));


            if (counter == 0){
                LogIn.setEnabled(false);
            }


        });
    }
}

