package com.pattersonhs.hgomez.quizappalgebrahg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ScoreActivity extends AppCompatActivity {

    TextView scoreTV;
    EditText usernameET;
    Button sendBT;
    Button RestartBT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        scoreTV = (TextView) findViewById(R.id.FinalScore);
        usernameET = (EditText) findViewById(R.id.UserName);
        sendBT = (Button) findViewById(R.id.UserNameSend);
        RestartBT = (Button) findViewById(R.id.Restart);




        final int score = getIntent().getIntExtra( "score",0);
        scoreTV.setText( " "+ score+ " "+ getString(R.string.CorrectQuestions) + " 5");


        sendBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("message");

                String UserName= usernameET.getEditableText().toString();

                HScore Score = new HScore(UserName,score);

                myRef.setValue(score);
            }
        });



    }
}
