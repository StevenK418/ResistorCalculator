package com.example.rescalc;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Console;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import kotlin.reflect.KType;

public class MainActivity extends AppCompatActivity
{
    int currentBand = 0;
    long resistorValue = 0;

    TextView display;
    TextView toleranceDisplay;

    //Create a new button object to store selected band reference
    Button selectedBand = null;

    //Create a new collection to store the bands in
    List<Button> bands = new ArrayList<Button>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize references to Text display fields
        display = findViewById(R.id.tvDisplay);
        toleranceDisplay = findViewById(R.id.toleranceDisplay);

        //Populate the bands list with teh band button objects
        //This is done here so for performance as we only want to cache
        // this once rather than running each time in the reset method.
        bands.add(findViewById(R.id.buttonBand1));
        bands.add(findViewById(R.id.buttonBand2));
        bands.add(findViewById(R.id.buttonBand3));
        bands.add(findViewById(R.id.buttonBand4));

        //Call the Reset method to ensure everything's clear and to improve consistency.
        Reset();
    }

    //Band button onClick event handlers
    public void doBand1 (View view)
    {
        currentBand = 1;
        selectedBand = (Button) view;
    }
    public void doBand2 (View view)
    {
        currentBand = 2;
        selectedBand = (Button) view;
    }
    public void doBand3 (View view)
    {
        currentBand = 3;
        selectedBand = (Button) view;
    }
    public void doBand4 (View view)
    {
        currentBand = 4;
        selectedBand = (Button) view;
    }

    //Value button OnClick event handlers
    public void doBlack (View view)
    {
        if (currentBand == 1)
        {
            resistorValue = 0;
        }
        else if (currentBand == 2)
        {
            resistorValue = resistorValue * 10 + 0;
        }
        else if (currentBand == 3)
        {
            resistorValue = resistorValue * 1;
        }

        //Check if the selected band is initialized and set the colour
        if (selectedBand != null && selectedBand != findViewById(R.id.buttonBand4))
        {
            //Set colour of the selected band to the selected colour
            selectedBand.setBackgroundColor(getColor(R.color.Black));
        }
    }

    public void doBrown (View view)
    {
        if (currentBand == 1)
        {
            resistorValue = 1;
        }
        else if (currentBand == 2)
        {
            resistorValue = resistorValue * 10 + 1;
        }
        else if (currentBand == 3)
        {
            resistorValue = resistorValue * 10;
        }

        //Check if the selected band is initialized and set the colour
        if (selectedBand != null && selectedBand != findViewById(R.id.buttonBand4)) {
            //Set colour of the selected band to the selected colour
            selectedBand.setBackgroundColor(getColor(R.color.Brown));
        }
    }

    public void doRed (View view)
    {
        if (currentBand == 1)
        {
            resistorValue = 2;
        }
        else if (currentBand == 2)
        {
            resistorValue = resistorValue * 10 + 2;
        }
        else if (currentBand == 3)
        {
            resistorValue = resistorValue * 100;
        }

        //Check if the selected band is initialized and set the colour
        if(selectedBand != null && selectedBand != findViewById(R.id.buttonBand4))
        {
            //Set colour of the selected band to the selected colour
            selectedBand.setBackgroundColor(getColor(R.color.Red));
        }

    }

    public void doOrange(View view)
    {
        if (currentBand == 1)
        {
            resistorValue = 3;
        }
        else if (currentBand == 2)
        {
            resistorValue = resistorValue * 10 + 3;
        }
        else if (currentBand == 3)
        {
            resistorValue = resistorValue * 1000;
        }

        //Check if the selected band is initialized and set the colour
        if(selectedBand != null && selectedBand != findViewById(R.id.buttonBand4))
        {
            //Set colour of the selected band to the selected colour
            selectedBand.setBackgroundColor(getColor(R.color.Orange));
        }
    }

    public void doYellow (View view)
    {
        if (currentBand == 1)
        {
            resistorValue = 4;
        }
        else if (currentBand == 2)
        {
            resistorValue = resistorValue * 10 + 4;
        }
        else if (currentBand == 3)
        {
            resistorValue = resistorValue * 10000;
        }

        //Check if the selected band is initialized and set the colour
        if(selectedBand != null && selectedBand != findViewById(R.id.buttonBand4))
        {
            //Set colour of the selected band to the selected colour
            selectedBand.setBackgroundColor(getColor(R.color.Yellow));
        }
    }

    public void doGreen(View view)
    {
        if (currentBand == 1)
        {
            resistorValue = 5;
        }
        else if (currentBand == 2)
        {
            resistorValue = resistorValue * 10 + 5;
        }
        else if (currentBand == 3)
        {
            resistorValue = resistorValue * 100000;
        }

        //Check if the selected band is initialized and set the colour
        if(selectedBand != null && selectedBand != findViewById(R.id.buttonBand4))
        {
            //Set colour of the selected band to the selected colour
            selectedBand .setBackgroundColor(getColor(R.color.Green));
        }
    }

    public void doBlue(View view)
    {
        if (currentBand == 1)
        {
            resistorValue = 6;
        }
        else if (currentBand == 2)
        {
            resistorValue = resistorValue * 10 + 6;
        }
        else if (currentBand == 3)
        {
            resistorValue = resistorValue * 1000000;
        }

        //Check if the selected band is initialized and set the colour
        if(selectedBand  != null && selectedBand != findViewById(R.id.buttonBand4))
        {
            //Set colour of the selected band to the selected colour
            selectedBand .setBackgroundColor(getColor(R.color.Blue));
        }
    }

    public void doPurple(View view)
    {
        if (currentBand == 1)
        {
            resistorValue = 7;
        }
        else if (currentBand == 2)
        {
            resistorValue = resistorValue * 10 + 7;
        }
        else if (currentBand == 3)
        {
            resistorValue = resistorValue * 10000000;
        }
        //Check if the selected band is initialized and set the colour
        if(selectedBand  != null && selectedBand != findViewById(R.id.buttonBand4))
        {
            //Set colour of the selected band to the selected colour
            selectedBand .setBackgroundColor(getColor(R.color.Purple));
        }
    }

    public void doGrey(View view)
    {
        if (currentBand == 1)
        {
            resistorValue = 8;
        }
        else if (currentBand == 2)
        {
            resistorValue = resistorValue * 10 + 8;
        }
        else if (currentBand == 3)
        {
            resistorValue = resistorValue * 100000000;
        }
        //Check if the selected band is initialized and set the colour
        if(selectedBand != null && selectedBand != findViewById(R.id.buttonBand4))
        {
            //Set colour of the selected band to the selected colour
            selectedBand.setBackgroundColor(getColor(R.color.Gray));
        }
    }

    public void doWhite(View view)
    {
        if (currentBand == 1)
        {
            resistorValue = 9;
        }
        else if (currentBand == 2)
        {
            resistorValue = resistorValue * 10 + 9;
        }
        else if (currentBand == 3)
        {
            resistorValue = resistorValue * 1000000000;
        }

        //Check if the selected band is initialized and set the colour
        if(selectedBand != null && selectedBand != findViewById(R.id.buttonBand4))
        {
            //Set colour of the selected band to the selected colour
            selectedBand.setBackgroundColor(getColor(R.color.White));
        }
    }

    public void doGold(View view)
    {
        if (currentBand == 4)
        {
            //Get percentage tolerance
            double result = resistorValue * 0.05;
            resistorValue = resistorValue + (int) result;

            toleranceDisplay.setText(String.format("+/- 0.05" + " \n {0}", result));
        }

        //Check if the selected band is initialized and set the colour
        if(selectedBand != null && selectedBand == findViewById(R.id.buttonBand4))
        {
            //Set colour of the selected band to the selected colour
            selectedBand.setBackgroundColor(getColor(R.color.Gold));
        }
    }

    public void doSilver(View view)
    {
        if (currentBand == 4)
        {
            //Get percentage tolerance
            double result = resistorValue * 0.10;
            resistorValue = resistorValue + (int) result;

            String toleranceResultMessage = String.format(String.format("+/- 0.10" + " \n " + String.valueOf((int)result)));
            toleranceDisplay.setText(toleranceResultMessage);
        }


        //Check if the selected band is initialized and set the colour
        if(selectedBand != null && selectedBand == findViewById(R.id.buttonBand4))
        {
            //Set colour of the selected band to the selected colour
            selectedBand.setBackgroundColor(getColor(R.color.Silver));
        }
    }

    //Function button event handlers
    public void doCalculate (View view)
    {
        display.setText(String.valueOf(resistorValue));
    }

    public void doReset(View view)
    {
        //Reset the state of teh app for new calculations
        Reset();
    }


    //Resets the state of the app prior to new calculations
    public void Reset()
    {
        //Reset the Text result fields
        toleranceDisplay.setText("");
        display.setText("");

        //Reset the stored result
        resistorValue = 0;

        //Iterate through the bands and reset the colour
        for( Button band : bands)
        {
            //Just set bands to Purple for consistency
            band.setBackgroundColor(getColor(R.color.Purple));
        }
    }

    //TODO: This needs further work as it would be a better solution. May be beyond scope of this project.
    //Changes the colour of a given band based on the colour selected
    public void ChangeBandColour(int currentBand, @ColorInt int colorId)
    {
//        //Set colour of the selected band to the selected colour
//        bands.get(currentBand - 1).setBackgroundColor(ContextCompat.getColor(colorId));
    }
}