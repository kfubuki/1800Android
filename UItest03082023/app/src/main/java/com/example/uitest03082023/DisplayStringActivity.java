package com.example.uitest03082023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayStringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_display_string);

        Intent intent = getIntent();
        String outputString = intent.getStringExtra("userInputtedString");

        TextView showStringTxv = (TextView) findViewById(R.id.textviewShowText);
        showStringTxv.setText(outputString);
    }
}