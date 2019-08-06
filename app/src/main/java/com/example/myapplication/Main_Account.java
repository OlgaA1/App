package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main_Account extends AppCompatActivity {

    public View button;
    public View EditText1;
    public View Username;
    public View Password;
    public View Age;
    public View Weight;
    public View Sex;
    public  View Zipcode;
    public View BMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account);

        EditText textInputName = findViewById(R.id.name_text1);
        EditText textInputUsername = findViewById(R.id.editText2);
        EditText textInputPassword = findViewById(R.id.editText3);
        EditText textInputAge = findViewById(R.id.editText4);
        EditText textiInputWeight = findViewById(R.id.editText5);
        EditText textInputSex = findViewById(R.id.editText6);
        EditText textInputZipcode = findViewById(R.id.editText7);
        EditText textInputBMI = findViewById(R.id.editText8);

        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityfunction();
            }
        });
    }

    public void openActivityfunction() {
        Intent intent = new Intent(this, function.class);
        startActivity(intent);
    }

    public void validate(String NameText, String UsernameText, String PasswordText, String AgeText, String WeightText, String SexText, String ZipcodeText, String BMIText) {
        ((NameText.equals("Bob Cooper")) && (UsernameText.equals("Bob_cooper")) && (PasswordText.equals("computer123")) && (AgeText.equals("22")) && (WeightText.equals("180")) && (SexText.equals("Male")) && (ZipcodeText.equals("78520")) && (BMIText.equals("29.1")));
		
        }
    }



