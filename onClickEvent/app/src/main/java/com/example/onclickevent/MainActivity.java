package com.example.onclickevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener, View.OnLongClickListener{
    private float original_size = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnLarger = (Button) findViewById(R.id.button);
        btnLarger.setOnClickListener(this);
        btnLarger.setOnLongClickListener(this);
    }
    @Override
    public void onClick(View v){
        TextView output = (TextView) findViewById(R.id.lblOutput);
        float size = output.getTextSize();
        output.setTextSize(size+5);
    }

    @Override
    public boolean onLongClick(View v) {
        TextView output = (TextView) findViewById(R.id.lblOutput);
        output.setTextSize(original_size);
        return true;
    }
}