package com.pattersonhs.hgomez.quizappalgebrahg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    TextView greeting;
    Button submitButton;
    Button SubmitButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greeting = (TextView) findViewById(R.id.greeting);
        submitButton = (Button) findViewById(R.id.submitButton);
        SubmitButton2 = (Button) findViewById(R.id.submitButton2);


    }


}
