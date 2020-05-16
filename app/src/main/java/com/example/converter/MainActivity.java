package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button MtoK = (Button) findViewById(R.id.MtoK);
        MtoK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText EditTextMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText EditTextKm = (EditText) findViewById(R.id.editTextKm);
                double VMiles = Double.valueOf(EditTextMiles.getText().toString());
                double vKM = VMiles/0.62137;
                DecimalFormat formatVal = new DecimalFormat ("##.##");
                EditTextKm.setText(formatVal.format(vKM));
            }
        });

        Button KmtoM = (Button) findViewById(R.id.KmtoM);
        KmtoM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText EditTextMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText EditTextKm = (EditText) findViewById(R.id.editTextKm);
                double vKM = Double.valueOf(EditTextKm.getText().toString());
                double  VMiles = vKM * 0.62137;
                DecimalFormat formatVal = new DecimalFormat ("##.##");
                EditTextMiles.setText(formatVal.format(VMiles));

            }
        });

    }
}
