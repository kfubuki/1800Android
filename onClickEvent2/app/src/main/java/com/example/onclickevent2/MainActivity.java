package com.example.onclickevent2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnLarger = (Button) findViewById(R.id.button);
        btnLarger.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        TextView output = (TextView) findViewById(R.id.lblOutput);
        float size = output.getTextSize();
        output.setTextSize(size+5);
    }
}