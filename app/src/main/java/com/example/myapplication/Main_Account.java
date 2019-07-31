package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Main_Account extends AppCompatActivity {

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
    }
}
