package com.example.keybordevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            EditText txtInput = (EditText)findViewById(R.id.txtInput);
            txtInput.setText("按下BACK按鍵");
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        TextView lblOutput = (TextView) findViewById(R.id.lblOutput);
        lblOutput.setText("按鍵碼: " + keyCode);
        return super.onKeyUp(keyCode, event);
    }
}