package com.example.samplestudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addClick(View v) {
        EditText number1 = findViewById(R.id.editTextTextPersonName);
        EditText number2 = findViewById(R.id.editTextTextPersonName2);
        TextView result = findViewById(R.id.textView3);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1 + n2));
    }

    public void substractClick(View v) {
        EditText number1 = findViewById(R.id.editTextTextPersonName);
        EditText number2 = findViewById(R.id.editTextTextPersonName2);
        TextView result = findViewById(R.id.textView3);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1 - n2));
    }

    public void multplyClick(View v) {
        EditText number1 = findViewById(R.id.editTextTextPersonName);
        EditText number2 = findViewById(R.id.editTextTextPersonName2);
        TextView result = findViewById(R.id.textView3);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1 * n2));
    }
    public void divideClick(View v){
        EditText number1 = findViewById(R.id.editTextTextPersonName);
        EditText number2 = findViewById(R.id.editTextTextPersonName2);
        TextView result = findViewById(R.id.textView3);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1 + n2));
    }
}