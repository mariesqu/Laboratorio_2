package com.example.laboratorio_2_java;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FinalActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        String message = "Welcome to final activity :-)";
        TextView textView = findViewById(R.id.textView3);
        textView.setText(message);
    }
}
