package com.example.rescalc;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.Console;
import java.util.Dictionary;
import java.util.Hashtable;

public class MainActivity extends AppCompatActivity {
    Dictionary firstDigits = new Hashtable();

    String[] digitColourValues = getResources().getStringArray(R.array.colors);

    Button firstDigitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get a reference to the tens value selection button
        firstDigitButton = findViewById(R.id.tensSelectorBtn);


    }



    public void PopulateFirstDigits()
    {
        for(int i = 0; i < digitColourValues.length; i++)
        {
            firstDigits.put(i, digitColourValues[i]);
        }
    }

    public void tensBtnClick(View view)
    {

        //firstDigitButton.setBackgroundColor(digitColourValues[3]);
    }




}