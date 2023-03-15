package com.example.onclickevent2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private float size = 20;
    private  TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = (TextView)findViewById(R.id.lblOutput);
        output.setTextSize(size);
        Button btnLarger = (Button) findViewById(R.id.button);
        btnLarger.setOnClickListener(this);
        Button btnSmaller = (Button) findViewById(R.id.button2);
        btnSmaller.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.button)
        {
            size++;
        }
        else{
            size--;
        }
        output.setTextSize(size);
    }
}