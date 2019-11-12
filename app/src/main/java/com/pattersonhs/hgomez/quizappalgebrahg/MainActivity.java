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
    Button nextbutton;
    int score;
    Question q1;
    Question q2;
    Question q3;
    Question q4;
    Question q5;

    Question[] questionArray;
    int questionnumbers;
    Question presentq;
    String messege;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greeting = (TextView) findViewById(R.id.greeting);
        submitButton = (Button) findViewById(R.id.submitButton);
        SubmitButton2 = (Button) findViewById(R.id.submitButton2);
        nextbutton  = (Button) findViewById(R.id.next);
        q1=new Question("((2^2)^3)=2^5", false);
        q2=new Question(" -2^3=(-2)^3" , true);
        q3=new Question("30% of x is equal to 0.03x" , false);
        q4=new Question("3^20+3^20+3^20=3^21" , true);
        q5=new Question("1.5x10^-5 is the scientific notation of the number 0.0000015" , false);
        questionArray = new Question[5];
        questionArray[0] = q1;
        questionArray[1] = q2;
        questionArray[2] = q3;
        questionArray[3] = q4;
        questionArray[4] = q5;
        score = 0;

        questionnumbers = 0;
        presentq = q1;


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (presentq.getcorrectAnwers()==true)
                {
                    messege = getString(R.string.GoodMessage);
                    score++;
                }
                else
                {
                    messege =  getString(R.string.BadMessage);

                }

                Toast popUp = Toast.makeText( MainActivity.this,messege, Toast.LENGTH_LONG);
                popUp.show();

//                Intent intent = new Intent( MainActivity.this, ScoreActivity.class);
//                intent.putExtra( "score",score);
//                startActivity(intent);



            }
        });

        SubmitButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (presentq.getcorrectAnwers()==false)
                {
                    messege = getString(R.string.GoodMessage);
                    score++;
                }
                else
                {
                    messege = getString(R.string.BadMessage);
                }

                Toast popUp = Toast.makeText( MainActivity.this, messege, Toast.LENGTH_LONG);
                popUp.show();
                //
            }
        });

        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (questionnumbers>3)
                {
                    Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                    intent.putExtra("score",score);
                    startActivity(intent);
                }
                else
                {
                    questionnumbers++;
                    presentq=questionArray[questionnumbers];
                    greeting.setText(presentq.getQuestionText());
                }

            }
        });
    }


}
