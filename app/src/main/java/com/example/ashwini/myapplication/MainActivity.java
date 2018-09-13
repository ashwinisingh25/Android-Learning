package com.example.ashwini.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorWhite));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.relativeV).setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (str.equals("")) {
                    str = "Android is Awesome!";
                }
                ((TextView) findViewById(R.id.textView)).setText(str);
            }
        });

        findViewById(R.id.relativeV).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorBlack));
                findViewById(R.id.relativeV).setBackgroundColor(getResources().getColor(R.color.colorAccent));
                ((TextView) findViewById(R.id.textView)).setText("Hello from Ashwini!");
            }
        });
    }
}
