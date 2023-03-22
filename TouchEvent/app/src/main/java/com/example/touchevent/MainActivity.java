package com.example.touchevent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{

    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = (TextView) findViewById(R.id.lblOutput);
        output.setTextSize(30);
        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.activity_main);
        layout.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int act = event.getAction();
        Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);//震動

        switch (act){
            case MotionEvent.ACTION_DOWN://行動有代碼
                output.setText("ACTION_DOWN");
                output.setTextColor(Color.rgb(205, 96,93));
                //output.setTextColor(Color.parseColor("#CD5C5C"));
                vb.vibrate(2000);//去 manifests取得vibrate允許
                break;
            case MotionEvent.ACTION_UP:
                output.setText("ACTION_UP");
                output.setTextColor(Color.rgb(64,224,208));
                vb.cancel();
                break;
            case MotionEvent.ACTION_MOVE:
                float x = event.getX();
                float y = event.getY();
                output.setText("X = " + x + "Y = " + y);
                output.setTextColor(Color.BLUE);
                break;
        }
        return false;
    }
}