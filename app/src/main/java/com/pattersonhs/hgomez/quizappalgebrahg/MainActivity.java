package com.pattersonhs.hgomez.quizappalgebrahg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView greeting;
    Button submitButton;
    Button SubmitButton2;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greeting = (TextView) findViewById(R.id.greeting);
        submitButton = (Button) findViewById(R.id.submitButton);
        SubmitButton2 = (Button) findViewById(R.id.submitButton2);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "You got it wrong";
                Toast popUp = Toast.makeText( MainActivity.this,message, Toast.LENGTH_LONG);
                popUp.show();
                if(score > 0)

                {
                    score --;
                }
                Intent intent = new Intent( MainActivity.this, ScoreActivity.class);
                intent.putExtra( "score",score);
                startActivity(intent);



            }
        });

        SubmitButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message2 = "Good Job! you answers is right";
                Toast popUp = Toast.makeText( MainActivity.this, message2, Toast.LENGTH_LONG);
                popUp.show();
                score++;
            }
        });


    }


}
