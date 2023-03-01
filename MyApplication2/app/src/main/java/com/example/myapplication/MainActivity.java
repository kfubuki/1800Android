package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
    }

    public void btn1(View view){
        int count;
        TextView output = (TextView) findViewById(R.id.OutPut);
        count = Integer.parseInt(output.getText().toString());
        count++;
        output.setText(Integer.toString(count));
    }

    public void btn3(View view){
        int count;
        TextView output = (TextView) findViewById(R.id.OutPut);
        count = Integer.parseInt(output.getText().toString());
        count--;
        output.setText(Integer.toString(count));
    }

    public void btn2(View view){
        TextView output = (TextView) findViewById(R.id.OutPut);
        output.setText("000000000000000000");
    }
}