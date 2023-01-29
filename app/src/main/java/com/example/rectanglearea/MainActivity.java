package com.example.rectanglearea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText breadthField;
    EditText lengthField;
    TextView resultField;
    Button calculate;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        breadthField = (EditText) findViewById(R.id.editTextNumberDecimal);
        lengthField = (EditText) findViewById(R.id.editTextNumberDecimal1);
        resultField = (TextView) findViewById(R.id.textview5);
        calculate = (Button) findViewById(R.id.button);
        reset = (Button) findViewById(R.id.button2);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                calculate();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });

    }
    public void calculate()
    {
        String s1 = breadthField.getText().toString();
        String s2 = lengthField.getText().toString();
        double breadth = new Double(s1).doubleValue();
        double length = new Double(s2).doubleValue();
        double area = breadth*length;
        //attempted to display messages if one or both fields are not filled but for now it is not working yet research on that later
        if (s1.equals(null)){
            breadthField.setText("Enter the width");
        } else if (s2.equals(null)) {
            lengthField.setText("Enter the length");
        } else if (s2.equals(null) && s1.equals(null)) {
            breadthField.setText("Fill in both the length and width");
        }
        else
            resultField.setText(Double.toString(area));
    }
    public void reset()
    {
        breadthField.setText(Double.toString(0.0));
        lengthField.setText(Double.toString(0.0));
        resultField.setText(Double.toString(0.0));
    }
}