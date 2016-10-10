package com.gbm.bmcnab.choochootime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner_dep = (Spinner) findViewById(R.id.dep_spinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_dep = ArrayAdapter.createFromResource(this,
                R.array.departure, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter_dep.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner_dep.setAdapter(adapter_dep);

        Spinner spinner_arr = (Spinner) findViewById(R.id.arr_spinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_arr = ArrayAdapter.createFromResource(this,
                R.array.arrival, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter_arr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner_arr.setAdapter(adapter_arr);
    }
}
