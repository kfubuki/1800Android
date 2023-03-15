package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    public void btn1(View view){
        TextView output = (TextView) findViewById(R.id.editTextNumber);
        int A = Integer.parseInt(output.getText().toString());


        TextView output2 = (TextView) findViewById(R.id.editTextNumber2);
        int B = Integer.parseInt(output2.getText().toString());

        int X;
        if (A > B)
        {
            X = A;
        }
        else{
            X = B;
        }

        Intent intent = new Intent(this, DisplayStringActivity.class);
        intent.putExtra("userInputtedString",Integer.toString(X));
        startActivity(intent);
    }
}