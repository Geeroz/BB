package com.example.bb;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTouched(View view) {
        Log.d("Gump", "Button Touched");

        Button myButton = (Button)view;
        myButton.setText("0");

        regenerateBubble(view);
    }

    public void regenerateBubble(final View view) {
        new CountDownTimer(3000, 1000) {
            public void onTick(long millisUntilFinished) {
                Log.d("Gump", "Seconds remaining: " + millisUntilFinished / 1000);
            }
            public void onFinish() {
                Button myButton = (Button)view;
                myButton.setText("1");
            }
        }.start();
    }

}
