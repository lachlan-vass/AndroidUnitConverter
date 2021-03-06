package com.lachlanvass.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button metresConvertButton = findViewById(R.id.metresConvert);
        Button kilogramsConvertButton = findViewById(R.id.kilogramConvert);
        Button tempConvertButton = findViewById(R.id.temperatureConvert);

        DecimalFormat df = new DecimalFormat("0.00");

        metresConvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Spinner unitSpinner = findViewById(R.id.unitSpinner);
                String unitSelected = unitSpinner
                        .getSelectedItem()
                        .toString();

                if (!unitSelected.equals("Metres")) {
                    Toast.makeText(getApplicationContext(), "Please Select Metres Dropdown", Toast.LENGTH_SHORT).show();
                    return;
                }

                EditText userInput = findViewById(R.id.userinput);
                TextView outputText1 = findViewById(R.id.output1);
                TextView outputText2 = findViewById(R.id.output2);
                TextView outputText3 = findViewById(R.id.output3);

                String inputText = userInput.getText().toString();
                Double inputDouble = Double.parseDouble(inputText);


                if (unitSelected.equals("Metres")) {

                    MetreConverter metreConverter = new MetreConverter(inputDouble);
                    outputText1.setText(df.format(metreConverter.Centimetre) + "Centimetres" );
                    outputText2.setText(df.format(metreConverter.Foot) + " Foot");
                    outputText3.setText(df.format(metreConverter.Inch) + " Inch");
                }

            }
        });

        kilogramsConvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Spinner unitSpinner = findViewById(R.id.unitSpinner);
                String unitSelected = unitSpinner
                        .getSelectedItem()
                        .toString();

                if (!unitSelected.equals("Kilogram")) {
                    Toast.makeText(getApplicationContext(), "Please Select Kilogram Dropdown", Toast.LENGTH_SHORT).show();
                    return;
                }

                EditText userInput = findViewById(R.id.userinput);
                TextView outputText1 = findViewById(R.id.output1);
                TextView outputText2 = findViewById(R.id.output2);
                TextView outputText3 = findViewById(R.id.output3);

                String inputText = userInput.getText().toString();
                Double inputDouble = Double.parseDouble(inputText);

                if (unitSelected.equals("Kilogram")) {

                    WeightConverter weightConverter = new WeightConverter(inputDouble);
                    outputText1.setText(df.format(weightConverter.Grams) + " Grams");
                    outputText2.setText(df.format(weightConverter.Ounce) + " Ounce(Oz)");
                    outputText3.setText(df.format(weightConverter.Pound) + " Pound(lb)");
                }

            }
        });

        tempConvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Spinner unitSpinner = findViewById(R.id.unitSpinner);
                String unitSelected = unitSpinner
                        .getSelectedItem()
                        .toString();

                if (!unitSelected.equals("Celsius")) {
                    Toast.makeText(getApplicationContext(), "Please Select Celcius Dropdown", Toast.LENGTH_SHORT).show();
                    return;
                }

                EditText userInput = findViewById(R.id.userinput);
                TextView outputText1 = findViewById(R.id.output1);
                TextView outputText2 = findViewById(R.id.output2);
                TextView outputText3 = findViewById(R.id.output3);

                String inputText = userInput.getText().toString();
                Double inputDouble = Double.parseDouble(inputText);

                if (unitSelected.equals("Celsius")) {

                    TemperatureConverter temperatureConverter = new TemperatureConverter(inputDouble);
                    outputText1.setText(df.format(temperatureConverter.Fahrenheit) + " Fahrenheit");
                    outputText2.setText(df.format(temperatureConverter.Kelvin) + " Kelvin");
                    outputText3.setText("");
                }
            }
        });



//        if (unitSelected === "Metres") {
//
//        }
    }

}