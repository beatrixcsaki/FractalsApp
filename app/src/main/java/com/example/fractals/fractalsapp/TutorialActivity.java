package com.example.fractals.fractalsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class TutorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        TextView helloTextView =  findViewById(R.id.textViewTutorial);
        helloTextView.setMovementMethod(new ScrollingMovementMethod());
    }
}
