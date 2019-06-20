package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int number;
    private TextView display;
//    Button button = findViewById(R.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.textView);

    }

    public void updateDisplay(View view) {
        display.setText(display.getText().toString() + ((Button) view).getText());
    }

    public void updateDisplayWithOperators(View view) {
        display.setText(display.getText().toString() + " " + ((Button) view).getText() + " ");

    }

    public void evaluate(View view) {
        String input = display.getText().toString();
        String[] arr = input.split(" ");
        for(String item : arr) {
            if(item == )
        }
    }
}
