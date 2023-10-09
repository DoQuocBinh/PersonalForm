package com.example.personalform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Integer> yod = new ArrayList<>();
        yod.add(1990); yod.add(1991); yod.add((1992));

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout.
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this,
                android.R.layout.simple_spinner_item, yod);
        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner.
        spinner.setAdapter(adapter);

        Button okButton = findViewById(R.id.button);
        RadioButton maleRadio = findViewById(R.id.radioButton);
        RadioButton femaleRadio = findViewById(R.id.radioButton2);
        Spinner spinner1 = findViewById(R.id.spinner);
        RadioGroup genderRadioGroup = findViewById(R.id.genderRadioGroup);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int selectGenderId = genderRadioGroup.getCheckedRadioButtonId();
               RadioButton selectedGender= findViewById(selectGenderId);
                Integer yod = (Integer) spinner1.getSelectedItem();
                Toast.makeText(getApplication(),"You are " + selectedGender.getText()
                        + yod,
                        Toast.LENGTH_LONG).show();


            }
        });

    }
}