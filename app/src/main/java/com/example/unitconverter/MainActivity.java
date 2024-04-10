package com.example.unitconverter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText value;
    Button convert;
    TextView result;
    String valueToChange;
    double dollars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        value = findViewById(R.id.editText);
        convert = findViewById(R.id.button);
        result = findViewById(R.id.textView);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueToChange = value.getText().toString();
                dollars = Double.parseDouble(valueToChange);
                double rupees = unitconverter(dollars);
                result.setText(""+rupees);
            }
        });



    }

    public double unitconverter(double a){
        return a*100;
    }
}