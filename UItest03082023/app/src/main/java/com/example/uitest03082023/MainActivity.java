package com.example.uitest03082023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
    }

    public void sendString(View view){
        Intent intent = new Intent(this, DisplayStringActivity.class);
        EditText someTextEditText = (EditText) findViewById(R.id.editTextTextPersonName);
        String string25end = someTextEditText.getText().toString();
        intent.putExtra("userInputtedString",string25end);
        startActivity(intent);
    }
}