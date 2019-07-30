package com.example.myapplication;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class function extends AppCompatActivity{
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a);

        button= (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityabs();
            }
        });

        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityback();
            }
        });

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitychest();
            }
        });
    }

    public void openActivityabs(){
        Intent intent = new Intent(this, abs.class);
        startActivity(intent);
    }

    public void openActivityback(){
        Intent intent = new Intent(this, back.class);
        startActivity(intent);
    }

        public void openActivitychest() {
            Intent intent = new Intent(this, chest.class);
            startActivity(intent);

        }


}

